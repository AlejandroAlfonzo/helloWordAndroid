package com.jalfonzo.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView // Variable sin inicializar
    val TAG : String = "LOGDBZ"; // Variable inicializada -- Constante

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate log 1");
        initUI()//invocar la funcion de inicializacion de interfaz del usuario
        Toast.makeText(this, "OnCreate success",Toast.LENGTH_LONG).show()
    }

    /**
     * Se sobreescribe la funcion onStart que inicia la aplicacion
     */
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart log 2");
        //initUI()//invocar la funcion de inicializacion de interfaz del usuario
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume log 3");//Se regresa a la app
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause log 4");//Pasa a segundo plano o multiventana
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop log 5");//Activity pasa a segundo plano
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart log 6");//Activity retorna a primer plano
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy log 7");//Activity muere
    }

    /**
     * Inicializador de los diferentes widgets denuestra interfaz de usuario
     */
    private fun initUI(){
        //textView = findViewById(R.id.tvHelloWord) //Casteamos nuestro elemento

        // Seteamos el texto de nuestro recurso strings.xml
        //textView.text = getString(R.string.helloWord)

        //Log.i(TAG, "Se ha iniciado la funcon de initUI - Log 3");
    }

}