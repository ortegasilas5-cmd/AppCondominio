package com.example.appcondominio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PainelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_painel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val  nome = intent.getStringExtra("nome")
        val titulo = findViewById<TextView>(R.id.textViewTitulo)
        titulo.text = "Ola usuário $nome"

        val btnboleto = findViewById<Button>(R.id.buttonboleto)
        btnboleto.setOnClickListener {
            val x = Intent(this, BoletoActivity::class.java)
            startActivity(x)
        }

    }


}