package com.example.loginpageui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpageui.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.signUp.setOnClickListener {
            binding.signUp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            binding.signUp.setTextColor(resources.getColor(R.color.textColor, null))
            binding.logIn.background = null
            binding.signUpLayout.visibility = View.VISIBLE
            binding.logInLayout.visibility = View.GONE
            binding.logIn.setTextColor(resources.getColor(R.color.pinkColor, null))

        }
        binding.logIn.setOnClickListener {
            binding.signUp.background = null
            binding.signUp.setTextColor(resources.getColor(R.color.pinkColor, null))
            binding.logIn.background = resources.getDrawable(R.drawable.switch_trcks, null)
            binding.signUpLayout.visibility = View.GONE
            binding.logInLayout.visibility = View.VISIBLE
            binding.logIn.setTextColor(resources.getColor(R.color.textColor, null))

        }
        binding.signIn.setOnClickListener(){
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }
    }
}