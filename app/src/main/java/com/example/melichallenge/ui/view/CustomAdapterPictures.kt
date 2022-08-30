package com.example.melichallenge.ui.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.melichallenge.R
import com.squareup.picasso.Picasso

class CustomAdapterPictures : RecyclerView.Adapter<CustomAdapterPictures.CustomViewHolderPictures> () {
    private var picturesList= mutableListOf<String>()
    private var context: Context? = null

    fun setPictures(pictures:ArrayList<String>){
        this.picturesList=pictures.toMutableList()
        notifyDataSetChanged()
    }
    fun setContext(context: Context){
        this.context=context
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolderPictures {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.custom_image_row, parent, false)
        return CustomViewHolderPictures(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolderPictures, position: Int) {
        try {
            Picasso.get()
                .load(picturesList!![position])
                //.fit()// To fit image into imageView
                .error(org.koin.android.R.drawable.abc_cab_background_top_material)
                .into(holder.imgView);
        } catch (ex: NullPointerException) {
            ex.printStackTrace()
        } catch (ex: IndexOutOfBoundsException) {
            ex.printStackTrace()
        }
    }
    class CustomViewHolderPictures(mView: View): RecyclerView.ViewHolder(
        mView
    ) {
        var imgView: ImageView
        init {
            imgView = mView.findViewById(R.id.imageView2)
        }
    }

    override fun getItemCount(): Int {
        return picturesList.size
    }
}