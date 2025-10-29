a = input("Introduce una letra: ")
x = input("Introduce un número: ")

if x.isdigit():
    x = int(x)

mi_tupla = (a, x)
print(mi_tupla)
