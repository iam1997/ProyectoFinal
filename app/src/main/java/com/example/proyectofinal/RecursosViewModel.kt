package com.example.proyectofinal

import android.util.Log
import androidx.lifecycle.ViewModel

class RecursosViewModel : ViewModel() {

    private val _flashcards = mutableListOf<Flashcards>()

    val flashcards = _flashcards

    init {
        Log.d("RecursosViewModel", "RecursosViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("RecursosViewModel", "RecursosViewModel destroyed!")
    }

    //hacer la funcion para llenar la instancia del viewModel
    //data class de to do
    var recursoA = mutableListOf(
        Flashcards("Con la mano cerrada, se muestran las uñas " +
                "y se estira el dedo pulgar hacia un lado. La palma mira al frente.",
            R.drawable.letras_a,"Letra A")
    )

    var recursoB = mutableListOf(
        Flashcards("Se colocan los pulgares señalando hacia " +
                "arriba y unidos por los dorsos de los dedos, y se mueven en línea recta hacia usted.",
            R.drawable.adjetivo_conmigo,"Adjetivos: Conmigo")
    )

}