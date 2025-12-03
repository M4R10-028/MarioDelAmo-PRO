let lista = ["Palabra1","Palabra2","Palabra3"];
lista.push("Palabra4", "Palabra5");
lista.unshift("Palabra6", "Palabra7");
//lista[2] = "Palabra8";
//lista[100] = "Palabra100"; Se guardan los espacios vacios
lista.pop();
lista.shift();
//console.log(lista);

lista = lista.filter((element, index) => {
    return element != "Palabra3";
});

element = lista.find((element) => {
    return element != "Palabra3";
});

console.log(lista);