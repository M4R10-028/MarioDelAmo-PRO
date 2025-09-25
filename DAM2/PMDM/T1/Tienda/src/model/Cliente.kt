package model

class Cliente(var id : Int, var nombre : String) {

    lateinit var carrito : ArrayList<Producto>
    var factura : Double = 0.0

    init {
        // carrito = ArrayList()
        carrito = arrayListOf()
    }

    fun agregarProductoCarrito(producto : Producto){
        carrito.add(producto)
        println("Producto agregado correctamente al carrito")
    }

    //mostrar todos los elementos del carrito
    fun mostrarDatosCarrito(){
        if (carrito.isEmpty()){
            println("No hay nada en el carrito")
        }else {
            for (producto in carrito) {
                println(producto.toString())
            }
        }
    }

    fun mostrarProductoPosicion(posicion : Int) {
        if (posicion > carrito.size - 1){
            println("Posicion fuera de rango")
        } else {
            println(carrito[posicion].toString())
        }
    }

    // eliminar un producto del carrito
        // en caso de no estar el id en el carrito -> aviso de que no se encuentra
        // en caso de si estar en el carrito y solo existir uno, lo elimina
        // en caso de si estar en el carrito y existir varios, confirmacion de eliminar el primero o todos
    fun eliminarProductoCarrito(id : Int) {
        if (carrito.isEmpty()){
            println("El carrito esta vacio")
        } else {
            var estan = carrito.filter{
                return@filter it.id == id
            }

            println("En el carrito hay ${estan.size} productos con ese id")

            if (estan.isEmpty()){
                println("No hay un producto en el carrito con ese id")

            } else if (estan.size == 1){
                carrito.remove(estan.first())
                println("Borrado correctamente")
            } else {
                println("Se han encontrado varios con ese id, " +
                        "cual quieres borrar (1para el primero / n para todos)")
                var opcion = readln()

                if (opcion.equals("1",true)){
                    carrito.remove(estan.first())
                } else if (opcion.equals("n",true)){
                    carrito.removeAll(estan.toSet())
                } else {
                    println("Era o 1 o n no $opcion")
                }
            }

        }
    }

    //hacer un metodo para calcular la factura del cliente
    // cuando un cliente pide la factura se muestra por consola y vacia el carrito

    fun calcularFactura(){
        if (carrito.isEmpty()){
            println("No hay nada en el carrito, no debes nada")
        } else {
            carrito.forEach{
                factura += it.precio + factura
            }

            println("La factura es de $factura")
            factura = 0.0
            carrito.clear()
            println("Pagada correctamente")
        }
    }

    override fun toString(): String {
        return "Cliente(id=$id, nombre='$nombre', carrito=${carrito ?: "Nada en el carrito"})"
    }
}