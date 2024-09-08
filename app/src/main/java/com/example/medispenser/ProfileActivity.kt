package com.example.medispenser

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medispenser.databinding.ActivityProfileBinding
import com.example.medispenser.databinding.ActivityWelcomeBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHomeProfile.setOnClickListener{
            startActivity(Intent(this@ProfileActivity, WelcomeActivity::class.java))
            finish()
        }
    }
}