package com.example.pickpoint

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pick_point.*
import java.time.LocalDateTime

class PickPointFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pick_point, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //        if (!view.checkbox_entrance.isChecked) {
//            view.checkbox_entrance.isChecked = true
//        }
        btnPick.setOnClickListener {
            val current = LocalDateTime.now()
            txt_timer.text = current.formatDateAndTimeToBr()
            txt_timer.contentDescription = current.toString()
        }
    }

}