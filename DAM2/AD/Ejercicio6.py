entrada = input("Ingrese un dato: ")

try:
    valor = eval(entrada)   
    print("El tipo de dato es:", type(valor))
except:
    print("El tipo de dato es:", type(entrada))