package com.iameben.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActiivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_actiivity)
        supportActionBar?.hide()
    }
}