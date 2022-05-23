package dev.angara.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondPicActivity : AppCompatActivity() {
        lateinit var btnBack: Button
        lateinit var btnNext2: Button
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_second_pic2)

            btnBack = findViewById(R.id.btnBack)
            btnBack.setOnClickListener {
                val intent = Intent(this, FirstPicActivity::class.java)
                startActivity(intent)
            }
            btnNext2 = findViewById(R.id.btnNext2)
            btnNext2.setOnClickListener {
                val intent = Intent(this, ThirdPicActivity::class.java)
                startActivity(intent)
            }
        }
    }

