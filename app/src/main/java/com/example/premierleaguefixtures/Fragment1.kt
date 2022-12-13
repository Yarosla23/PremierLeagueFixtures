package com.example.premierleaguefixtures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_1, container,false)
    val nextBtn : Button =view.findViewById(R.id.button1)
    nextBtn.setOnClickListener{
        val fragment = Fragment2()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.nav_contanier,fragment)?.commit()
    }
    return view
    }
}