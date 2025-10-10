numero = int(input("Escribe el numero del tamaño de la matriz de numeros enteros que introduzcas: "))
numeros = []
numeros2 = []

print("-----------------------------------")
for i in range(1, numero+1):
    for j in range(1, numero+1):
        print("Numero que quieres introducir en la posicion", j-1,"", i-1, "para la primera matriz: ")
        num = int(input())
        numeros.append(num)
        
        print("Numero que quieres introducir en la posicion", j-1,"", i-1, "para la segunda matriz: ")
        num2 = int(input())
        numeros2.append(num2)
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

print("--------------------")

num3 = 0
for i in range(1,numero+1):
    
    for j in range(1,numero+1):
        
        print(numeros2[num3],end="")
        num3 += 1
        
    print()

print("-----------------------------------")
print("La suma de las dos matrices es: ")

numS = 0
for i in range(1,numero+1):
    
    for j in range(1,numero+1):
        
        print(numeros[numS] + numeros2[numS],end="")
        numS += 1
        
    print()
print("-----------------------------------")