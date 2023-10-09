package mx.rmr.appadmin.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.rmr.appadmin.R
import mx.rmr.appadmin.databinding.FragmentRegistrarAsistenciaBinding
import mx.rmr.appadmin.viewmodel.RegistrarAsistenciaVM

class RegistrarAsistenciaFragment : Fragment() {

    private lateinit var binding: FragmentRegistrarAsistenciaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrarAsistenciaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registrarEventos()
        //registrarObservables()
    }

    private fun registrarEventos() {
        // TO DO
    }

}