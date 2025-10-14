numero = int(input("Escribe el numero del tamaño de la matriz de numeros enteros que introduzcas: "))
numeros = []

print("-----------------------------------")
for i in range(1, numero+1):
    for j in range(1, numero+1):
        print("Numero que quieres introducir en la posicion", j-1,"", i-1)
        num = int(input())
        numeros.append(num)
    print()

print("-----------------------------------")
print()
print("-----------------------------------")

num1 = 0
for i in range(1,numero+1):
    
    for j in range(1,numero+1):
        
        print(numeros[num1],end="")
        num1 += 1
        
    print()

print("-----------------------------------")