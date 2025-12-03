package com.example.tienda

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tienda.adapter.AdapterProducto
import com.example.tienda.databinding.ActivityMainBinding
import com.example.tienda.databinding.ItemProductoBinding
import com.example.tienda.dataset.DataSet
import com.example.tienda.model.Producto

class MainActivity : AppCompatActivity(), AdapterProducto.OnProductoCarritoListener {

    private lateinit var adapterProducto: AdapterProducto
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val lista: ArrayList<Producto> = DataSet.lista
        //quiero obtener la lista de los productos de una categoria determinada
        //categoria

        binding.textoContador.text = "${DataSet.listaCarrito.size}"
        adapterProducto = AdapterProducto(lista,this)

        if(resources.configuration.orientation == 1){
            binding.recyclerProductos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        } else {
            binding.recyclerProductos.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
            /* LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false) */
        }
        binding.recyclerProductos.adapter = adapterProducto

        acciones()

    }

    fun acciones() {
        binding.spinnerCategorias.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var categoriaSeleccionada = parent!!.adapter.getItem(position)
                var listaFiltrada = DataSet.getListaFiltrada(categoriaSeleccionada.toString())

                //adapterProducto = AdapterProducto(listaFiltrada,this@MainActivity)
                //binding.recyclerProductos.adapter = adapterProducto
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            //ver la activity del carrito
            R.id.menu_carrito->{}
            //filtrar la lista (no se filtra por el cambio)
            R.id.menu_filtrar->{}
            //quito el filtro de la lista, y pongo todos los elementos
            R.id.menu_limpiar->{}
        }
        return true;
    }

    override fun actualizarContadorCarrito() {
        binding.textoContador.text = DataSet.listaCarrito.size.toString()
    }
}