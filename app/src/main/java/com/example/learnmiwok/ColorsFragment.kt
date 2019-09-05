package com.example.learnmiwok

import android.media.AudioManager
import android.media.SoundPool
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ColorsFragment : Fragment() {

    private val TAG = "ColorsFragment"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_colors,container, false)

        val words = ArrayList<Word>()
        words.add(Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red))
        words.add(Word("green", "chokokki", R.drawable.color_green, R.raw.color_green))
        words.add(Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown))
        words.add(Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray))
        words.add(Word("black", "kululli", R.drawable.color_black, R.raw.color_black))
        words.add(Word("white", "kelelli", R.drawable.color_white, R.raw.color_white))
        words.add(Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow))
        words.add(Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow))

        val recyclerView = view.findViewById<RecyclerView>(R.id.colors)
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = WordAdapter(this!!.context!!,words,R.color.category_colors)
        recyclerView.adapter = adapter


        return view
    }
}