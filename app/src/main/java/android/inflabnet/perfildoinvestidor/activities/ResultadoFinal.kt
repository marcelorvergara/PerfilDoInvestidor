package android.inflabnet.perfildoinvestidor.activities

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.inflabnet.perfildoinvestidor.R
import android.inflabnet.perfildoinvestidor.viewmodel.QuestoesViewModel
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.util.AndroidRuntimeException
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_resultado_final.*

class ResultadoFinal : AppCompatActivity() {

    lateinit var questionsViewModel: QuestoesViewModel

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_final)

        val res = intent.getStringExtra("results")
        txtResResultado.text = res
        val nom = intent.getStringExtra("nome")
        txtResNome.text = nom

        btnNovoTeste.setOnClickListener {
            val intt = Intent(this, MainActivity::class.java)
            //intt.putExtra("user", nome)
            startActivity(intt)

        }
        // para texto ok
        btnShare.setOnClickListener {

            try {
                val destinos =
                    arrayOf("campanha@bancopaulista.com.br", "gerente@bancopaulista.com.br")
                val resultado = txtResResultado.text
                val shareIntent = Intent()
                shareIntent.type = "message/rfc822"
                shareIntent.action = Intent.ACTION_SEND
                shareIntent.putExtra(Intent.EXTRA_EMAIL, destinos)
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Analise de Investimento de $nom")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "O meu perfil aferido foi $resultado")
                startActivity(Intent.createChooser(shareIntent, "Compartilhar via"))
            } catch (e: Exception) {
                Toast.makeText(this, "Cliente de e-mail não disponível", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
