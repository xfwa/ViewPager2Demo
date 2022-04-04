package com.example.viewpager2demo.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2demo.TestFragment

/**
 * create by xfwa
 * on 2022/4/2
 * good good study,day day up!
 * description:
 **/
class ViewPager2Adapter(
    fragmentActivity: FragmentActivity,
    private val testData: ArrayList<String>
) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = testData.size

    override fun createFragment(position: Int): Fragment {
        val testFragment = TestFragment()
        testFragment.arguments = Bundle()
            .apply {
                putString("test", testData[position])
            }
        return testFragment
    }
}