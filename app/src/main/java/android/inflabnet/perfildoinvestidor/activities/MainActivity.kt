package android.inflabnet.perfildoinvestidor.activities

import android.content.Intent
import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //var questionsViewModel: QuestoesViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext.setOnClickListener {
            val nome = edtNome.text.toString()

            val questionsViewModel = ViewModelProviders.of(this).get(QuestoesViewModel::class.java)
            questionsViewModel.nome = nome
            Toast.makeText(this,questionsViewModel.nome ,Toast.LENGTH_SHORT).show()

            val intt = Intent(this, QuestionActivity::class.java)
            intt.putExtra("user", nome)
            startActivity(intt)
        }
    }

}
