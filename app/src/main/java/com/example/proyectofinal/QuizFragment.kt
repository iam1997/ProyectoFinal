package com.example.proyectofinal

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.example.proyectofinal.databinding.FragmentQuizBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [QuizFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuizFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: Int? = null
    private var param2: String? = null

    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuizBinding.inflate(inflater, container, false)

        val viewModel: LeccionesViewModel by activityViewModels()
        val args : QuizFragmentArgs by navArgs()
        val list = when (args.listLeccion) {
            1 -> viewModel.leccAList
            2 -> viewModel.leccBlist
            3 -> viewModel.leccClist
            4 -> viewModel.leccDlist
            else -> viewModel.leccElist
        }

        var indexFlashcard : Int = 0
        var indexList = mutableListOf<Int>(0)
        var check = true

        setFlashcard(0, list)

        binding.buttonResultadoQuiz.setOnClickListener {
            showResultFlashcard(indexFlashcard, list)
        }

        binding.buttonSiguienteQuiz.setOnClickListener {
            if (indexList.size == list.size) {
                indexList.clear()
            }

            check = true

            while (check) {
                indexFlashcard = (0..list.size-1).random()
                if (indexList.contains(indexFlashcard) == false) {
                    indexList.add(indexFlashcard)
                    check = false
                }
            }

            setFlashcard(indexFlashcard, list)
        }

        return binding.root
    }

    private fun setFlashcard(index : Int, list : List<Flashcards>) {
        val flashcard = list[index]
        binding.imageViewQuiz.setImageResource(flashcard.imageID)
        binding.textViewDescriptionQuiz.text = flashcard.description
        binding.textViewTitleQuiz.text = ""
    }

    private fun showResultFlashcard(index : Int, list : List<Flashcards>) {
        val flashcard = list[index]
        binding.textViewTitleQuiz.text = flashcard.title
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment QuizFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            QuizFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}