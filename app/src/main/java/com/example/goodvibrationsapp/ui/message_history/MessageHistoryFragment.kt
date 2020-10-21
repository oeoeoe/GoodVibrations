package com.example.goodvibrationsapp.ui.message_history

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.goodvibrationsapp.MainActivity
import com.example.goodvibrationsapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class   MessageHistoryFragment : Fragment() {
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
                (activity as MainActivity?)?.vibratePhone(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })
        return root
    }
}