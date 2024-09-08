package com.example.medispenser

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medispenser.databinding.ActivityLoginBinding
import com.example.medispenser.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSched.setOnClickListener{
            startActivity(Intent(this@WelcomeActivity, ScheduleActivity::class.java))
            finish()
        }

        binding.btnProf.setOnClickListener{
            startActivity(Intent(this@WelcomeActivity, ProfileActivity::class.java))
            finish()
        }

        binding.btnNotif.setOnClickListener {
            startActivity(Intent(this@WelcomeActivity, AlertsActivity::class.java))
            finish()
        }

        binding.btnPillbox.setOnClickListener{
            startActivity(Intent(this@WelcomeActivity, PillStatusActivity::class.java))
            finish()
        }

    }

}