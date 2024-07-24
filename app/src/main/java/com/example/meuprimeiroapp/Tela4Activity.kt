package com.example.meuprimeiroapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tela4Activity : AppCompatActivity() {
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Visões
        setContentView(R.layout.activity_tela4)
        val textView = findViewById<TextView>(R.id.textoTela4)
        //Args
        val args = intent.extras
        val nome = args?.getString("nome")
        //textView.text = "$nome, seja bem vindo a tela 4."
        // Desativar botão Home
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setHomeButtonEnabled(false)

        //passagem para a proxima tela
        val btT4= findViewById<Button>(R.id.buttonCont)
        btT4.setOnClickListener {

            val intent = Intent(context, MainActivity::class.java)
            val params = Bundle()
            params.putString("nome", "Alexandre")
            intent.putExtras(params)
            startActivity(intent)

        }
    }
    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item?.itemId == android.R.id.home){
            //Tratamos o clique no botão de voltar (<--)
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    } */
}