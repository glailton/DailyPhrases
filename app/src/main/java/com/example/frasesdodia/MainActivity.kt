package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createPhraseBtn.setOnClickListener {
            phraseTv.text = Phrases.PHRASES[ Random.nextInt(0, Phrases.PHRASES.size)]
        }

        //TODO modificar esse codigo para pegar as imagens desse site,
        // https://www.pensador.com/frases_positivas_para_comecar_o_dia/
        //de acordo com a frase e tbm poder compartilhar no whats up ou email
    }


}
