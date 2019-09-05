package com.example.learnmiwok

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Adapter
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mSectionsPageAdapter: SectionsPageAdapter
    private lateinit var mViewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSectionsPageAdapter = SectionsPageAdapter(supportFragmentManager)
        mViewPager = findViewById(R.id.view_pager)
        setupViewPager(mViewPager)
        var tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(mViewPager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = SectionsPageAdapter(supportFragmentManager)
        adapter.addFragment(NumbersFragment(), "Numbers")
        adapter.addFragment(ColorsFragment(), "Colors")
        adapter.addFragment(FamilyMembersFragment(), "Family Members")
        adapter.addFragment(PhrasesFragment(), "Phrases")
        viewPager.adapter = adapter
    }


}