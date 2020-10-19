package com.example.goodvibrationsapp.ui.send_message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.goodvibrationsapp.R

//previously known as HomeFragment

class SendMessageFragment : Fragment() {
    lateinit var outputTaps : TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_send_message, container, false)
        outputTaps = root.findViewById(R.id.output_taps)
        val tapButton :Button = root.findViewById(R.id.button_tap_message)
        tapButton.setOnClickListener{
            tapped(it)
        }
        tapButton.setOnLongClickListener{
            longTapped(it)
       }
        return root
    }

    private fun tapped(view : View){
        val text = outputTaps.text.toString()
        outputTaps.text = text + "."
    }
    private fun longTapped(view : View):Boolean{
        val text = outputTaps.text.toString()
        outputTaps.text = text + "_"
        return true
    }
}