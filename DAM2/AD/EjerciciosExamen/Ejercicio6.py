numero = int(input("Escribe el numero del tamaño de la matriz de 0: "))
print("-----------------------------------")
for i in range (1,numero+1):
    for j in range (1,numero+1):
        print((i - 1) + (j - 1), end="")
    print()
print("-----------------------------------")