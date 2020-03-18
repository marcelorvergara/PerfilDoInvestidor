package android.inflabnet.perfildoinvestidor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.inflabnet.perfildoinvestidor.R
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_image_q9.*

/**
 * A simple [Fragment] subclass.
 */
class ImageQ9 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_q9, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnVoltarq9.setOnClickListener {
            findNavController().navigate(R.id.action_imageQ9_to_question_9)
        }
    }
}
