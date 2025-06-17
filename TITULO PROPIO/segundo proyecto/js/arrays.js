// En Java
// array -> no dinamico
// arraylist -> dinamico

let numeros = [2521, 53426, 743, 454, 5125, 654, 1237, true, false, "hola"]; // los tipos de este array son ANY

// obtener un dato
numeros[1];
numeros[numeros.length - 1];
// cuantos tengo
numeros.length;
// modifico un elemento
numeros[0] = 1;
// agregar un array
numeros[16] = 234123;

// como obtener todos los numeros de un array
/* for (let index = 0; index < numeros.length; index++) {
    console.log(numeros[index]);
} */

numeros.forEach((item, index) => {
  if (index % 2 == 0) {
    console.log(`Posicion ${index} -> ${item}`);
  }
});

// item/element -> el elemento del array que estoy iterando
// index -> la posicion del array
// a -> el array que se recorre

let tareas = ["Programar", "Documentar", "Probar", "Presentar"];
//length -> 4

//Añade cosas al array -> Al final
tareas.push("Testea", "Modificar", "Gestionar");
//Añade cosas al array -> Al principio
tareas.unshift("Planificar", "Entrevistar");

//Borra el ultimo elemento del array
console.log(`El elemento borrado es ${tareas.pop}`);
//Borra el primer elemento del array
console.log(`El elemento borrado es ${tareas.shift}`);

tareas.forEach((item, index) => console.log(`${index} - ${item}`));

let elementoBuscado = tareas.find((item) => {
  return item.length == 6;
  /*   if (item.length == 6) {
    return true;
  }
  return false;*/
});

let elementoBuscado2 = tareas.find((item) => item.length == 16);
let elementosBuscados = tareas.filter((item, index) => {
  return item.length == 6;
});

console.log(elementosBuscados);

tareas = tareas.filter((item) => item != "Presentar");

console.log(tareas);
