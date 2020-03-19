package android.inflabnet.perfildoinvestidor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.inflabnet.perfildoinvestidor.R
import android.widget.Toast
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_image_q8.*

/**
 * A simple [Fragment] subclass.
 */
class ImageQ8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_q8, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This callback will only be called when MyFragment is at least Started.
        val callback = requireActivity().onBackPressedDispatcher.addCallback(this) {
            // Handle the back button event
            Toast.makeText(context!!.applicationContext,"Por Favor, aperte o botão VOLTAR", Toast.LENGTH_SHORT).show()
            //findNavController().navigate(R.id.action_imageQ8_to_question_8)
        }
        //callback.isEnabled = false

        // The callback can be enabled or disabled here or in the lambda
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnVoltarq8.setOnClickListener {
            findNavController().navigate(R.id.action_imageQ8_to_question_8)
        }
    }
}
