package com.kerberos.kuku_demo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kerberos.kuku_demo.R

class SellFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sell, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,object:
            OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                val bottomNav = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
                bottomNav.selectedItemId = R.id.sell
            }

        })
    }

}