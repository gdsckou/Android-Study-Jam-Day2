package com.works.android101day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.works.android101day2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var  usernameText : EditText
    lateinit var passwordText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usernameText = binding.editTxtUsername
        passwordText = binding.editTxtPassword


        binding.button.setOnClickListener {
            val username = usernameText.text.toString()
            val password = passwordText.text.toString()
            if (username.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("username", username)
                intent.putExtra("password", password)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Lütfen bilgileri eksiksiz doldurunuz", Toast.LENGTH_LONG)
                    .show()
            }

        }
    }
}