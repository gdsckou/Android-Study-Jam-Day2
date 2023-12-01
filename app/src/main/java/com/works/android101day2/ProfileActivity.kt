package com.works.android101day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.works.android101day2.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        binding.btnShow.setOnClickListener {
            binding.txtEmail.text = username
            binding.txtPassword.text = password
        }




    }
}