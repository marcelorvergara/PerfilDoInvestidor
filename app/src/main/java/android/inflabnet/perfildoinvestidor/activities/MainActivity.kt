package android.inflabnet.perfildoinvestidor.activities

import android.content.Intent
import android.inflabnet.perfildoinvestidor.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext.setOnClickListener {
            var nome = edtNome.text.toString()
            var intt = Intent(this, QuestionActivity::class.java)
            intt.putExtra("user", nome)
            startActivity(intt)
        }
    }
}
