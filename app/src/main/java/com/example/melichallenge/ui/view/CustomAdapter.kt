package com.example.melichallenge.ui.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.melichallenge.R
import com.example.melichallenge.model.Item
import com.squareup.picasso.Picasso

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder> () {
    private var itemList= mutableListOf<Item>()
    private var context: Context? = null

    fun setItems(items:List<Item>){
        this.itemList=items.toMutableList()
        notifyDataSetChanged()
    }
    fun setContext(context: Context){
        this.context=context
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.custom_row, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val it:Item = itemList!![position];
        holder.txtTitle.text = it.title
        holder.txtPrice.text="$ ${it.price}"
        if(it.shipping.free_shipping){
            if(it.shipping.tags.contains("fulfillment")){
                holder.txtDetail.text="Envío gratis - ⚡ FULL"
            }else{
                holder.txtDetail.text="Envío gratis"
            }
        }
        try {
            println(it.thumbnail)
            Picasso.get()
                .load(it.thumbnail)
                //.placeholder(R.drawable.ic_launcher_foreground)
                //.error(R.drawable.ic_launcher_background)"@android:drawable/ic_menu_crop"
                .fit()// To fit image into imageView
                .into(holder.imgView);
        } catch (ex: NullPointerException) {
            ex.printStackTrace()
        } catch (ex: IndexOutOfBoundsException) {
            ex.printStackTrace()
        }
        holder.itemView.setOnClickListener { v: View? ->
            val miIntent = Intent(context, ItemDetailActivity::class.java)
            miIntent.putExtra("id", it.id)
            context!!.startActivity(miIntent)
        }

    }

    override fun getItemCount(): Int {
        return itemList!!.size
    }

    //El ViewHolder se encargará de asignar los valores del modelo a las vistas correspondientes
    class CustomViewHolder(val mView: View) : RecyclerView.ViewHolder(
        mView
    ) {
        var imgView: ImageView
        var txtTitle: TextView
        var txtPrice: TextView
        var txtDetail: TextView

        init {
            imgView = mView.findViewById(R.id.imageView)
            txtTitle = mView.findViewById(R.id.textViewTitle)
            txtPrice = mView.findViewById(R.id.textViewPrice)
            txtDetail = mView.findViewById(R.id.textViewDetail)
        }
    }



}
