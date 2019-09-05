package com.example.learnmiwok

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NumbersFragment : Fragment() {
    private val TAG = "NumbersFragment"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_numbers,container, false)

        val words = ArrayList<Word>()
        words.add(Word("one", "lutti", R.drawable.number_one, R.raw.number_one))
        words.add(Word("two", "otiiko", R.drawable.number_two, R.raw.number_two))
        words.add(Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three))
        words.add(Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four))
        words.add(Word("five", "massokka", R.drawable.number_five, R.raw.number_five))
        words.add(Word("six", "temmokka", R.drawable.number_six, R.raw.number_six))
        words.add(Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven))
        words.add(Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight))
        words.add(Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine))
        words.add(Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten))

        val recyclerView = view.findViewById<RecyclerView>(R.id.numbers)
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = WordAdapter(this!!.context!!,words,R.color.category_numbers)
        recyclerView.adapter = adapter

        return view
    }
}