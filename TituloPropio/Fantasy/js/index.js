let botonAgregar = document.querySelector("#botonAgregar");
let inputNombreEquipo = document.querySelector("#inputNombreEquipo");
let inputPresupuestoEquipo = document.querySelector("#inputPresupuestoEquipo");
let selectEstadoEquipo = document.querySelector("#selectEstadoEquipo");
let listaEquipos = document.querySelector("#listaEquipos");

let divEquipos = document.querySelector("#divEquipos");
let botonComenzar = document.querySelector("#botonComenzar");
let botonResetear = document.querySelector("#botonResetear");
let botonJugadores = document.querySelector("#botonJugadores");
let botonTerminar = document.querySelector("#botonTerminar");

let comienzo = false;
let equipos = [];

botonAgregar.addEventListener("click", (event) => {
  let nombre = inputNombreEquipo.value;
  let presupuesto = Number(inputPresupuestoEquipo.value);
  let estado = Number(selectEstadoEquipo.value);

  if (nombre.length > 0 && presupuesto > 0 && estado != 0) {
    let encontrado = equipos.find(
      (item) => item.nombre.toLowerCase() == nombre.toLowerCase()
    );
    if (!encontrado) {
      agregarEquipo(new Equipo(nombre, presupuesto, estado));
      lanzaarMensaje("Equipo agregado correctamente", "success");
    } else {
      lanzaarMensaje("El equipo ya existe", "error");
    }
  } else {
    lanzaarMensaje("Por favor, completa todos los campos", "error");
  }
});

botonComenzar.addEventListener("click", () => {
  if (!comienzo) {
    equipos.forEach((equipo) => crearCartaEquipo(equipo));
    comienzo = true;
  } else {
    lanzaarMensaje("Ya se ha comenzado el juego", "warning");
  }
});

botonResetear.addEventListener("click", () => {
  if (!comienzo) {
    lanzaarMensaje("No se ha comenzado el juego", "warning");
  } else {
    lanzarDialogo(
      "¿Deseas mantener los equipos en el juego ?",
      "Reiniciar Juego",
      "Mantener",
      "No mantener"
    );
  }
});

botonJugadores.addEventListener("click", () => {
  if (equipos.length === 0) {
    lanzaarMensaje("No hay equipos inscritos", "error");
    return;
  }

  if (!jugadores || jugadores.length === 0) {
    lanzaarMensaje("No hay jugadores disponibles", "error");
    return;
  }

  // Copia y mezcla los jugadores
  let jugadoresDisponibles = [...jugadores].sort(() => 0.5 - Math.random());

  equipos.forEach((equipo) => {
    equipo.plantilla = []; // Limpiar plantilla actual
    let presupuestoRestante = equipo.presupuesto;

    // Repartir hasta 3 jugadores por equipo
    for (let i = 0; i < jugadoresDisponibles.length && equipo.plantilla.length < 3; i++) {
      let jugador = jugadoresDisponibles[i];
      if (jugador.valor <= presupuestoRestante) {
        equipo.plantilla.push(jugador);
        presupuestoRestante -= jugador.valor;

        // Eliminar jugador del array disponible
        jugadoresDisponibles.splice(i, 1);
        i--; // ajustar índice
      }
    }
  });

  equipos.forEach((equipo) => {
    console.log(`Equipo: ${equipo.nombre}`);
    equipo.plantilla.forEach((j) =>
      console.log(`- ${j.nombre} (${j.puntos} pts | ${j.valor}€)`)
    );
    console.log("-----");
  });

  lanzaarMensaje("Jugadores repartidos: 3 por equipo según presupuesto", "success");
});

// Función para calcular puntaje según estado y jugadores
function calcularPuntajeConEstado(equipo) {
  let puntosJugadores = equipo.plantilla.reduce((acc, jugador) => acc + jugador.puntos, 0);
  let multiplicador = 1;

  switch (equipo.estadoDeForma) {
    case 1: // En forma
      multiplicador = 1.2;
      break;
    case 2: // Cansado
      multiplicador = 0.8;
      break;
    case 3: // Fundido
      multiplicador = 0.5;
      break;
    default:
      multiplicador = 1;
  }

  return Math.round(puntosJugadores * multiplicador);
}


botonTerminar.addEventListener("click", terminarJuego);

