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
import com.example.goodvibrationsapp.MainActivity
import com.example.goodvibrationsapp.Phrase
import com.example.goodvibrationsapp.R
import kotlinx.android.synthetic.main.fragment_send_message.*
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fragment_dictionary.*


//previously known as HomeFragment

class SendMessageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_send_message, container, false)
        val sendButton :Button = root.findViewById(R.id.button_send_message)
        sendButton.setOnClickListener{
            vibratePhone(taps_view.getCodeSequence())
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun vibratePhone(message :String) {
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue(message)
        (activity as MainActivity?)?.vibratePhone(message)
        taps_view.resetTaps()
    }
}