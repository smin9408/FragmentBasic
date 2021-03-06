package com.neppplus.fragmentbasic.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragmentbasic.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

//    1. 어떤 xml? - onCreateView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToast.setOnClickListener {

            Toast.makeText(requireContext(), "프래그먼트에서 띄우는 토스트", Toast.LENGTH_SHORT).show()

        }
    }

}