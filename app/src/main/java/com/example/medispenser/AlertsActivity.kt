package com.example.medispenser

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medispenser.databinding.ActivityAlertsBinding
import com.example.medispenser.databinding.ActivityProfileBinding

class AlertsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlertsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHomeAlerts.setOnClickListener{
            startActivity(Intent(this@AlertsActivity, WelcomeActivity::class.java))
            finish()
        }
    }
}