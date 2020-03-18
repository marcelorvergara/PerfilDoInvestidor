package android.inflabnet.perfildoinvestidor.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.fragment_question.*

/**
 * A simple [Fragment] subclass.
 */
class question : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var questionsViewModel: QuestoesViewModel? = null
        activity?.let{
            questionsViewModel = ViewModelProviders.of(it)[QuestoesViewModel::class.java]
        }

        val listaQuestoes = questionsViewModel!!.loadQuestoes()
        var a = 0

        btnProxQuest.setOnClickListener {
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
            val checked = radioGroup.checkedRadioButtonId
            Log.i("CHE", checked.toString())
            if(checked != -1){
                val name = resources.getResourceEntryName(checked);
                var soma = questionsViewModel!!.resultado
                when (name) {
                    "rbA" -> {
                        val res: Int = listaQuestoes[a].gabarito.getValue("a")
                        Toast.makeText(this.context!!.applicationContext,res.toString(),Toast.LENGTH_SHORT).show()
                    }
                    "rbB" -> {
                        val res: Int = listaQuestoes[a].gabarito.getValue("b")
                        Toast.makeText(this.context!!.applicationContext,res.toString(),Toast.LENGTH_SHORT).show()
                    }
                    "rbC" -> {
                        val res: Int = listaQuestoes[a].gabarito.getValue("c")
                        Toast.makeText(this.context!!.applicationContext,res.toString(),Toast.LENGTH_SHORT).show()
                    }
                    "rbD" -> {
                        val res: Int = listaQuestoes[a].gabarito.getValue("d")
                        Toast.makeText(this.context!!.applicationContext,res.toString(),Toast.LENGTH_SHORT).show()
                    }
                    "rbE" -> {
                        val res: Int = listaQuestoes[a].gabarito.getValue("e")
                        Toast.makeText(this.context!!.applicationContext,res.toString(),Toast.LENGTH_SHORT).show()
                    }
                }
            }

            a+=1
        }

    }
}
