package model

class Tienda (
    var nombre : String
){

    var caja : Double = 0.0
    lateinit var almacen : Array<Producto?>

    //init -> ejecuta si o si despues del constructor (primario o secundario)

    init {
        almacen = arrayOfNulls(6)
    }

    //un metodo para poder mostrar todos los productos del almacen. En caso de
    //tener todos los huecos disponibles(vacios) sacar un aviso

    fun mostrarAlmacen() {
        var nulos = 0

        almacen.forEach{
            if (it == null){
                nulos++
            }
            println(it?.toString())
        }

        if (nulos == almacen.size)
            println("No hay productos en el almacen")

    }

    fun guardarProducto (producto: Producto) {
        for (item in 0..almacen.size-1){
            if (almacen[item] == null){
                almacen[item] = producto
                println("El producto ha sido añadido")
                return
            }
        }
        println("El almacen esta lleno")
    }

    fun venderProducto(id : Int) {
        for (item in 0..almacen.size-1){
            if (almacen[item]?.id == id){
                caja += almacen[item]!!.precio
                almacen[item] = null
                println("El producto se ha eliminado del almacen")
                return
            }
        }
        println("El producto no se encuentra en el almacen")
    }

    fun buscarProductosCategoria(categoria: Categoria):Unit{
        //filtrando por categoria
        almacen.filter {
            return@filter it?.categoria == categoria
        }

    }

    fun buscarProducto(id : Int) : Unit{
        //buscando -> obtengo solo un elemento
        almacen.find {
            return@find it?.id == id
        }
    }
}