package com.example.goodvibrationsapp.ui.send_message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.goodvibrationsapp.R
import kotlinx.android.synthetic.main.fragment_send_message.*
import com.google.firebase.database.FirebaseDatabase


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
            sendMessage(taps_view.getCodeSequence())
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun sendMessage(message :String) {
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue(message)
        taps_view.resetTaps()
    }
}