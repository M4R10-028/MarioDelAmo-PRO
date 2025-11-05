with open("Ficheros/palabras.txt", "r", encoding="utf-8") as f:
    contenido = f.read()

palabras = contenido.split()
num_palabras = len(palabras)


vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ"
num_vocales = sum(1 for letra in contenido if letra in vocales)


repeticiones = {}

for palabra in palabras:
    if palabra in repeticiones:
        repeticiones[palabra] += 1
    else:
        repeticiones[palabra] = 1


max_repeticiones = max(repeticiones.values())
mas_repetidas = [p for p, n in repeticiones.items() if n == max_repeticiones]


texto_salida = []
texto_salida.append(f"Número total de palabras: {num_palabras}")
texto_salida.append(f"Número total de vocales: {num_vocales}")
texto_salida.append("\nPalabras que se repiten y cuántas veces:")

for palabra, veces in repeticiones.items():
    if veces > 1:
        texto_salida.append(f" - {palabra}: {veces} veces")

texto_salida.append("\nPalabras más repetidas:")
for palabra in mas_repetidas:
    texto_salida.append(f" - {palabra} ({max_repeticiones} veces)")


print("\n".join(texto_salida))


with open("salida.txt", "w", encoding="utf-8") as f:
    f.write("\n".join(texto_salida))


texto_salida2 = ["Palabras que se repiten y cuántas veces:"]
for palabra, veces in repeticiones.items():
    if veces > 1:
        texto_salida2.append(f" - {palabra}: {veces} veces")

texto_salida2.append("\nPalabras más repetidas:")
for palabra in mas_repetidas:
    texto_salida2.append(f" - {palabra} ({max_repeticiones} veces)")

with open("salida2.txt", "w", encoding="utf-8") as f:
    f.write("\n".join(texto_salida2))
