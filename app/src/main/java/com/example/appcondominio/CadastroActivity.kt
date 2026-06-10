package com.example.appcondominio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val confirmecadastre = findViewById<Button>(R.id.btnconfirmecad)
        val senha = findViewById<EditText>(R.id.Textsenha)
        val senhaconfirme = findViewById<EditText>(R.id.Textsenhaconfirme)

        confirmecadastre.setOnClickListener {
            val nome = findViewById<EditText>(R.id.Textname).text.toString()
            val cpf = findViewById<EditText>(R.id.Textcpf).text.toString()
            val emailText = findViewById<EditText>(R.id.Textemail).text.toString()
            val senhaText = senha.text.toString()
            val senhaconfirmeText = senhaconfirme.text.toString()
            if (!senhaText.equals(senhaconfirmeText)){
                Toast.makeText(this, "as senhas não conferem", Toast.LENGTH_LONG).show()
                senha.text.clear()
                senhaconfirme.text.clear()



            }else{
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

        }

    }
}