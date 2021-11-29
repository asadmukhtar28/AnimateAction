package com.asad.animateaction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.asad.animateaction.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val width: Int = resources.displayMetrics.widthPixels - 100

        binding.parent.setOnClickListener {
            binding.parent.animateHeightFromTo(
                resources.getDimension(R.dimen.parent_height).toInt(),
                resources.getDimension(R.dimen.parent_max_height).toInt()
            )
            binding.parent.animateWidthFromTo(
                resources.getDimension(R.dimen.parent_width).toInt(),
                width
            )
        }
    }
}