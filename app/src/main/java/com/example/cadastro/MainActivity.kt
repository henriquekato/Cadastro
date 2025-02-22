package com.example.cadastro

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)

        with(activityMainBinding){
            salvarBtn.setOnClickListener {
                val formulario = Formulario(
                    nomeInput.text.toString(),
                    telefoneInput.text.toString(),
                    emailInput.text.toString(),
                    emailListCheckbox.isChecked,
                    findViewById<RadioButton>(sexoRadioGroup.checkedRadioButtonId).text
                        .toString(),
                    cidadeInput.text.toString(),
                    ufSp.selectedItem.toString()
                )

                Toast.makeText(
                    applicationContext,
                    formulario.toString(),
                    Toast.LENGTH_SHORT)
                    .show();
            }

            limparBtn.setOnClickListener {
                nomeInput.setText("")
                telefoneInput.setText("")
                emailInput.setText("")
                emailListCheckbox.isChecked = false
                sexoRadioGroup.check(masculinoRb.id)
                cidadeInput.setText("")
                ufSp.setSelection(0)
            }
        }

    }
}