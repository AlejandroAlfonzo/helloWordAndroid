package com.jalfonzo.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class WidgetActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var botonMorado : Button
    lateinit var botonNegro : Button
    lateinit var botonRojo : Button
    lateinit var botonNaranja : Button
    lateinit var constraintPrincipal : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget)
        initUI()
    }

    private fun initUI(){

        constraintPrincipal = findViewById(R.id.clPrincipal)

        botonMorado = findViewById(R.id.btnPurple)
        botonMorado.setOnClickListener(this)

        botonNegro = findViewById(R.id.btnBlack)
        botonNegro.setOnClickListener(this)

        botonRojo = findViewById(R.id.btnRed)
        botonRojo.setOnClickListener(this)

        botonNaranja = findViewById(R.id.btnOrange)
        botonNaranja.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btnPurple -> {
                constraintPrincipal.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }

            R.id.btnBlack -> {
                Toast.makeText(this, "Boton Negro", Toast.LENGTH_SHORT).show()
            }

            R.id.btnRed -> {
                Toast.makeText(this, "Boton Rojo", Toast.LENGTH_SHORT).show()
            }

            R.id.btnOrange -> {
                Toast.makeText(this, "Boton Naranja", Toast.LENGTH_SHORT).show()
            }

        }
    }
}