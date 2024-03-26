package com.example.meuprimeiroapp

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var progressBar: ProgressBar
    lateinit var data: DatePicker
    private val TAG = "livro"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Definindo a Visão
        setContentView(R.layout.activity_main)
        Log.v(TAG, "Visão criada")
        val btLogin = findViewById<Button>(R.id.buttonCont)
        progressBar = findViewById(R.id.progressBar);
        val human = findViewById<TextView>(R.id.checkBox)
        data = findViewById(R.id.date_picker)
        //Agora os EVENTOS
        val imageButton = findViewById<ImageButton>(R.id.imageButton);
        imageButton.setOnClickListener {
            if(progressBar.progress == 50){
                progressBar.progress = 100;
                Log.d("ImageButton", "Clicou no ImageButton");
            }else{
                if(progressBar.progress == 0){
                    progressBar.progress = 50
                };
            }
        }
        human.setOnClickListener {
            if(progressBar.getProgress() == 50){
                progressBar.progress = 100;
            }else{
                if(progressBar.progress == 0){
                    progressBar.progress = 50
                };
            }
        }
        btLogin.setOnClickListener {
            val tLogin = findViewById<TextView>(R.id.editTextLogin)
            val login = tLogin.text.toString()
            if (login == "yasmin") {
                toast("Bem vindo, login realizado com sucesso")
            } else {
                toast("Login incorreto!!")
            }
        }

    }
    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, mensagem, length).show()
    }
}
