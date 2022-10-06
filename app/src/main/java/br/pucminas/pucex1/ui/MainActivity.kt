package br.pucminas.pucex1.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.pucminas.pucex1.databinding.ActivityMainBinding
import br.pucminas.pucex1.ui.resultado.ResultadoActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarView()
    }

    fun configurarView() {
        binding.button.setOnClickListener {
            val texto = binding.editTextNome.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_LONG).show()
            val intent = Intent(this, ResultadoActivity::class.java).apply {
                putExtra(TAG, texto)
            }
            startActivity(intent)
        }
    }

    companion object {
        const val TAG = "PARAMETRO"
    }
}