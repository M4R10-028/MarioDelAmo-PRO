package model

open class Participante(var id : Int, var nombre : String, var plantilla : ArrayList<Jugador> = ArrayList(), var puntos : Int, var presupuesto : Int = 18000000) {
    fun ficharJugador(jugador: Jugador){
        plantilla.add(jugador)
        presupuesto -= jugador.valor
    }
}