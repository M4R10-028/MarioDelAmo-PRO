numero = int(input("Instroduce el numero por teclado: "))
print("--------------------------")
for i in range(1,numero+1):
    num = 1
    for j in range(1,numero+1):
        print(num, end="")
        num = j + 1
    print()
print("--------------------------")
        