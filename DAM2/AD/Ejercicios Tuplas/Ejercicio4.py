miTupla = (1,2,3,"cuatro","cinco")

valor = input("Introduce el valor a comprobar si esta en la tupla")

if valor.isDigit():
    valor = int(valor)
    
if valor in miTupla:
    print("El valor esta en la tupla")
else:
    print("El valor no esta en la tupla")