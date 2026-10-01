package org.insbaixcamp.bolamagicade8

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    lateinit var tv_txt: TextView

    val frases = arrayOf(
        "Sí, totalmente.",
        "Es decidido que sí.",
        "Sin lugar a dudas.",
        "Las señales apuntan a que sí.",
        "Definitivamente, dale adelante.",
        "Puedes contar con ello.",
        "Todo parece indicar que sí.",
        "Absolutamente sí.",
        "No cuentes con ello.",
        "Mis fuentes dicen que no.",
        "Las perspectivas no son buenas.",
        "Mejor olvídalo por ahora.",
        "La respuesta es un rotundo no.",
        "Altamente improbable.",
        "No lo veo muy claro.",
        "Pregunta de nuevo más tarde.",
        "Concentrate y vuelve a preguntar.",
        "Mejor no te lo digo ahora.",
        "El futuro es incierto.",
        "Es un misterio que debes descubrir."
    )

    lateinit var fraseRandom: Random





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        fraseRandom = Random
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tv_txt = findViewById(R.id.tv_text);

        tv_txt.setOnClickListener {

            tv_txt.text = frases[fraseRandom.nextInt(frases.size)]
        }
    }
}