package com.example.proyectofinal

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.proyectofinal.databinding.FragmentLeccionesFavoritasBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private var _binding: FragmentLeccionesFavoritasBinding? = null
private val binding get() = _binding!!

private lateinit var viewModel : LeccionesViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [LeccionesFavoritasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LeccionesFavoritasFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


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

        _binding = FragmentLeccionesFavoritasBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(LeccionesViewModel::class.java)

        setButtonVisibility()

        binding.buttonLeccion1LeccionesFavoritas.setOnClickListener {
            viewModel.setLeccion(1)
            findNavController().navigate(R.id.action_leccionesFavoritasFragment_to_leccionesSeleccionadasFragment)
        }

        binding.buttonLeccion2LeccionesFavoritas.setOnClickListener {
            viewModel.setLeccion(2)
            findNavController().navigate(R.id.action_leccionesFavoritasFragment_to_leccionesSeleccionadasFragment)
        }

        binding.buttonLeccion3LeccionesFavoritas.setOnClickListener {
            viewModel.setLeccion(3)
            findNavController().navigate(R.id.action_leccionesFavoritasFragment_to_leccionesSeleccionadasFragment)
        }

        binding.buttonLeccion4LeccionesFavoritas.setOnClickListener {
            viewModel.setLeccion(4)
            findNavController().navigate(R.id.action_leccionesFavoritasFragment_to_leccionesSeleccionadasFragment)
        }

        binding.buttonLeccion5LeccionesFavoritas.setOnClickListener {
            viewModel.setLeccion(5)
            findNavController().navigate(R.id.action_leccionesFavoritasFragment_to_leccionesSeleccionadasFragment)
        }

        binding.buttonVolverLeccionesFavoritas.setOnClickListener {
            findNavController().navigate(R.id.action_leccionesFavoritasFragment_to_homeFragment)
        }



        return binding.root
    }

    private fun setButtonVisibility() {

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val getLeccion1State = sharedPref.getBoolean("STATE_LECCION1", false)
        val getLeccion2State = sharedPref.getBoolean("STATE_LECCION2", false)
        val getLeccion3State = sharedPref.getBoolean("STATE_LECCION3", false)
        val getLeccion4State = sharedPref.getBoolean("STATE_LECCION4", false)
        val getLeccion5State = sharedPref.getBoolean("STATE_LECCION5", false)

        if (getLeccion1State == true) {
            binding.buttonLeccion1LeccionesFavoritas.visibility = View.VISIBLE
        }
        else {
            binding.buttonLeccion1LeccionesFavoritas.visibility = View.GONE
        }

        if (getLeccion2State == true) {
            binding.buttonLeccion2LeccionesFavoritas.visibility = View.VISIBLE
        }
        else {
            binding.buttonLeccion2LeccionesFavoritas.visibility = View.GONE
        }

        if (getLeccion3State == true) {
            binding.buttonLeccion3LeccionesFavoritas.visibility = View.VISIBLE
        }
        else {
            binding.buttonLeccion3LeccionesFavoritas.visibility = View.GONE
        }

        if (getLeccion4State == true) {
            binding.buttonLeccion4LeccionesFavoritas.visibility = View.VISIBLE
        }
        else {
            binding.buttonLeccion4LeccionesFavoritas.visibility = View.GONE
        }

        if (getLeccion5State == true) {
            binding.buttonLeccion5LeccionesFavoritas.visibility = View.VISIBLE
        }
        else {
            binding.buttonLeccion5LeccionesFavoritas.visibility = View.GONE
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LeccionesFavoritasFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LeccionesFavoritasFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}