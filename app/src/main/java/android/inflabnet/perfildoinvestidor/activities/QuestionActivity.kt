package android.inflabnet.perfildoinvestidor.activities

import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.fragments.Question_1
import android.inflabnet.perfildoinvestidor.fragments.Question_2
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var questionViewModel = ViewModelProviders.of(this)[QuestoesViewModel::class.java]

        val nome = intent.getStringExtra("user")
        txtNome.setText(nome)
    }

    override fun onBackPressed() {
        var questionViewModel = ViewModelProviders.of(this)[QuestoesViewModel::class.java]

        when(supportFragmentManager.fragments[0].javaClass.simpleName){
            "Question_1" -> {}
            "Question_2" -> {
                var valor = questionViewModel.respostas.get("Q2")
                questionViewModel.resultado = valor?.let { questionViewModel.resultado?.minus(it) }
            }
            "Question_3" -> {
                var valor = questionViewModel.respostas.get("Q3")
                questionViewModel.resultado = valor?.let { questionViewModel.resultado?.minus(it) }
            }
            else -> supportFragmentManager.popBackStack()
        }
    }
}
