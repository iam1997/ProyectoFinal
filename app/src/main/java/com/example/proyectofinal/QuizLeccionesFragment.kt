package com.example.proyectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.proyectofinal.databinding.FragmentQuizLeccionesBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [QuizLeccionesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuizLeccionesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentQuizLeccionesBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel : LeccionesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentQuizLeccionesBinding.inflate(inflater, container, false)

        binding.buttonLeccion1QuizLecciones.setOnClickListener {
            val action = QuizLeccionesFragmentDirections.actionQuizLeccionesFragmentToQuizFragment(1)
            findNavController().navigate(action)
        }

        binding.buttonLeccion2QuizLecciones.setOnClickListener {
            val action = QuizLeccionesFragmentDirections.actionQuizLeccionesFragmentToQuizFragment(2)
            findNavController().navigate(action)
        }

        binding.buttonLeccion3QuizLecciones.setOnClickListener {
            val action = QuizLeccionesFragmentDirections.actionQuizLeccionesFragmentToQuizFragment(3)
            findNavController().navigate(action)
        }

        binding.buttonLeccion4QuizLecciones.setOnClickListener {
            val action = QuizLeccionesFragmentDirections.actionQuizLeccionesFragmentToQuizFragment(4)
            findNavController().navigate(action)
        }

        binding.buttonLeccion5QuizLecciones.setOnClickListener {
            val action = QuizLeccionesFragmentDirections.actionQuizLeccionesFragmentToQuizFragment(5)
            findNavController().navigate(action)
        }

        binding.buttonVolverQuizLecciones.setOnClickListener {
            findNavController().navigate(R.id.action_quizLeccionesFragment_to_homeFragment)
        }

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment QuizLeccionesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            QuizLeccionesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}