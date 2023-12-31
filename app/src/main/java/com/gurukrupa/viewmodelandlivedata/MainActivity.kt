package com.gurukrupa.viewmodelandlivedata

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.gurukrupa.viewmodelandlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.txtCounter.text = viewModel.getCurrentCount().toString()
        binding.btnCount.setOnClickListener {
            count++
            binding.txtCounter.text = viewModel.getUpdateCount().toString()
        }

        binding.btnNext.setOnClickListener { openNextActivity() }

    }

    private fun openNextActivity() {
        startActivity(Intent(this@MainActivity, AddActivity::class.java))
    }
}