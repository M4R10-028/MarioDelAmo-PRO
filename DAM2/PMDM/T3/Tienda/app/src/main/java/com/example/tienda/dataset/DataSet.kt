package com.example.tienda.dataset

import com.example.tienda.model.Producto

class DataSet {

    companion object{
        var lista : ArrayList<Producto> = arrayListOf(
            Producto(1,"Armario",121,10.0,"descripcion", "muebles",0),
            Producto(2,"Puertas",122,20.0,"descripcion", "muebles",0),
            Producto(3,"Movil",123,30.0,"descripcion", "tecnologia",0),
            Producto(4,"Portatil",124,40.0,"descripcion", "tecnologia",0),
            Producto(5,"Pantalones",125,50.0,"descripcion", "ropa",0),
            Producto(6,"Camiseta",126,60.0,"descripcion", "ropa",0),
         )

        var listaCarrito : ArrayList<Producto> = arrayListOf()

        fun addProducto(x : Producto){
            listaCarrito.add(x)
        }

        fun getListaFiltrada(categoria: String) : ArrayList<Producto>{
            if (categoria.equals("todos",true)){
                return lista
            }
            return lista.filter { it.categoria.equals(categoria,true) } as ArrayList<Producto>
        }
    }

}