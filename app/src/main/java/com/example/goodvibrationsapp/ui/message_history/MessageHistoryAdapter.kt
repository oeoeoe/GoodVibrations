package com.example.goodvibrationsapp.ui.message_history

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.goodvibrationsapp.R
import com.example.goodvibrationsapp.inflate
import kotlinx.android.synthetic.main.text_item_view.view.*

class MessageHistoryAdapter(private val data: ArrayList<String>): RecyclerView.Adapter<MessageHistoryAdapter.TextItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val inflatedView = parent.inflate(R.layout.text_item_view, false)
        return TextItemViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val item = data[position]
        holder.setText(item)
        //holder.textView.text = item
    }

    class TextItemViewHolder(val v: View): RecyclerView.ViewHolder(v), View.OnClickListener{
        private var view: View = v

        init{v.setOnClickListener(this)}

        fun setText(text : String){
            view.message_text.text = text
        }

        override fun onClick(v: View?) {
            println("clicked me")
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

}

