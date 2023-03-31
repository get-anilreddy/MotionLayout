package com.anil.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.motionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var isTransitionToEnd = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAnimate.setOnClickListener {
            if(!isTransitionToEnd) {
                isTransitionToEnd = true
                binding.motionLayout.transitionToEnd()
            } else {
                isTransitionToEnd = false
                binding.motionLayout.transitionToStart()
            }
        }
    }
}