package com.example.viewpager2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.viewpager2demo.adapter.ViewPager2Adapter
import com.example.viewpager2demo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val testData = arrayListOf(
        "苹果",
        "华为",
        "小米",
        "三星",
        "oppo"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(viewBinding.root)
        viewBinding.vpTest.adapter = ViewPager2Adapter(this,testData)

        TabLayoutMediator(viewBinding.tlTest, viewBinding.vpTest) { tab, position ->
            tab.text = testData[position]
        }.attach()

    }
}