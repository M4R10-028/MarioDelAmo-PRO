// nominales - flecha
// nominales -> function (parametros){}
function realizarCalculo(op1, op2) {
  console.log(`La suma de los dos parametros es ${op1 + op2}`);
}

function realizarCalculoRetorno(op1, op2) {
return op1 + op2
}

function realizarCalculoDefecto(op1, op2 = 7) {
return op1 + op2
}

function realizarCalculoFantasma(op1, op2){
    console.log("Calculo fantasma")
    console.log(op1 + " es un parametro requerido")
    //arguments -> argumentos fantasma que son pasados adicionalmente..[]
    console.log("El numero de argumentos fantasmas es de " + arguments.length)
    //hagais la suma de todos los parametros que me pasan por parametros, indicando:
    //cuantos son pasados y cuantos son fantasmas
    // hay 4 argumentos , 3 fantasmas
    //la suma de todos es de 10
    let sumaPar = op1 + op2

    suma = 0
    
    let j = 0

    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]
        while(sumaPar > suma){
            j++
        }
    }

    alert(`Hay ${arguments.length} argumentos, ${arguments.length - j}`)
}

realizarCalculoFantasma(1,2,3,4,5,6)

realizarCalculo(3, 6);

console.log("El resultado de la suma de los dos valores es de " + realizarCalculoRetorno(4,5))
