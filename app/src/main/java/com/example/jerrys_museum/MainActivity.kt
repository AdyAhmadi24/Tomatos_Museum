package com.example.jerrys_museum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.jerrys_museum.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn1.setOnClickListener {
            val name = binding.editText.text.toString()
            if (name == null || name.trim() == "")
                Toast.makeText(this@MainActivity, "nama tidak boleh kosong", Toast.LENGTH_LONG)
                    .show()
            else {
                binding.textViews.setText(name)
            //change image
                val imgRes = resources.getIdentifier(name, "drawable", packageName)
                binding.img1.setImageResource(imgRes)
            }
        }
    }
}