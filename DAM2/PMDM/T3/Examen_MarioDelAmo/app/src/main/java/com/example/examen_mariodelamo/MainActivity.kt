package com.example.examen_mariodelamo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen_mariodelamo.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

/*
* Realizar una aplicación que permita visualizar cual es la etiqueta de la DGT que le
corresponde a un coche. Para ello la aplicación contará con las siguientes pantallas:
- Una primera pantalla que tenga un formulario de introducción de coches. En
dicho formulario se podrá introducir los siguientes datos:
o Nombre y apellidos del propietario (EditText)
o Matrícula del coche (EditText)
o Año de matriculación (EditText)
o Tipo de gasolina: diésel, gasolina, hibrido, eléctrico (Spinner
personalizado con icono + nombre)
o Autonomía (EditText)
o Botón para poder cambiar de pantalla (Button)
Esta pantalla tendrá elsiguiente comportamiento:
o Si se selecciona híbrido o eléctrico en el tipo de combustible, el año de
matriculación se desactivará y se pondrá por defecto 2018. En
cualquier otro caso se activará y se podrá introducir
o Si se selecciona híbrido se activa el campo autonomía. En cualquier
otro caso se desactiva.
o En caso de pulsar el botón y faltar datos por rellenar saltará un
snackbar con el aviso.

- Una segunda pantalla que muestre en etiquetas los datos del coche
introducidos en TextView además de la imagen con la etiqueta asignada por
parte de la DGT. Los criterios son los siguientes
o Si el coche es eléctrico tiene etiqueta 0
o Si el coche es híbrido
• En caso de tener una autonomía > 80km tendrá etiqueta 0. En
caso contrario tendrá etiqueta eco

o Si el coche es diésel y su año de matriculación esta entre 2006 y 2015 es
un C
o Si el coche es gasolina y su año de matriculación está entre 2008 y 2017
su etiqueta es C
o En el resto de los casos la etiqueta será B
• Es importante que cada uno de los campos del formulario tan solo pueda admitir
los datos correctos*/

class MainActivity : AppCompatActivity() {
    lateinit var botonEnviar : Button
    lateinit var textoNombre : EditText
    lateinit var textoMatricula : EditText
    lateinit var textoAnio : EditText
    lateinit var textoAutonomia : EditText
    lateinit var spinnerCombustible : Spinner

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        instancias()
        acciones()
    }

    private fun instancias() {
        botonEnviar = binding.buttonEnviar
        textoNombre = binding.editTextNombre
        textoMatricula = binding.editTextMatricula
        textoAnio = binding.editTextAnioMatriculacion
        textoAutonomia = binding.editTextAutonomia
        spinnerCombustible = binding.spinnerTipoGasolina
        spinnerCombustible = listOf("Gasolina + ${R.drawable.gasolina}", "Diésel + ${R.drawable.diesel}", "Híbrido + ${R.drawable.hibrido}", "Eléctrico + ${R.drawable.electrico}") as Spinner
    }


    private fun acciones() {
        spinnerCombustible.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                val selectedOption = parent.getItemAtPosition(position).toString()
                when (selectedOption) {
                    "Híbrido" -> {
                        textoAnio.isEnabled = false
                        textoAnio.setText("2018")
                        textoAutonomia.isEnabled = true
                    }
                    "Eléctrico" -> {
                        textoAnio.isEnabled = false
                        textoAnio.setText("2018")
                        textoAutonomia.isEnabled = false
                        textoAutonomia.setText("")
                    }
                    else -> {
                        textoAnio.isEnabled = true
                        textoAutonomia.isEnabled = false
                        textoAutonomia.setText("")
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }

        botonEnviar.setOnClickListener {
            if (textoNombre.text.isEmpty() || textoMatricula.text.isEmpty() || textoAnio.text.isEmpty() ||
                    (spinnerCombustible.selectedItem.toString() == "Híbrido" && textoAutonomia.text.isEmpty())) {
                Snackbar.make(
                    binding.root, "Faltan datos por rellenar", Snackbar.LENGTH_LONG
                ).show()

            } else {
                val intent: Intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("nombre", textoNombre.text.toString())
                intent.putExtra("matricula", textoMatricula.text.toString())
                intent.putExtra("anio", textoAnio.text.toString().toInt())
                intent.putExtra("combustible", spinnerCombustible.selectedItem.toString())
                intent.putExtra("autonomia", if (textoAutonomia.text.isEmpty()) 0 else textoAutonomia.text.toString().toInt())
                startActivity(intent)
            }
        }
    }
}