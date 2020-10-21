package com.example.goodvibrationsapp.ui.dictionary

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.goodvibrationsapp.MainActivity
import com.example.goodvibrationsapp.Phrase
import com.example.goodvibrationsapp.R
import com.example.goodvibrationsapp.inflate
import kotlinx.android.synthetic.main.dictionary_item_view.view.*
import kotlinx.android.synthetic.main.text_item_view.view.*

class DictionaryAdapter(private val data: ArrayList<Phrase>): RecyclerView.Adapter<DictionaryAdapter.TextItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val inflatedView = parent.inflate(R.layout.dictionary_item_view, false)
        return TextItemViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val item = data[position]
        holder.setSequence(item.codeSequence)
        holder.setMeaning(item.meaning)
        //holder.textView.text = item
    }

    class TextItemViewHolder(val v: View): RecyclerView.ViewHolder(v), View.OnClickListener{
        private var view: View = v

        init{v.setOnClickListener(this)}

        fun setSequence(text :String){
            view.code_sequence_text.text=text
        }
        fun setMeaning(text :String){
            view.meaning_text_view.text=text
        }

        override fun onClick(v: View?) {
            println("clicked me" + view.meaning_text_view.text)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}

