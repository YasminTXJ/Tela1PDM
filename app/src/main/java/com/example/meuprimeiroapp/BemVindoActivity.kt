package com.example.meuprimeiroapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
class BemVindoActivity : AppCompatActivity(){
    private val context: Context get() = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Visões
        setContentView(R.layout.activity_bem_vindo)
        val textView = findViewById<TextView>(R.id.textBoasVindas)
        //Args
        val args = intent.extras
        val nome = args?.getString("nome")
        //textView.text = "$nome, seja bem vindo a tela 2."
        actionBar?.setDisplayHomeAsUpEnabled(true)
//passagem para a proxima tela
        val btT3= findViewById<Button>(R.id.buttonCont)
        btT3.setOnClickListener {

            val intent = Intent(context, Tela3::class.java)
            val params = Bundle()
            params.putString("nome", "Alexandre")
            intent.putExtras(params)
            startActivity(intent)



        }


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item?.itemId == android.R.id.home){
            //Tratamos o clique no botão de voltar (<--)
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}