package com.gurukrupa.viewmodelandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.gurukrupa.viewmodelandlivedata.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding
    private lateinit var viewModelAdd: AddActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  DataBindingUtil.setContentView(this, R.layout.activity_add)
        viewModelAdd = ViewModelProvider(this).get(AddActivityViewModel::class.java)

        //binding.txtTotalResult.text = viewModelAdd.getTotal().toString()
        binding.txtTotalResult.setText(viewModelAdd.getTotal().toString())

        binding.btnAdd.setOnClickListener {
            viewModelAdd.setTotal(binding.edtAmount.text.toString().toInt())
            //binding.txtTotalResult.text = viewModelAdd.getTotal().toString()
            binding.txtTotalResult.setText("Total " + viewModelAdd.getTotal().toString())
            binding.edtAmount.setText("")
        }
    }
}