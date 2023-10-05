package mx.rmr.appadmin.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.rmr.appadmin.R
import mx.rmr.appadmin.viewmodel.RegistrarVM

class RegistrarFrag : Fragment() {

    companion object {
        fun newInstance() = RegistrarFrag()
    }

    private lateinit var viewModel: RegistrarVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registrar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegistrarVM::class.java)
        // TODO: Use the ViewModel
    }

}