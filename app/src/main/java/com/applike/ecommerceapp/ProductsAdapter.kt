package com.applike.ecommerceapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductsAdapter(private val context: Context, private val products: ArrayList<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ProductsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        return ProductsHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.product_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        val current = products[position]

        Picasso.with(context).load(current.photoUrl).into(holder.image)
        holder.title.text = current.title
        holder.price.text = current.price.toString()

    }


    override fun getItemCount() = products.size

    class ProductsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageView_photo)
        val title: TextView = itemView.findViewById(R.id.textView_title)
        val price: TextView = itemView.findViewById(R.id.textView_price)

    }
}