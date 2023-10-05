package mx.rmr.appadmin.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.rmr.appadmin.R
import mx.rmr.appadmin.databinding.FragmentPrincipalBinding
import mx.rmr.appadmin.viewmodel.PrincipalVM

class PrincipalFrag : Fragment() {
    lateinit var binding: FragmentPrincipalBinding
    private lateinit var viewModel: PrincipalVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrincipalBinding.inflate(layoutInflater)
        return binding.root
    }

    // Crea la vista e inicializa los Eventos y Observables
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registrarEventos()
        //registrarObservables()
    }

    private fun registrarEventos() {
        // Evento de cuando el usuario da clic en el botón del mapa
        binding.imgMapa.setOnClickListener {
            // Crear un Intent para iniciar la actividad de destino
//            val intent = Intent(requireContext(), MapaActivity::class.java)
//            startActivity(intent)
            findNavController().navigate(R.id.action_principalFrag_to_mapaFragment)
        }

        // Evento de cuando clickean "REISTRATE AQUI"
        binding.btnEntrar.setOnClickListener {
            // Navegar entre fragments
            findNavController().navigate(R.id.action_principalFrag_to_registrarFrag)
        }
    }

}