class Jugador {
  nombre;
  valor;
  posicion;
  nacionalidad;

  constructor(nombre, valor, posicion, nacionalidad) {
    this.nombre = nombre;
    this.valor = valor;
    this.posicion = posicion;
    this.nacionalidad = nacionalidad;
  }

  mostrarDatos() {
    console.log(this.nombre);
    console.log(this.valor);
    console.log(this.posicion);
    console.log(this.nacionalidad);
  }

  get getNombre() {
    return this.nombre;
  }

  set setNombre(nombre) {
    this.nombre = nombre;
  }

  get getValor() {
    return this.valor;
  }

  get getPosicion() {
    return this.posicion;
  }

  set setNacionalidad(nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
}

class Equipo {
  nombre;
  presupuesto;
  jugadores;

  constructor(nombre, presupuesto) {
    this.nombre = nombre;
    this.presupuesto = presupuesto;
    this.jugadores = [];
  }

  mostrarJugadores() {
    this.jugadores.forEach((element) => {
      element.mostrarDatos();
    });
  }

  ficharJugador(jugador) {
    if (jugador.valor < this.presupuesto) {
      this.presupuesto -= jugador.valor;
      this.jugadores.push(jugador);
    } else {
      console.log("No hay dinero para fichar este jugador");
    }

    // esto es como si fuera un if         si da true    si da false
    // jugador.valor < this.presupuesto ? asdasdasdasd : asdasdasdasd
  }
}
