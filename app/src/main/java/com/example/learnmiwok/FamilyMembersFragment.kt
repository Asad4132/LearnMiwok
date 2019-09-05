package com.example.learnmiwok

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FamilyMembersFragment : Fragment() {
    private val TAG = "FamilyMembersFragment"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_family_members,container, false)

        val words = ArrayList<Word>()
        words.add(Word("father", "әpә", R.drawable.family_father, R.raw.family_father))
        words.add(Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother))
        words.add(Word("son", "angsi", R.drawable.family_son, R.raw.family_son))
        words.add(Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter))
        words.add(Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother))
        words.add(Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother))
        words.add(Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister))
        words.add(Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister))
        words.add(Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother))
        words.add(Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather))

        val recyclerView = view.findViewById<RecyclerView>(R.id.family)
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = WordAdapter(this!!.context!!,words,R.color.category_family)
        recyclerView.adapter = adapter

        return view
    }
}