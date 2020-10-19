package com.example.goodvibrationsapp.ui.send_message

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.goodvibrationsapp.R
import com.google.firebase.database.FirebaseDatabase

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
        val sendButton :Button = root.findViewById(R.id.button_send_message)
        sendButton.setOnClickListener{
            vibratePhone()
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

    fun vibratePhone() {
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue(outputTaps.text.toString())
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            for (c in outputTaps.text.toString()){
                when {
                    c.toString() == "." -> {
                        println(".")
                        vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE))
                    }
                    c.toString() == "_" -> {
                        vibrator.vibrate(VibrationEffect.createOneShot(800, VibrationEffect.DEFAULT_AMPLITUDE))
                        println("_")
                    }
                    else -> {
                        println("nothing")
                    }
                }
                Thread.sleep(1_000)
            }
        } else {
            for (c in outputTaps.text.toString()){
                when {
                    c.toString() == "." -> {
                        println(".")
                        vibrator.vibrate(200)
                    }
                    c.toString() == "_" -> {
                        vibrator.vibrate(800)
                        println("_")
                    }
                    else -> {
                        println("nothing")
                    }
                }
                Thread.sleep(1_000)
            }

        }
        outputTaps.text = ""
    }
}