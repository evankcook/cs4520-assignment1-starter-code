package com.cs4520.assignment1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductListAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImageView: ImageView = itemView.findViewById(R.id.product_image)
        private val productNameView: TextView = itemView.findViewById(R.id.product_name)
        private val productExpiryView: TextView = itemView.findViewById(R.id.product_expiry)
        private val productPriceView: TextView = itemView.findViewById(R.id.product_price)

        fun bind(product: Product) {
            productNameView.text = product.name
            productPriceView.text = itemView.context.getString(R.string.currency,
                product.price.toString())

            if (product.expiryDate.isNullOrEmpty()) {
                productExpiryView.visibility = View.GONE
            } else {
                productExpiryView.text = product.expiryDate
            }

            val backgroundColor = when (product) {
                is Product.EquipmentProduct -> "#E06666"
                is Product.FoodProduct -> "#FFD965"
            }
            itemView.setBackgroundColor(Color.parseColor(backgroundColor))

            val image = when (product) {
                is Product.EquipmentProduct -> R.drawable.equipment
                is Product.FoodProduct -> R.drawable.food
            }
            productImageView.setImageResource(image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)

        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(productList[position])
    }
}