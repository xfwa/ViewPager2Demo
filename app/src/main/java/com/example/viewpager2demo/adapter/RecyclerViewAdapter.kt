package com.example.viewpager2demo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2demo.databinding.ItemTestBinding

/**
 * create by xfwa
 * on 2022/4/2
 * good good study,day day up!
 * description:
 **/
class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.TestHolder>() {
    class TestHolder(private val viewBinding: ItemTestBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bindData(position: Int) {
            viewBinding.tvTest.text = position.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        return TestHolder(
            ItemTestBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int = 10
}