package com.juan.semana1



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.juan.semana1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAddCoupon.setOnClickListener{
            val intent = Intent(this,AddCouponActivity::class.java)
            startActivity(intent)
        }
        binding.txtHello.text = "Bienvenido a la clase android"
    }
}