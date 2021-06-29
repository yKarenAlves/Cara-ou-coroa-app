package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class ResultadoActivity : AppCompatActivity() {

    private var imagem: ImageView? = null
    private var botaoJogar: Button? = null
    private var contCoroa = 0
    private var contCara  = 0
    private var textCara: TextView? = null
    private var textCoroa: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        imagem = findViewById(R.id.imageResultado)
        botaoJogar = findViewById(R.id.buttonJogar)
        textCara = findViewById(R.id.textCara)
        textCoroa = findViewById(R.id.textCoroa)
    }

    fun jogar(view: View) {

        var num = Random.nextInt(2)

        if (num == 0) {
            contCara++
            imagem?.setImageResource(R.drawable.cara)
            textCara?.setText("Cara: ${contCara}")

        } else {
            contCoroa++
            imagem?.setImageResource(R.drawable.coroa)
            textCoroa?.setText("Coroa: ${contCoroa}")
        }

        botaoJogar?.setText("Jogar Novamente")

    }

    fun zerarContador(view: View) {
        contCara = 0
        contCoroa = 0
        textCara?.setText("Cara: ${contCara}")
        textCoroa?.setText("Coroa: ${contCoroa}")
    }
}