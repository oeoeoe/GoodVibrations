package com.example.goodvibrationsapp.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.goodvibrationsapp.R
import kotlinx.android.synthetic.main.fragment_dictionary.view.*

class CodeSequenceView(context: Context, attrs: AttributeSet): ConstraintLayout(context, attrs) {

    lateinit var outputTaps: TextView

    init {

        val view = inflate(context, R.layout.view_code_sequence, this)
        outputTaps = view.findViewById(R.id.output_taps)
        val tapButton = view.findViewById<Button>(R.id.button_tap_message)

        tapButton.setOnClickListener{
            tapped(it)
        }
        tapButton.setOnLongClickListener{
            longTapped(it)
        }
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

    fun getCodeSequence() = outputTaps.text.toString()

    fun resetTaps(){
        outputTaps.text = ""
    }
}