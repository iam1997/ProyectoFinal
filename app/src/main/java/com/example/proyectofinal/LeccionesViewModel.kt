package com.example.proyectofinal

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*

class LeccionesViewModel : ViewModel() {

    private var _flashcards = mutableListOf<Flashcards>()

    var flashcards = _flashcards

    init {
        Log.d("LeccionesViewModel", "LeccionesViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("LeccionesViewModel", "LeccionesViewModel destroyed!")
    }

    var leccAList = mutableListOf(
        Flashcards("Con la mano cerrada, se muestran las uñas " +
                "y se estira el dedo pulgar hacia un lado. La palma mira al frente.",
            R.drawable.letras_a,"Letra A"),
        Flashcards("Se colocan los pulgares señalando hacia " +
                "arriba y unidos por los dorsos de los dedos, y se mueven en línea recta hacia usted.",
            R.drawable.adjetivo_conmigo,"Adjetivos: Conmigo")
    )

    var leccBlist = mutableListOf(
        Flashcards("Se colocan los pulgares señalando hacia " +
                "arriba y unidos por los dorsos de los dedos, y se mueven en línea recta hacia usted.",
            R.drawable.adjetivo_conmigo,"Adjetivos: Conmigo")
    )

    fun setLeccion(option: Int) {
        if( option  == 1){
            flashcards = leccAList
        }
        if (option == 2)
        {
            flashcards = leccBlist
        }
        //repetir hasta el num y final de lecc#letra disponibles

    }
}