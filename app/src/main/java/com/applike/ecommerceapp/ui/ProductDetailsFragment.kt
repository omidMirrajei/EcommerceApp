package com.applike.ecommerceapp.ui

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.applike.ecommerceapp.R
import kotlinx.android.synthetic.main.fragment_product_details.view.*

class ProductDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_details, container, false)

        val title: String = ProductDetailsFragmentArgs
            .fromBundle(arguments!!).positionOfIndex

        view.textView_productName.text = title
        view.button_availabilty.setOnClickListener {
            AlertDialog.Builder(activity)
                .setMessage("Hey, $title is in stack!")
                .setPositiveButton("BUY") { _, _ ->
                    Toast.makeText(activity, "Hello World", Toast.LENGTH_SHORT).show()
                }
                .create()
                .show()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
