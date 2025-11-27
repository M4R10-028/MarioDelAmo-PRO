let nombre = prompt("Introduce tu nombre: ");
let respuesta = true;

while (repuesta) {
  let var1 = Number(prompt("Introduce el primer numero: "));
  let var2 = Number(prompt("Introduce el segundo numero: "));

  if (isNaN(var1) && isNaN(var2)) {
    alert("Introduce solo numeros");
  } else {
    let operaciones = confirm("Quieres ver todas las operaciones: ");

    if (operaciones) {
      let suma = Number(var1) + Number(var2);
      alert(`La suma de los numeros ${var1} y ${var2} = ${suma}`);

      let resta = Number(var1) - Number(var2);
      alert(`La resta de los numeros ${var1} y ${var2} = ${resta}`);

      let multiplicacion = Number(var1) * Number(var2);
      alert(
        `La multiplicacion de los numeros ${var1} y ${var2} = ${multiplicacion}`
      );

      let division = Number(var1) / Number(var2);
      alert(`La suma de los numeros ${var1} y ${var2} = ${suma}`);
    }

    respuesta = confirm("Quieres hacer otras operaciones " + nombre + "?");
  }
}
