package com.example.loginapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivitySecondBinding
import com.example.loginapp.model.Usuario

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    var usuario: Usuario? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        usuario = intent.getSerializableExtra("nombre") as Usuario
        binding.textoSaludo.text = "Bienvenido ${usuario?.correo}"
        binding.textoPlataforma.text = "Sesion iniciada con ${usuario?.plataforma}"

    //binding.textoSaludo.setText("Bienvenido ${intent.getStringExtra("correo")!!}")
    }
}