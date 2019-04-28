package com.github.watabee.fragmentpagerresumesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = Adapter(supportFragmentManager)
    }
}

private class Adapter(
    fragmentManager: FragmentManager
) : FragmentStatePagerAdapter(fragmentManager, RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment = PageFragment.newInstance(position)

    override fun getCount(): Int = 16
}