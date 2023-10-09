package mx.rmr.appadmin.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.rmr.appadmin.R
import mx.rmr.appadmin.databinding.FragmentRegistrarUsuarioBinding
import mx.rmr.appadmin.viewmodel.RegistrarUsuarioVM

class RegistrarUsuarioFragment : Fragment() {
    private lateinit var binding: FragmentRegistrarUsuarioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =FragmentRegistrarUsuarioBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registrarEventos()
        //registrarObservables()
    }

    private fun registrarEventos() {
        // TODO
    }

}