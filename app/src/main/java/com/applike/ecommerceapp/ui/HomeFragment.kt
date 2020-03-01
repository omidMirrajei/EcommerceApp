package com.applike.ecommerceapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.applike.ecommerceapp.model.Product
import com.applike.ecommerceapp.adapter.ProductsAdapter
import com.applike.ecommerceapp.R
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val products = arrayListOf<Product>()
        for (i in 0..100) {
            products.add(
                Product(
                    "MOON Equipped Speed Shop T-Shirt $i",
                    "https://dummyimage.com/500x500/757575/eeeeee/fff.jpg&text=IMAGE",
                    1.99
                )
            )
        }

        view.recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter =
                ProductsAdapter(
                    view.context,
                    products
                )
        }

//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }
}
