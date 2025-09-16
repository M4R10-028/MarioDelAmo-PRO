peso = float(input("Introduce el peso de la persona en kilos: "))
altura = float(input("Introduce la altura de la persona en metros: "))

imc = int(peso / (altura**2))

print(f"\nEl imc de esta persona es de {imc}\n")