function lanzarDialogo(mensaje, titulo, botonConfirmar, botonCancelar) {
  Swal.fire({
    title: titulo,
    text: mensaje,
    icon: "warning",
    showDenyButton: true,
    showCancelButton: true,
    confirmButtonText: botonConfirmar,
    denyButtonText: botonCancelar,
  }).then((result) => {
    if (result.isConfirmed) {
      divEquipos.innerHTML = "";
      comienzo = false;
    } else if (result.isDenied) {
      divEquipos.innerHTML = "";
      listaEquipos.innerHTML = "";
      equipos = [];
      comienzo = false;
    }
  });
}

function crearCartaEquipo(equipo) {
  let nodoDiv = document.createElement("div");
  nodoDiv.className = "col animate__animated animate__fadeIn";
  nodoDiv.innerHTML = `<flip-card variant="click" class="trivia-card">
            <div slot="front">
              <div class="card">
                <img src="..." class="card-img-top" alt="..." />
                <div class="card-body">
                  <h5 class="card-title">${equipo.nombre}</h5>
                  <p class="card-text">${equipo.estado}</p>
                </div>
              </div>
            </div>
            <div slot="back">
              <div class="card">
                <img src="..." class="card-img-top" alt="..." />
                <div class="card-body">
                  <h5 class="card-title">${equipo.nombre}</h5>
                  <p class="card-text">Presupuesto ${equipo.presupuesto}</p>
                </div>
              </div>
            </div>
          </flip-card>`;
  divEquipos.append(nodoDiv);
}

function lanzaarMensaje(mensaje, tipo) {
  Swal.fire({
    position: "center",
    icon: tipo,
    title: mensaje,
    timer: 3000,
    showConfirmButton: false,
  });
}

function limpiarFormulario() {
  inputNombreEquipo.value = "";
  inputPresupuestoEquipo.value = "";
}

function agregarEquipo(equipo) {
  equipos.push(equipo);
  agregarNodoEquipo(equipo.nombre);
}

function agregarNodoEquipo(nombre) {
  let nodoLI = document.createElement("li");
  nodoLI.className =
    "list-group-item animate__animated animate__fadeInRight d-flex justify-content-between";
  nodoLI.innerText = nombre;
  let boton = document.createElement("button");
  boton.className = "btn btn-danger";
  boton.innerText = "Eliminar";
  boton.addEventListener("click", () => {
    elimiarEquipo(nombre);
    boton.parentElement.classList.add("animate__animated", "animate__fadeOutRight");
    setTimeout(() => {
      boton.parentElement.remove();
    }, 500);
  });
  nodoLI.append(boton);
  listaEquipos.append(nodoLI);
  limpiarFormulario();
}

function elimiarEquipo(nombre) {
  equipos = equipos.filter(
    (item) => item.nombre.toLowerCase() != nombre.toLowerCase()
  );
}

function calcularPuntajeConEstado(equipo) {
  // Suma de puntos de los jugadores en plantilla
  let puntosJugadores = equipo.plantilla.reduce((acc, jugador) => acc + jugador.puntos, 0);

  // Multiplicador según el estado de forma
  let multiplicador = 1;
  switch (equipo.estadoDeForma) {
    case 1: // En forma
      multiplicador = 1.2;
      break;
    case 2: // Cansado
      multiplicador = 0.8;
      break;
    case 3: // Fundido
      multiplicador = 0.5;
      break;
  }

  let puntajeBase = puntosJugadores * multiplicador;

  // Variación aleatoria de ±20% del puntaje base
  let variacionMax = 0.2 * puntajeBase;
  let factorAleatorio = (Math.random() * 2 - 1) * variacionMax;

  let puntajeFinal = puntajeBase + factorAleatorio;

  // Retornamos puntaje redondeado y no negativo
  return Math.max(0, Math.round(puntajeFinal));
}

function terminarJuego() {
  if (equipos.length === 0 || !comienzo) {
    lanzaarMensaje("Primero debes iniciar la liga y repartir jugadores", "warning");
    return;
  }

  equipos.forEach((equipo) => {
    equipo.puntaje = calcularPuntajeConEstado(equipo);
  });

  equipos.sort((a, b) => b.puntaje - a.puntaje);
  let ganador = equipos[0];

  let mensaje = `<h3>🏆 ${ganador.nombre} ha ganado con ${ganador.puntaje} puntos</h3><hr>`;
  mensaje += equipos
    .map((e) => `<p><strong>${e.nombre}:</strong> ${e.puntaje} pts</p>`)
    .join("");

  Swal.fire({
    icon: "success",
    title: "¡Liga finalizada!",
    html: mensaje,
  });
}
