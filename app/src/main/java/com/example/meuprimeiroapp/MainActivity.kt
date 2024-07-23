package com.example.meuprimeiroapp

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    lateinit var progressBar: ProgressBar
    lateinit var data: DatePicker
    private val TAG = "livro"
    //Propriedade para acessar o contexto de qualquer lugar.
    private val context: Context get() = this


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Definindo a Visão
        setContentView(R.layout.activity_main)
        Log.v(TAG, "Visão criada")
        val btLogin = findViewById<Button>(R.id.buttonCont)

        //Agora os EVENTOS


        btLogin.setOnClickListener {


            val intent = Intent(context, BemVindoActivity::class.java)
            val params = Bundle()
            params.putString("nome", "Alexandre")
            intent.putExtras(params)
            startActivity(intent)


        }

    }
    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
}
