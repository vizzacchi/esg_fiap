package br.com.pilon.esg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.com.pilon.esg.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newUsuario = findViewById<TextView>(R.id.txvNovoUsuario)
        val btnlogin = findViewById<Button>(R.id.btnLogin)

        newUsuario.setOnClickListener{
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            val intent = Intent(this,appActivity::class.java)
            startActivity(intent)

        }
    }
}