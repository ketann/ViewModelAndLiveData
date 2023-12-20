package com.gurukrupa.viewmodelandlivedata

import androidx.lifecycle.ViewModel

class AddActivityViewModel : ViewModel() {
    private var total = 0

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int) {
        total += input
    }
}