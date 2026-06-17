package com.example.appcondominio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PainelActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
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
        val titular = findViewById<TextView>(R.id.textViewuser)
        titular.text = "Ola usuário $nome"

        val btnboleto = findViewById<Button>(R.id.buttonboleto)
        btnboleto.setOnClickListener {
            val intent = Intent(this, BoletoActivity::class.java)
            startActivity(intent)
        }
        val btnreserva = findViewById<Button>(R.id.buttonReserva)
        btnreserva.setOnClickListener {
            val intent = Intent(this, ReservaActivity::class.java)
            startActivity(intent)
        }

        val btnautorize = findViewById<Button>(R.id.buttonAutorizar)
        btnautorize.setOnClickListener {
            val intent = Intent(this, AutorizacaoActivity::class.java )
            startActivity(intent)
        }

        val btnmural = findViewById<Button>(R.id.buttonMural)
        btnmural.setOnClickListener {
            val intent = Intent(this, MuralActivity::class.java)
            startActivity(intent)
        }

       // val mude = findViewById<Button>()






    }


}