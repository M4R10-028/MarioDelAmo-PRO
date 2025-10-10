fila1 = []
fila2 = []
fila3 = []
fila4 = []
fila5 = []

for i in range (0,5):
    print("Escribe el valor de la posicion " + str(i + 1) + " de la fila 1")
    numero = int(input())
    fila1.append(numero)

for i in range (0,5):
    print("Escribe el valor de la posicion " + str(i + 1) + " de la fila 2")
    numero = int(input())
    fila2.append(numero)
    
for i in range (0,5):
    print("Escribe el valor de la posicion " + str(i + 1) + " de la fila 3")
    numero = int(input())
    fila3.append(numero)
    
for i in range (0,5):
    print("Escribe el valor de la posicion " + str(i + 1) + " de la fila 4")
    numero = int(input())
    fila4.append(numero)
    
for i in range (0,5):
    print("Escribe el valor de la posicion " + str(i + 1) + " de la fila 5")
    numero = int(input())
    fila5.append(numero)
    
    
filas = [fila1, fila2, fila3, fila4, fila5]

repetirCentral = input("Quieres repetir el numero central (S / N)")

suma = 0
for i in range(0,5):
    suma += filas[i][i]
    suma += filas[i][4-i]

if repetirCentral == "N":
    suma -= 13

print(suma)