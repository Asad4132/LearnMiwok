package com.example.learnmiwok

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PhrasesFragment : Fragment() {
    private val TAG = "PhrasesFragment"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_phrases,container, false)

        val words = ArrayList<Word>()
        words.add(Word("Where are you going?", "minto wuksus", 0, R.raw.phrase_where_are_you_going))
        words.add(Word("What is your name?", "tinnә oyaase'nә", 0, R.raw.phrase_what_is_your_name))
        words.add(Word("My name is...", "oyaaset...", 0, R.raw.phrase_my_name_is))
        words.add(Word("How are you feeling?", "michәksәs?", 0, R.raw.phrase_how_are_you_feeling))
        words.add(Word("I'm feling good.", "kuchi achit", 0, R.raw.phrase_im_feeling_good))
        words.add(Word("Are you coming?", "әәnәs'aa?", 0, R.raw.phrase_are_you_coming))
        words.add(Word("Yes, I'm coming.", "hәә’ әәnәm", 0, R.raw.phrase_yes_im_coming))
        words.add(Word("I'm coming.", "әәnәm", 0, R.raw.phrase_im_coming))
        words.add(Word("Let's go.", "yoowutis", 0, R.raw.phrase_lets_go))
        words.add(Word("Come here.", "әnni'nem", 0, R.raw.phrase_come_here))

        val recyclerView = view.findViewById<RecyclerView>(R.id.phrases)
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = WordAdapter(this!!.context!!,words,R.color.category_phrases)
        recyclerView.adapter = adapter

        return view
    }
}