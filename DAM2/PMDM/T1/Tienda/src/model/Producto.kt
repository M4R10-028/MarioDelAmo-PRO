package model

class Producto(var id : Int, var precio : Double = 10.0, var nombre: String? = null, var descripcion: String? = null, var categoria: Categoria = Categoria.Generica) {

    //Las cosas obligatorias las defino arriba, las que no, aquí
    //id
    //precio
    //nombre
    //descripcion

    override fun toString(): String {
        return "Producto: \nID=$id \nPrecio=$precio \nNombre='${nombre ?: "SIN NOMBRE"}' \nDescripcion='${descripcion ?: "SIN DEFINIR" }' \nCategoria= $categoria\n"
    }
}