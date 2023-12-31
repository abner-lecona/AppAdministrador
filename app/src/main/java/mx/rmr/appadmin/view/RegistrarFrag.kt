package mx.rmr.appadmin.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.rmr.appadmin.R
import mx.rmr.appadmin.databinding.FragmentRegistrarBinding
import mx.rmr.appadmin.viewmodel.RegistrarVM

class RegistrarFrag : Fragment() {

    private lateinit var binding: FragmentRegistrarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrarBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registrarEventos()
        //registrarObservables()
    }

    private fun registrarEventos() {
        binding.btnRegUsuario.setOnClickListener{
            findNavController().navigate(R.id.action_registrarFrag_to_registrarUsuarioFragment2)
        }

        binding.btnRegAsistencia.setOnClickListener{
            findNavController().navigate(R.id.action_registrarFrag_to_registrarAsistenciaFragment)
        }
    }

}