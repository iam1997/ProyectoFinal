package com.example.proyectofinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectofinal.databinding.FragmentLeccionesSeleccionadasBinding
import com.example.proyectofinal.databinding.FragmentRecursosSeleccionadosBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private var _binding: FragmentLeccionesSeleccionadasBinding? = null
private val binding get() = _binding!!
//!!!!importante!!!!!
private lateinit var viewModel : LeccionesViewModel
//!!!!!!!!!!!
/**
 * A simple [Fragment] subclass.
 * Use the [LeccionesSeleccionadasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LeccionesSeleccionadasFragment : Fragment() {

  // private val viewModel = ViewModelProvider(requireActivity()).get(LeccionesViewModel::class.java)
    //
  //  private lateinit var viewModel : LeccionesViewModel
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
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lecciones_seleccionadas, container, false)

        _binding  = FragmentLeccionesSeleccionadasBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(requireActivity()).get(LeccionesViewModel::class.java)
       // val viewModel = ViewModelProvider(requireActivity()).get(LeccionesViewModel::class.java)

        //do stuff
        return binding.root
    }

    //

    //
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //init adapter
        //crear y ligarlo al rview de lecciones
        //new prop layout manager
        val adapter = RVAdapter(viewModel.flashcards)
        binding.rvLecciones.adapter = adapter
        binding.rvLecciones.layoutManager = LinearLayoutManager(this.context)

        //llenar el view


    }
    //

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LeccionesSeleccionadasFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LeccionesSeleccionadasFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}