package model

import kotlin.collections.forEach

class Fantasy () {
    var jugadores : ArrayList<Jugador> = ArrayList<Jugador>()
    var participantes : ArrayList<Participante> = ArrayList<Participante>()

    fun agregarJugadores(){
        jugadores.add(Jugador(1,"Marc-André ter Stegen", "Portero",3000000, 10))
        jugadores.add(Jugador(2,"Ronald Araújo", "Defensa",4000000, 0))
        jugadores.add(Jugador(3,"Eric García", "Defensa",1000000, 3))
        jugadores.add(Jugador(4,"Pedri", "Mediocentro",5000000, 23))
        jugadores.add(Jugador(5,"Robert Lewandowski", "Delantero",8000000, 15))
        jugadores.add(Jugador(6,"Courtois", "Portero",3000000, 1))
        jugadores.add(Jugador(7,"David Alaba", "Defensa",4000000,5))
        jugadores.add(Jugador(8,"Jesús Vallejo", "Defensa",500000, 10))
        jugadores.add(Jugador(9,"Luka Modric", "Mediocentro",5000000, 5))
        jugadores.add(Jugador(10,"Karim Benzema", "Delantero",8000000,10))
        jugadores.add(Jugador(11,"Ledesma", "Portero",500000,6))
        jugadores.add(Jugador(12,"Juan Cala", "Defensa",300000,3))
        jugadores.add(Jugador(13,"Zaldua", "Defensa",400000,6))
        jugadores.add(Jugador(14,"Alez Fernández", "Mediocentro",700000,9))
        jugadores.add(Jugador(15, "Choco Lozano", "Delantero", 800000,4))
        jugadores.add(Jugador(16,"Rajković", "Portero",300000,3))
        jugadores.add(Jugador(17,"Raíllo", "Defensa",200000,6))
        jugadores.add(Jugador(18,"Maffeo", "Defensa",300000,0))
        jugadores.add(Jugador(19,"Ruiz de Galarreta", "Mediocentro",400000, 7))
        jugadores.add(Jugador(20,"Remiro", "Portero",1000000,4))
        jugadores.add(Jugador(21,"Elustondo", "Defensa",900000,3))
        jugadores.add(Jugador(22,"Zubeldia", "Defensa",800000,5))
        jugadores.add(Jugador(23,"Zubimendi", "Mediocentro",1000000,6))
        jugadores.add(Jugador(24,"Take Kubo", "Delantero", 800000,7))
        jugadores.add(Jugador(25,"Ángel", "Delantero", 300000,4))
    }

    fun ficharJugadorId(idJ : Int, idP : Int) {
        var jugador = buscarJugador(idJ)
        if (jugador != null) {
            buscarParticipante(idP)!!.ficharJugador(jugador)
        }
        println("El jugador ha sido fichado correctamente")
    }

    fun buscarJugador (id : Int) : Jugador?{
        return jugadores.find { jugador -> jugador.id == id }
    }

    fun buscarParticipante(id : Int) : Participante?{
        return participantes.find { participante -> participante.id == id }
    }

    fun agregarParticipante(participante: Participante) {
        participantes.add(participante)
    }

    fun calcularPuntuacion(id: Int){
        var participante = buscarParticipante(id)
        if (participante != null){
            if (participante.plantilla.filter { jugador -> jugador.posicion.equals("Portero") }.size < 1 ){
                println("Jugador ${participante.nombre}, no tienes portero, no puedes puntuar")
                return
            } else if (participante.plantilla.filter { jugador -> jugador.posicion.equals("Defensa") }.size < 2){
                println("Jugador ${participante.nombre}, no tienes dos defensas, no puedes puntuar")
                return
            } else if (participante.plantilla.filter { jugador -> jugador.posicion.equals("Mediocentro") }.size < 2){
                println("Jugador ${participante.nombre}, no tienes dos mediocentros, no puedes puntuar")
                return
            } else if (participante.plantilla.filter { jugador -> jugador.posicion.equals("Delantero") }.size < 1) {
                println("Jugador ${participante.nombre},no tienes delantero, no `puedes puntuar")
                return
            } else if (participante.presupuesto < 0 ){
                println("Jugador ${participante.nombre}, tienes el presupuesto negativo, no puedes puntuar")
                return
            } else{
                participante.plantilla.forEach { jugador -> participante.puntos+= (jugador.puntuacion) }
            }
        }

    }

    fun verGanador(){
        var ganador = Participante(0,"P0", puntos = 0)
        participantes.forEach {
            if (it.puntos >= ganador.puntos){
                ganador = it
            }
        }
        println("El ganador es el participante ${ganador.nombre} con ${ganador.puntos}")
    }

    fun mostrarDatosJugadores(){
        jugadores.forEach {
            if(it.valor > 3000000) {
                it.mostrarDatos()
            }
        }
    }

}