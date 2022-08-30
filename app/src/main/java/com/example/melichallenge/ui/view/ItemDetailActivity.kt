package com.example.melichallenge.ui.view

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.melichallenge.R
import com.example.melichallenge.ui.viewModel.ItemDetailViewModel
import com.squareup.picasso.Picasso
import org.json.JSONArray
import org.json.JSONObject
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.melichallenge.databinding.ActivityItemDetailBinding

class ItemDetailActivity : AppCompatActivity() {

    private val adapter = CustomAdapterPictures()
    private lateinit var binding:ActivityItemDetailBinding
    private val viewModel: ItemDetailViewModel by viewModel()
    var item: JSONObject? = null

    var progressDialog: ProgressDialog? = null
    private var textViewCondition: TextView?=null
    private var textViewTitle: TextView?=null
    //private var imageView1: ImageView?=null
    //private var imageView2: ImageView?=null
    //private var imageView3: ImageView?=null
    private var textViewPrice: TextView?=null
    private var textViewShipping: TextView?=null
    private var textViewQuantity: TextView?=null
    private var textViewDetail: TextView?=null
    private var recyclerViewImagenes: RecyclerView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        binding = ActivityItemDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //obtengo el id del item
        val idItem:String
        val extras = intent.extras
        idItem = extras?.getString("id") ?: ""
        println("id: $idItem")

        textViewCondition=findViewById(R.id.textViewCondition)
        textViewTitle=findViewById(R.id.textViewTitle)
        //imageView1=findViewById(R.id.imageView1)
        //imageView2=findViewById(R.id.imageView2)
        //imageView3=findViewById(R.id.imageView3)
        textViewPrice=findViewById(R.id.textViewPrice)
        textViewShipping=findViewById(R.id.textViewShipping)
        textViewQuantity=findViewById(R.id.textViewQuantity)
        textViewDetail=findViewById(R.id.textViewDetail)
        recyclerViewImagenes=findViewById(R.id.recyclerViewImagenes)
        binding.recyclerViewImagenes.adapter=adapter
        val layoutManager:RecyclerView.LayoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewImagenes.layoutManager=layoutManager

        progressDialog = ProgressDialog(this@ItemDetailActivity)
        progressDialog!!.setMessage("Cargando resultados de búsqueda...")
        progressDialog!!.show()

        viewModel.getItemDetail(idItem)

        observeViewModel()

        val backButton:Button = findViewById(R.id.backButton)
        backButton.setOnClickListener{
            finish()
        }
    }

    fun observeViewModel(){
        viewModel.item.observe(this){it->
            println("it en setupViewModel es $it")
            if(it!=null){
                println("Seteo el adapter al recyclerview")
                progressDialog?.dismiss()
                this.item=it
                if(item!=null)
                    setInfo()
            }
        }
    }

    fun setInfo(){
        var textForTextViewCondition=""
        //var misImageView = arrayOf(imageView1,imageView2 ,imageView3)
        if(item?.getString("condition")=="new"){
            textForTextViewCondition="Nuevo | "
        }else{
            textForTextViewCondition="Usado | "
        }
        textForTextViewCondition+="${item?.getInt("sold_quantity")} vendidos"
        //agregar cant de vendidos
        textViewCondition!!.text=textForTextViewCondition
        textViewTitle!!.text=item?.getString("title")
        textViewPrice!!.text="$ "+(item?.getDouble("price")).toString()

        val jsonPictures: JSONArray? = item?.getJSONArray("pictures")
        val pictures = ArrayList<String>()//Creating an empty arraylist
        jsonPictures?.let {
            for (i in 0 until it.length()){
                //if(i<3){
                    val picture = it.get(i) as JSONObject
                    println(picture)
                    pictures.add(picture.getString("url"))
                    //Picasso.get().load(picture.getString("url")).into(misImageView[i])
                //}
            }
            adapter.setPictures(pictures)
            adapter.setContext(this)
        }


        val jsonShipping: JSONObject? = item?.getJSONObject("shipping")
        if(jsonShipping?.getBoolean("free_shipping") == true){
            textViewShipping!!.setText("Envío gratis")
            if(jsonShipping?.getString("logistic_type")=="fulfillment"){
                textViewShipping!!.text="${textViewShipping!!.text} ⚡ FULL"
            }
        }
        textViewQuantity!!.text="Cantidad disponible: ${item?.getString("available_quantity")}"
        val listAttributes: JSONArray? = item?.getJSONArray("attributes")
        var detalles = ""
        listAttributes?.let {
            for (i in 0 until it.length()){
                val attribute:JSONObject = it.get(i) as JSONObject
                detalles="${detalles} ${attribute.getString("name")}: ${attribute.getString("value_name")} \n "
                println(attribute)
            }
        }
        textViewDetail!!.text=detalles
    }

}