// alert -> feedback informativo
//confirm -> feedback de confirmacion
//prompt -> feedback de entrada de datos
let nombre = "Borja Martin";
let edad = 41;
/* alert(`Primera pagina dinamica de ${nombre}`); */
/* let respuesta = confirm("Estas seguro que quieres continuar?");

if (respuesta) {
  alert(`Bienvenido ${nombre} a la segunda parte del ejercicio`);
} else {
  alert("No has querido continuar");
} */

let nombrePrompt = prompt("Introduce tu nombre", "Nombre Usuario");
console.log(nombrePrompt);

if (nombrePrompt != null) {
  let operar = confirm(`¿Quieres hacer operaciones ${nombrePrompt}?`);

  if (operar) {
    let operando1 = Number(prompt("Introduce el primer operando", 4));
    let operando2 = Number(prompt("Introduce el segundo operando", 2));

    if (isNaN(operando1) || isNaN(operando2)) {
      alert("Por favor introduce numeros validos para las operaciones");
    }

    let Suma = operando1 + operando2;
    let Resta = operando1 - operando2;
    let Multiplicacion = operando1 * operando2;
    let Division = operando1 / operando2;

    console.log(`Suma: ${Suma}`);
    console.log(`Resta: ${Resta}`);
    console.log(`Multiplicacion: ${Multiplicacion}`);
    console.log(`Division: ${Division}`);
  } else {
    alert(`Adios ${nombrePrompt}, hasta la proxima!`);
  }
} else {
  alert("No has insertado un Nombre");
}
/* Pedir por prompt un nombre */
/* Una vez introducido, preguntar al usuario si quiere hacer operaciones */
/* en caso dde que si, preguntar por operando1 y operando2 */
/* mostrar por consola todos los resultados de las operaciones (+ , -, *, /) */
/* En caso de que no, mostrar un mensaje de despedida */
