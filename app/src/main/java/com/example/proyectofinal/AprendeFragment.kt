package com.example.proyectofinal

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.proyectofinal.databinding.FragmentAprendeBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AprendeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AprendeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    // TODO: Agregar viewmodel de leccion para usar el setLeccion en los clicklisteners
    private var param1: String? = null
    private var param2: String? = null

    private val viewModel: LeccionesViewModel by activityViewModels()

    private var _binding: FragmentAprendeBinding? = null
    private val binding get() = _binding!!

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

        _binding = FragmentAprendeBinding.inflate(inflater, container, false)

        getFavorite()

        binding.buttonVolverAprende.setOnClickListener {
            findNavController().navigate(R.id.action_aprendeFragment_to_homeFragment)
            saveFavorite()
        }

        binding.buttonLeccion1Aprende.setOnClickListener{
            viewModel.setLeccion(1)
            findNavController().navigate(R.id.action_aprendeFragment_to_leccionesSeleccionadasFragment)
            saveFavorite()
        }
        binding.buttonLeccion2Aprende.setOnClickListener{
            viewModel.setLeccion(2)
            findNavController().navigate(R.id.action_aprendeFragment_to_leccionesSeleccionadasFragment)
            saveFavorite()
        }

        return binding.root
    }

    private fun saveFavorite() {
        val saveLeccion1State = binding.switchLeccion1.isChecked
        val saveLeccion2State = binding.switchLeccion2.isChecked
        val saveLeccion3State = binding.switchLeccion3.isChecked
        val saveLeccion4State = binding.switchLeccion4.isChecked
        val saveLeccion5State = binding.switchLeccion5.isChecked

        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putBoolean("STATE_LECCION1", saveLeccion1State)
            putBoolean("STATE_LECCION2", saveLeccion2State)
            putBoolean("STATE_LECCION3", saveLeccion3State)
            putBoolean("STATE_LECCION4", saveLeccion4State)
            putBoolean("STATE_LECCION5", saveLeccion5State)
            apply()
        }
    }

    private fun getFavorite() {
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        val getLeccion1State = sharedPref.getBoolean("STATE_LECCION1", false)
        val getLeccion2State = sharedPref.getBoolean("STATE_LECCION2", false)
        val getLeccion3State = sharedPref.getBoolean("STATE_LECCION3", false)
        val getLeccion4State = sharedPref.getBoolean("STATE_LECCION4", false)
        val getLeccion5State = sharedPref.getBoolean("STATE_LECCION5", false)

        binding.switchLeccion1.isChecked = getLeccion1State
        binding.switchLeccion2.isChecked = getLeccion2State
        binding.switchLeccion3.isChecked = getLeccion3State
        binding.switchLeccion4.isChecked = getLeccion4State
        binding.switchLeccion5.isChecked = getLeccion5State
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AprendeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AprendeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}