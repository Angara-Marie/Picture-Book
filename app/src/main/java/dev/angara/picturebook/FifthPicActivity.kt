package dev.angara.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthPicActivity : AppCompatActivity() {
    lateinit var btnBack4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_pic)

        btnBack4= findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent = Intent(this, ForthPicActivity::class.java)
            startActivity(intent)
        }
    }
}