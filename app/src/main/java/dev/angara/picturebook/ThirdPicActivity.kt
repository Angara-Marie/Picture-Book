package dev.angara.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdPicActivity : AppCompatActivity() {
    lateinit var btnBack2: Button
    lateinit var btnNext3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_pic)

        btnBack2 = findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent = Intent(this, SecondPicActivity::class.java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this, ForthPicActivity::class.java)
            startActivity((intent))
        }
    }
}