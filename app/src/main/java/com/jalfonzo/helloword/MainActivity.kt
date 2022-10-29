package com.jalfonzo.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()//invocar la funcion de inicializacion de interfaz del usuario
    }

    /**
     * Inicializador de los diferentes widgets denuestra interfaz de usuario
     */
    private fun initUI(){
        textView = findViewById(R.id.tvHelloWord) //Casteamos nuestro elemento

        // Seteamos el texto de nuestro recurso strings.xml
        textView.text = getString(R.string.helloWord)
    }

}