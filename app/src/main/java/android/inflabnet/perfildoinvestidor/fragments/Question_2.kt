package android.inflabnet.perfildoinvestidor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import android.util.Log
import android.widget.Toast
import androidx.activity.addCallback
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.fragment_question.*

/**
 * A simple [Fragment] subclass.
 */
class Question_2 : Fragment() {
    
    var soma : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var questionsViewModel: QuestoesViewModel? = null
        activity?.let {
            questionsViewModel = ViewModelProviders.of(it)[QuestoesViewModel::class.java]
        }

        val listaQuestoes = questionsViewModel!!.loadQuestoes()
        val a = 1


        btnProxQuest.text = "Próxima questão"

        txtQuestion.text = listaQuestoes[a].pergunta
        rbA.text = listaQuestoes[a].questao_a
        rbA.visibility = View.VISIBLE

        rbB.text = listaQuestoes[a].questao_b
        rbB.visibility = View.VISIBLE

        rbC.text = listaQuestoes[a].questao_c
        rbC.visibility = View.VISIBLE


        if(listaQuestoes[a].questao_d == "vazio") {
            rbD.visibility = View.INVISIBLE
        }
        else {
            rbD.text = listaQuestoes[a].questao_d
            rbD.visibility = View.VISIBLE
        }

        if(listaQuestoes[a].questao_e == "vazio") {
            rbE.visibility = View.INVISIBLE
        }
        else {
            rbE.text = listaQuestoes[a].questao_e
            rbE.visibility = View.VISIBLE
        }

        btnProxQuest.setOnClickListener {
            val checked = radioGroup.checkedRadioButtonId
            Log.i("CHE", checked.toString())
            if (checked != -1) {
                val name = resources.getResourceEntryName(checked);
                var soma = questionsViewModel!!.resultado
                when (name) {
                    "rbA" -> {
                        soma = listaQuestoes[a].gabarito.getValue("a")
                        Toast.makeText(
                            this.context!!.applicationContext,
                            soma.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    "rbB" -> {
                        soma = listaQuestoes[a].gabarito.getValue("b")
                        Toast.makeText(
                            this.context!!.applicationContext,
                            soma.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    "rbC" -> {
                        soma = listaQuestoes[a].gabarito.getValue("c")
                        Toast.makeText(
                            this.context!!.applicationContext,
                            soma.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    "rbD" -> {
                        soma = listaQuestoes[a].gabarito.getValue("d")
                        Toast.makeText(
                            this.context!!.applicationContext,
                            soma.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    "rbE" -> {
                        soma = listaQuestoes[a].gabarito.getValue("e")
                        Toast.makeText(
                            this.context!!.applicationContext,
                            soma.toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
                questionsViewModel!!.respostas["Q2"] = soma
                val ant = questionsViewModel!!.resultado
                if (soma != null) questionsViewModel!!.resultado = soma + ant!!
                Toast.makeText(this.context!!.applicationContext,"BBB ${questionsViewModel!!.resultado.toString()}", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.question_3)
            }
            else Toast.makeText(this.context!!.applicationContext,"Você deve selecionar uma opção", Toast.LENGTH_SHORT).show()

        }


    }
}
