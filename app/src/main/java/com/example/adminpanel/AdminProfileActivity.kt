package com.example.adminpanel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.adminpanel.databinding.ActivityAdminProfileBinding

class AdminProfileActivity : AppCompatActivity() {
    private val binding:ActivityAdminProfileBinding by lazy{
        ActivityAdminProfileBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            finish()
        }
        binding.name.isEnabled= false
        binding.address.isEnabled= false
        binding.email.isEnabled= false
        binding.phone.isEnabled= false
        binding.password.isEnabled= false

        var isEnable = false
        binding.editButton.setOnClickListener() {
            isEnable = !isEnable
            binding.name.isEnabled = isEnable
            binding.address.isEnabled = isEnable
            binding.email.isEnabled = isEnable
            binding.phone.isEnabled = isEnable
            binding.password.isEnabled = isEnable
            if (isEnable) {
                binding.name.requestFocus()
            }
        }
    }
}