package br.com.pilon.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class appActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        val btnVoluntario = findViewById<Button>(R.id.btnVoluntario)

        btnVoluntario.setOnClickListener {
            val intent = Intent(this,voluntary::class.java)
            startActivity(intent)

        }
    }
}