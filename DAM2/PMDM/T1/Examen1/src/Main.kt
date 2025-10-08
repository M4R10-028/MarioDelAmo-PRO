import model.Administrador
import model.Fantasy
import model.Participante

fun main() {
    val fantasy = Fantasy()
    val administrador = Administrador(0,"Admin","1234")

    val participante1 = Participante(1, "P1", puntos = 0)
    val participante2 = Participante(2, "P2", puntos = 0)
    val participante3 = Participante(3, "P3", puntos = 0)
    val participante4 = Participante(4, "P4", puntos = 0)

    fantasy.agregarParticipante(participante1)
    fantasy.agregarParticipante(participante2)
    fantasy.agregarParticipante(participante3)
    fantasy.agregarParticipante(participante4)

    administrador.empezarLiga(administrador.clave, fantasy)



}