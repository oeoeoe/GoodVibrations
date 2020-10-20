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
            vibratePhone()
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun vibratePhone() {
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue(code_sequence_view.getCodeSequence())
        (activity as MainActivity?)?.vibratePhone(code_sequence_view.getCodeSequence())
        code_sequence_view.resetTaps()
    }
}