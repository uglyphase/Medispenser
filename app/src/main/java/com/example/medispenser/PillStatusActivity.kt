package com.example.medispenser

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medispenser.databinding.ActivityAlertsBinding
import com.example.medispenser.databinding.ActivityPillStatusBinding
import com.example.medispenser.databinding.ActivityProfileBinding

class PillStatusActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPillStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPillStatusBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHomePillStat.setOnClickListener{
            startActivity(Intent(this@PillStatusActivity, WelcomeActivity::class.java))
            finish()
        }
    }
}