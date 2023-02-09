package com.example.coroutineflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutineflow.crypto_app.CryptoActivity
import com.example.coroutineflow.databinding.ActivityMainBinding
import com.example.coroutineflow.lesson.UsersActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonUsersActivity.setOnClickListener {
            startActivity(UsersActivity.newIntent(this))
        }
        binding.buttonCryptoActivity.setOnClickListener {
            startActivity(CryptoActivity.newIntent(this))
        }
    }
}