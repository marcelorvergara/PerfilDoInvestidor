package android.inflabnet.perfildoinvestidor.activities

import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_resultado_final.*

class ResultadoFinal : AppCompatActivity() {

    lateinit var questionsViewModel: QuestoesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_final)

        val res = intent.getStringExtra("results")
        txtResResultado.text = res
        val nom = intent.getStringExtra("nome")
        txtResNome.text = nom
    }
}
