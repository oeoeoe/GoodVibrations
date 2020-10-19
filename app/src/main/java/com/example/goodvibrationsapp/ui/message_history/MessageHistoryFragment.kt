package com.example.goodvibrationsapp.ui.message_history

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.goodvibrationsapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.message_history.*

class MessageHistoryFragment : Fragment() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: MessageHistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.message_history, container, false)
        var recycler = root.findViewById(R.id.message_list_recycle) as RecyclerView
        linearLayoutManager = LinearLayoutManager(this.activity)
        recycler.layoutManager = linearLayoutManager
        val list = arrayListOf<String>()
        list.addAll(listOf("1", "2", "3"))
        adapter = MessageHistoryAdapter(list)
        recycler.adapter = adapter
        //database stuff
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue()
                Log.d(TAG, "Value is: $value")
                vibratePhone(value.toString())
            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })
        return root
    }

    fun vibratePhone(text :String) {
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue(text)
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            for (c in text){
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
            for (c in text){
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
    }
}