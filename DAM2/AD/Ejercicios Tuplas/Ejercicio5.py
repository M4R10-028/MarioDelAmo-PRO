miTupla = (1,2,3,"cuatro","cinco")

valor1 = input("Introduce el primer valor: ")
valor2 = input("Introduce el segundo valor: ")
valor3 = input("Introduce el tercero valor: ")

valor1 = int(valor1) if valor1.isdigit() else valor1
valor2 = int(valor2) if valor2.isdigit() else valor2
valor3 = int(valor3) if valor3.isdigit() else valor3

miTupla = miTupla + (valor1,valor2,valor3)

print("La tupla resultante es: ",miTupla)