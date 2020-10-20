package com.example.goodvibrationsapp

import android.content.ContentValues
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.message_history
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        //database stuff
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue()
                Log.d(ContentValues.TAG, "Value is: $value")
                vibratePhone(value.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Failed to read value.", error.toException())
            }
        })

    }

    fun vibratePhone(text :String) {
        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue(text)
        val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
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