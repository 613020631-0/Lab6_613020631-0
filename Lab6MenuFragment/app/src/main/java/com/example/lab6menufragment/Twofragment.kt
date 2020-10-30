package com.example.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_twofragment.view.*

class Twofragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_twofragment, container, false)
        view.btnClickFragTwo.setOnClickListener() {
            val toast = Toast.makeText(context, "Click On Fragment Two", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }
}