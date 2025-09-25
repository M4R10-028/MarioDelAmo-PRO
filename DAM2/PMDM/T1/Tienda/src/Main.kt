import model.Categoria
import model.Cliente
import model.Producto
import model.Tienda

fun main() {

    var camiseta : Producto = Producto (id = 1, precio = 14.99, categoria = Categoria.Ropa)
    var zapatillas : Producto = Producto (2)
    var pantalones : Producto = Producto(3,30.0,"Pantalones", categoria = Categoria.Ropa)
    var gorra : Producto = Producto(4,30.0, descripcion = "Gorra molona", categoria = Categoria.Ropa)
    var cartera : Producto = Producto(5,30.0, "Cartera","Cartera para guardar la pasta")
    var telefono : Producto = Producto(6,450.0,"Iphone 13","Telefono movil", categoria = Categoria.Tecnologia)

    val listaProductos : Array<Producto?> = arrayOf(camiseta, zapatillas, pantalones, gorra, cartera, telefono)
    val coviran : Tienda = Tienda("Coviran")
    var cliente : Cliente = Cliente(1,"Alejandro")
    cliente.agregarProductoCarrito(gorra)
    cliente.agregarProductoCarrito(pantalones)
    cliente.agregarProductoCarrito(telefono)
    //cliente.mostrarDatosCarrito()
    cliente.mostrarProductoPosicion(1)

    val listaProductoVacio: Array<Producto?> = arrayOfNulls(5)

    listaProductos[1] = null

    coviran.almacen = listaProductos

    coviran.mostrarAlmacen()

    coviran.venderProducto(3)

    coviran.buscarProductosCategoria(Categoria.Ropa)

    cliente.calcularFactura()
    cliente.calcularFactura()


    /*for (i in listaProduductos) {
        println(i?.toString())
    }*/

    /*listaProductos.forEach {
        println(it?.toString())
    }*/

    /*listaProductos.forEachIndexed { index, producto ->
        println("Mostrando producto en posicion $index")
        println(producto?.toString())
    }*/

    //vamos a crear una tienda. Para ello crear la clase necesaria
    // donde se pueda asignar
    //1. Nombre a la tienda (obligatorio)
    //2. Almacen: sitio donde se guardan los prodcutos.
    //   Tiene un tamaño fijo de 6
    //3. Caja: se guarda la pasta cuando se venda un producto

    var tienda : Tienda = Tienda("Tienda")

}