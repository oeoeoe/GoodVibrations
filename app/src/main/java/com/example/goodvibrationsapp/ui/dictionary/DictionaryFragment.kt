package com.example.goodvibrationsapp.ui.dictionary

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.goodvibrationsapp.Phrase
import com.example.goodvibrationsapp.R
import com.example.goodvibrationsapp.ui.dictionary.DictionaryViewModel
import com.example.goodvibrationsapp.ui.message_history.MessageHistoryAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_dictionary.*

class DictionaryFragment : Fragment() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: DictionaryAdapter

    private lateinit var dictionaryViewModel: DictionaryViewModel
    lateinit var database: FirebaseDatabase

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dictionaryViewModel =
            ViewModelProviders.of(this).get(DictionaryViewModel::class.java)
        database = FirebaseDatabase.getInstance()
        val root =  inflater.inflate(R.layout.fragment_dictionary, container, false)
        var recycler = root.findViewById(R.id.dictionary_list_recycle) as RecyclerView
        linearLayoutManager = LinearLayoutManager(this.activity)
        recycler.layoutManager = linearLayoutManager

        //dummy data
        val list = arrayListOf<Phrase>()
        list.addAll(listOf(Phrase("...___...", "SOS"),Phrase("...___..__.", "Whats up?"),Phrase("._..___._..", "LOL"),Phrase("._._._.", "Help")))
        adapter = DictionaryAdapter(list)
        recycler.adapter = adapter
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newPhraseModal.visibility = View.GONE
        floatingActionButton.setOnClickListener {
            if (newPhraseModal.visibility.equals(View.VISIBLE)){
                newPhraseModal.visibility = View.GONE
            } else {
                newPhraseModal.visibility = View.VISIBLE
            }
        }
        save_phrase_button.setOnClickListener {
            val phrase = Phrase(code_sequence_view.getCodeSequence(), headline_modal.text.toString())
            val myRef = database.getReference("Dictionary " + phrase.meaning)

            myRef.setValue(phrase)
            Log.i("Tove", phrase.codeSequence)
        }
    }
}