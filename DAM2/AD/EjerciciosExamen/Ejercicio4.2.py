numero = int(input("Escribe el numero del tamaño de la matriz de impares: "))
num = 1
print("-----------------------------------")
for i in range(1, numero+1):
    for j in range(1, numero+1):
        print(num,"  ", end="")
        num += 2
    print()
print("-----------------------------------")
