package com.example.goodvibrationsapp.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.goodvibrationsapp.Phrase
import com.example.goodvibrationsapp.R
import kotlinx.android.synthetic.main.fragment_dictionary.*

class DictionaryFragment : Fragment() {

    private lateinit var dictionaryViewModel: DictionaryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dictionaryViewModel =
                ViewModelProviders.of(this).get(DictionaryViewModel::class.java)
        return inflater.inflate(R.layout.fragment_dictionary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        floatingActionButton.setOnClickListener {
            newPhraseModal.visibility = View.VISIBLE
        }
        save_phrase_button.setOnClickListener {
            val phrase = Phrase(code_sequence_view.getCodeSequence(), headline_modal.text.toString())
            Log.i("Tove", phrase.codeSequence)
        }
    }
}