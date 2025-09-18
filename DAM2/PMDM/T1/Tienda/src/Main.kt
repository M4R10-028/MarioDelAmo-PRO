import model.Producto

fun main() {

    var camiseta : Producto = Producto (id = 1, precio = 14.99)
    var zapatillas : Producto = Producto (2)
    var pantalones : Producto = Producto(3,30.0,"Pantalones")
    var gorra : Producto = Producto(4,30.0, descripcion = "Gorra molona")
    var cartera : Producto = Producto(5,30.0, "Cartera","Cartera para guardar la pasta")

    val listaProduductos : Array<Producto?> = arrayOf(camiseta, zapatillas, pantalones, gorra, cartera)

    listaProduductos[1] = null

    for (i in listaProduductos) {
        println(i?.toString())
    }
}