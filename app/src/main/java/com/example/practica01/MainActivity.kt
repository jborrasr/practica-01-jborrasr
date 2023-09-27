package com.example.practica01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.practica01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sumarButton.setOnClickListener {
            val numero1 = binding.primerNumeroIntroducido.text.toString()
            val numero2 = binding.segundoNumeroIntroducido.text.toString()

            if (numero1.isEmpty()||numero2.isEmpty()){
                //Mostramos un mensaje de tipo Toast para avisar al usuario de que introduzca un número
                Toast.makeText(this,getString(R.string.debes_numero),Toast.LENGTH_LONG).show()
            } else {
                val numero1 = numero1.toInt()
                val numero2 = numero2.toInt()
                val calculo = numero1 + numero2
                binding.resultText.text = getString(R.string.resultado, calculo)

            }

        }


        binding.restarButton.setOnClickListener {
            val numero1 = binding.primerNumeroIntroducido.text.toString()
            val numero2 = binding.segundoNumeroIntroducido.text.toString()

            if (numero1.isEmpty()||numero2.isEmpty()){
                //Mostramos un mensaje de tipo Toast para avisar al usuario de que introduzca un número
                Toast.makeText(this,getString(R.string.debes_numero),Toast.LENGTH_LONG).show()
            } else {
                val numero1 = numero1.toInt()
                val numero2 = numero2.toInt()
                val calculo = numero1 - numero2
                binding.resultText.text = getString(R.string.resultado, calculo)
            }

        }


        binding.multiplicarButton.setOnClickListener {
            val numero1 = binding.primerNumeroIntroducido.text.toString()
            val numero2 = binding.segundoNumeroIntroducido.text.toString()

            if (numero1.isEmpty()||numero2.isEmpty()){
                //Mostramos un mensaje de tipo Toast para avisar al usuario de que introduzca un número
                Toast.makeText(this,getString(R.string.debes_numero),Toast.LENGTH_LONG).show()
            } else {
                val numero1 = numero1.toInt()
                val numero2 = numero2.toInt()
                val calculo = numero1 * numero2
                binding.resultText.text = getString(R.string.resultado, calculo)
            }

        }


        binding.dividirButton.setOnClickListener {
            val numero1 = binding.primerNumeroIntroducido.text.toString()
            val numero2 = binding.segundoNumeroIntroducido.text.toString()

            if (numero1.isEmpty()||numero2.isEmpty()){
                //Mostramos un mensaje de tipo Toast para avisar al usuario de que introduzca un número
                Toast.makeText(this,getString(R.string.debes_numero),Toast.LENGTH_LONG).show()
            } else {
                val numero1 = numero1.toInt()
                val numero2 = numero2.toInt()
                val calculo = numero1 % numero2
                binding.resultText.text = getString(R.string.resultado, calculo)
            }

        }






        }


        }

