import math
import random
1.
suma = 0


for num in range(1, 11):
    suma = suma + num


print("La suma de los 10 primeros numeros es de: ", suma)

2.
num = int(input("Ingrese un numero para calcular un factorial"))
factorial = num


for fact in range(1, num):
    factorial = factorial * fact

print("EL factorial de", num, "es de", factorial)

3.


def esPrimo(num):
    for primo in range(2, num):
        if (num % primo == 0):
            return False

    return True


print("Los numeros primos son: ")
for numero in range(1, 51):
    if esPrimo(numero):
        print(numero)


4.
numero = int(input("Dame el número: "))


suma = 0
n = numero
while n > 0:
    suma += n % 10
    n //= 10


print("La suma de las cifras del numero", numero, "es:", suma)


5.
suma = 0
for num in range(1, 101):
    if num % 2 == 0:
        suma += num

print("La suma de los numeros pares entre el 1 al 100 es de", suma)

6.
base = int(input("Dame la base del triangulo"))
altura = int(input("Dame la altura del triangulo"))


area = (base*altura)/2


print("El area del triangulo es", area)


7.
for num in range(1, 101):
    if num % 3 == 0 and num % 5 == 0:
        print(num, ", Fizz Buzz")
    elif num % 3 == 0:
        print(num, ", Fizz")
    elif num % 5 == 0:
        print(num, ", Buzz")
    else:
        print(num)


8.


num = int(input("Ingrese el numero para adivinar el numero entre el 1 y el 10"))


aleatorio = random.randint(1, 11)


if num == aleatorio:
    print("Has adivinado el numero")
else:
    print("Has perdido, el numero era", aleatorio)

9.
#Ejercicio de listas
10.
entrada = str(input("Ingresa una palabra"))


a = str("a")
e = str("e")
i = str("i")
o = str("o")
u = str("u")


contador = 0


for letra in entrada:
    if letra == a or letra == e or letra == o or letra == i or letra == u:
        contador += 1

print("En la palabra hay", contador, "vocales")

11.
palabra = str(input("Ingresa la palabra para comprobar si es palindroma: "))
longitud = int(len(palabra))
i = 1
palindroma = True


for letra in range(0, longitud//2 - 1):
    if palabra[letra] != palabra[longitud-i]:
        palindroma = False
    i += 1
if palindroma:
    print("Es una palabra palindroma")
else:
    print("No es una palabra palindroma")

12.


radio = int(input("Dime el radio del circulo"))


area = (radio * radio) * math.pi


print("El area del circulo es:", area)


13.
numero = int(input("Escribe el numero para la tabla de multiplicar"))


for n in range(0, 11):
    print(numero, "x", n, "=", numero*n)

14.
suma = 0


for n in range(1, 101):
    if (n % 2 != 0):
        suma = suma + n

print("La suma de los numeros impares del 1 al 100 es de", suma)

15.
cadena = str(input("Introduce una cadena de texto"))


a = str("a")
contador = 0


for letra in cadena:
    if letra == a:
        contador += 1

print("En la cadena habían", contador, "a")

16.


num1 = int(input("Primer numero para el mcd: "))
num2 = int(input("Segundo numero para el mcd: "))


print("El máximo común divisor de ", num1,
      "y", num2, "es", math.gcd(num1, num2))

17.
# Ejercicio de listas


18.


eleccion = str(input("Piedra, Papel, Tijeras"))
ordenador = ""
elec = random.randint(1, 4)


if elec == 1:
    ordenador = "Piedra"
elif elec == 2:
    ordenador = "Papel"
else:
    ordenador = "Tijeras"

if eleccion == ordenador:
    print("Empate")
elif eleccion == "Piedra" and ordenador == "Papel":
    print("El ordenador ha sacado papel, has perdido")
elif eleccion == "Piedra" and ordenador == "Tijeras":
    print("El ordenador ha sacado tijeras, has ganado")
elif eleccion == "Papel" and ordenador == "Piedra":
    print("El ordenador ha sacado piedra, has ganado")
elif eleccion == "Papel" and ordenador == "Tijeras":
    print("El ordenador ha sacado tijeras, has perdido")
elif eleccion == "Tijeras" and ordenador == "Piedra":
    print("El ordenador ha sacado piedra, has perdido")
else:
    print("El ordenador ha sacado papel, has ganado")
