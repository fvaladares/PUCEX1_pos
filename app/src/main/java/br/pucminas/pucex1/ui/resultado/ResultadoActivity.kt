package br.pucminas.pucex1.ui.resultado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.pucminas.pucex1.databinding.ActivityResultadoBinding
import br.pucminas.pucex1.ui.MainActivity.Companion.TAG

class ResultadoActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciarDados()
    }

    private fun iniciarDados() {
        val text = intent.getStringExtra(TAG)
        binding.tvRestultado.text = text
    }
}