package com.simatrix.logbook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.simatrix.logbook.R
import com.simatrix.logbook.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binder : FragmentHomeBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binder = FragmentHomeBinding.inflate(inflater, container, false)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
    }

    private fun initClick() {
        binder.apply {
            SettingButton.setOnClickListener(){
                findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
            }
            AddButton.setOnClickListener(){
                findNavController().navigate(R.id.action_homeFragment_to_addFragment)
            }
        }
    }
}