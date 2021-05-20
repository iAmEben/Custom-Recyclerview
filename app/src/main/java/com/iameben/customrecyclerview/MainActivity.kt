package com.iameben.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iameben.customrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = ContactAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpData(binding)
    }

    fun setUpData(binding: ActivityMainBinding){
        binding.contactsRV.adapter = adapter

    }
}