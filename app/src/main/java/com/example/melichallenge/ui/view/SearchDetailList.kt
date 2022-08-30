package com.example.melichallenge.ui.view

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.melichallenge.R
import com.example.melichallenge.model.Item
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.melichallenge.databinding.ActivitySearchDetailListBinding
import com.example.melichallenge.ui.viewModel.SearchViewModel


class SearchDetailList : AppCompatActivity() {

    private val adapter = CustomAdapter()
    private lateinit var binding: ActivitySearchDetailListBinding
    private var recyclerView : RecyclerView?=null
    var progressDialog: ProgressDialog? = null
    private val viewModel: SearchViewModel by viewModel()
    var items: List<Item>? = null
    var itemSelec:Item?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_detail_list)

        binding = ActivitySearchDetailListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Progress bar para mejororar la ux
        progressDialog = ProgressDialog(this@SearchDetailList)
        progressDialog!!.setMessage("Cargando resultados de búsqueda...")
        progressDialog!!.show()

        //configuro el recyclerview
        recyclerView = findViewById(R.id.customRecyclerView)
        binding.customRecyclerView.adapter=adapter
        val layoutManager:RecyclerView.LayoutManager=LinearLayoutManager(this)
        binding.customRecyclerView.layoutManager=layoutManager
        binding.customRecyclerView.setHasFixedSize(true)
        binding.customRecyclerView.adapter = adapter
        binding.customRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        //comienzo a observar los cambios que se producen en el VM
        observeViewModel()

        //obtengo la busqueda
        val search:String
        val extras = intent.extras
        search = extras?.getString("search") ?: ""
println("voy a buscar $search")
        //llamo al repositorio desde el VM
        viewModel.getItems(search)
    }

     fun observeViewModel(){
         viewModel.items.observe(this){it->
           println("it en setupViewModel es $it")
           if(it!=null){
               if(it.isEmpty()){
                   progressDialog?.dismiss()
                   var empty_search= emptyList<Item>()

               }else{
                   println("Seteo el adapter al recyclerview")
                   progressDialog?.dismiss()
                   this.items=it
                   adapter.setItems(it)
                   adapter.setContext(this)


               }
           }

       }

    }


}