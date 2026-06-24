package com.example.appcondominio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val entre = findViewById<Button>(R.id.btnentrar)
        entre.setOnClickListener{
            val email = findViewById<EditText>(R.id.editTextEmailLogin).text.toString()
            val senha = findViewById<EditText>(R.id.editTextSuasenha).text.toString()
            if(email.equals("test@teste.com") && senha.equals("1234")) {

                val intent = Intent(this, PainelActivity::class.java)
                intent.putExtra("nome", "Silas")
                startActivity(intent)

            }

        }
        val cadastre = findViewById<Button>(R.id.btncadastre)
        cadastre.setOnClickListener {

            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

    }
}