package model

class Administrador (id : Int, nombre : String, var clave : String){
    fun empezarLiga(clave : String, fantasy : Fantasy){
        if (this.clave == clave) {
            fantasy.agregarJugadores()
            fantasy.mostrarDatosJugadores()

            fantasy.ficharJugadorId(1,1)
            fantasy.ficharJugadorId(13,1)
            fantasy.ficharJugadorId(17,1)
            fantasy.ficharJugadorId(4,1)
            fantasy.ficharJugadorId(23,1)
            fantasy.ficharJugadorId(5,1)

            fantasy.ficharJugadorId(20,2)
            fantasy.ficharJugadorId(21,2)
            fantasy.ficharJugadorId(22,2)
            fantasy.ficharJugadorId(19,2)
            fantasy.ficharJugadorId(23,2)
            fantasy.ficharJugadorId(24,2)

            fantasy.ficharJugadorId(11,3)
            fantasy.ficharJugadorId(12,3)
            fantasy.ficharJugadorId(8,3)
            fantasy.ficharJugadorId(23,3)
            fantasy.ficharJugadorId(19,3)
            fantasy.ficharJugadorId(25,3)

            fantasy.ficharJugadorId(19,4)
            fantasy.ficharJugadorId(10,4)
            fantasy.ficharJugadorId(3,4)
            fantasy.ficharJugadorId(2,4)
            fantasy.ficharJugadorId(1,4)

            fantasy.calcularPuntuacion(1)
            fantasy.calcularPuntuacion(2)
            fantasy.calcularPuntuacion(3)
            fantasy.calcularPuntuacion(4)

            fantasy.verGanador()

        } else {
            println("Clave incorrecta")
        }
    }

}