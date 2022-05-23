package dev.angara.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForthPicActivity : AppCompatActivity() {
    lateinit var btnBack3: Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth_pic)

        btnBack3 = findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent = Intent(this, ThirdPicActivity::class.java)
            startActivity(intent)
        }
        btnNext4= findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent= Intent(this, FifthPicActivity::class.java)
            startActivity(intent)
        }
    }
}