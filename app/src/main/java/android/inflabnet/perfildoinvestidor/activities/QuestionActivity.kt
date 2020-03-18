package android.inflabnet.perfildoinvestidor.activities

import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    var questionsViewModel: QuestoesViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        var questionsViewModel = ViewModelProviders.of(this)[QuestoesViewModel::class.java]

        val nome = intent.getStringExtra("user")
        txtNomeResult.text = nome
        questionsViewModel.nome = nome
    }

    override fun onBackPressed() {
        questionsViewModel = ViewModelProviders.of(this)[QuestoesViewModel::class.java]

        val count = supportFragmentManager.backStackEntryCount

        if (count == 0) {
            super.onBackPressed();
            //remover questão respondida
            val tot = questionsViewModel?.respostas?.size
            val key = "Q"+tot
            questionsViewModel?.respostas?.remove(key)
            //val remover = questionsViewModel!!.respostas.getValue(key)
            //Log.i("TESTE", remover.toString())
            Log.i("TESTE", key)
            Log.i("TESTE", questionsViewModel?.respostas.toString())



        } else {
            supportFragmentManager.popBackStack();
        }


    }
}
