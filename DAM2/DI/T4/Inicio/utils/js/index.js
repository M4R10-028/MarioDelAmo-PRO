console.log("Esta ejecucion se llama desde el JS independiente");
/*let datos = "Pagina JS";
var asignatura = "DI";
if (true) {
  const DNI = "1234A";
  let nombre = "Borja"; //Variable que guarda el ambito
  console.log(nombre);
  DNI = "2345A";
}

console.log(datos);
console.log(asignatura);*/
let nombre = "Borja"; //string
let edad = 41; //number -> int
let altura = 1.74; //number -> number -> double / float
let experiencia = false; //bool
let elementos = []; // object -> Array
let cosa = null; //object -> null
let dato; // undefined
//NaN -> "Not a Number" -> isNaN()

/*console.log("Mi nombre es: "+nombre+"tengo experiencia en el sector "+experiencia)*/
/* 
console.log(`Mi nombre es ${nombre} y tengo experiencia en el sector ${experiencia}`)
 */
//alert(`Bienvenido ${nombre}, vamos a realiar interacciones`)
/* let respuesta = confirm("Estas seguro que quieres continuar")
if (respuesta){
    alert("El usuario ha contestado true")
} else {
    alert("El usuario ha contestado false")
} */

let respuesta = prompt("Por favor introduce tu nombre");
console.log("La respuesta del usuario es " + respuesta); 
