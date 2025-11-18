package com.example.examen_mariodelamo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen_mariodelamo.databinding.ActivitySecondBinding

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


class SecondActivity : AppCompatActivity() {
    lateinit var textoNombre : String
    lateinit var textoMatricula : String
    lateinit var textoAnio : String
    lateinit var textoCombustible : String
    lateinit var textoAutonomia : String

    lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        capturarDatos()
        acciones()
    }

    private fun acciones() {
        binding.textViewNombre.text = textoNombre
        binding.textViewMatricula.text = textoMatricula
        binding.textViewAnioMatriculacion.text = textoAnio
        binding.textViewCombustible.text = textoCombustible
        binding.textViewAutonomia.text = textoAutonomia

        if (textoCombustible == "Eléctrico"){
            binding.imagenEtiqueta.setImageResource(R.drawable.etiqueta0)
        } else if (textoCombustible == "Híbrido"){
            if (textoAutonomia.toInt() > 80){
                binding.imagenEtiqueta.setImageResource(R.drawable.etiqueta0)
            } else {
                binding.imagenEtiqueta.setImageResource(R.drawable.etiquetaeco)
            }
        } else if (textoCombustible == "Diésel"){
            if (textoAnio.toInt() in 2006..2015){
                binding.imagenEtiqueta.setImageResource(R.drawable.etiquetac)
            } else if (textoAnio.toInt() > 2015){
                binding.imagenEtiqueta.setImageResource(R.drawable.etiquetab)
            } else {
                binding.imagenEtiqueta.setImageResource(R.drawable.x)
            }
        } else if (textoCombustible == "Gasolina"){
            if (textoAnio.toInt() in 2008..2017){
                binding.imagenEtiqueta.setImageResource(R.drawable.etiquetac)
            } else if (textoAnio.toInt() > 2017){
                binding.imagenEtiqueta.setImageResource(R.drawable.etiquetab)
            } else {
                binding.imagenEtiqueta.setImageResource(R.drawable.x)
            }
        }
    }

    private fun capturarDatos() {
        textoNombre = intent.getStringExtra("NOMBRE")!!.toString()
        textoMatricula = intent.getStringExtra("MATRICULA")!!.toString()
        textoAnio = intent.getStringExtra("ANIO")!!.toString()
        textoCombustible = intent.getStringExtra("COMBUSTIBLE")!!.toString()
        textoAutonomia = intent.getStringExtra("AUTONOMIA")!!.toString()
    }


}