package com.example.proyectofinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinal.databinding.FlashcardItemBinding

class RVAdapter (var flashcards: List< Flashcards>) : RecyclerView.Adapter<RVAdapter.ViewHolder>()

{
    class ViewHolder(val binding: FlashcardItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = FlashcardItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            textViewTitle.text = flashcards[position].title
            //checkBoxState.isChecked = flashcards[position].isChecked
            //como asignar valor a la imagen?
            imageViewLSM.setImageResource(flashcards[position].imageID)
            // no se si este imageID funcione
            textViewDescription.text = flashcards[position].description

        }
    }

    override fun getItemCount(): Int {
        return flashcards.size
    }
}
