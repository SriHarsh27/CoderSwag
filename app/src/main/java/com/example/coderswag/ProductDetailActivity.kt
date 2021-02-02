package com.example.coderswag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.Model.Product
import kotlinx.android.synthetic.main.activity_product_detail.*
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.product_list_item.*

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product?.image, "drawable", packageName)
        productdetailImage.setImageResource(resourceId)
        productdetailName.text = product?.title
        productdetailPrice.text = product?.price
    }
}