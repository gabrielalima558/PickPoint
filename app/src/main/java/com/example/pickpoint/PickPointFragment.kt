package com.example.pickpoint

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.fragment_pick_point.*
import kotlinx.android.synthetic.main.fragment_pick_point.view.*
import java.time.LocalDateTime

class PickPointFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_pick_point, container, false)
        val current = LocalDateTime.now()
        view.txt_timer.text = current.toString()
        view.txt_timer.contentDescription = current.toString()
//        if (!view.checkbox_entrance.isChecked) {
//            view.checkbox_entrance.isChecked = true
//        }
        return view
    }

}