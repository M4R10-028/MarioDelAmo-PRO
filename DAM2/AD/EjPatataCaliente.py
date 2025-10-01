import random
import time

tiempo = random.randint(8,15)
secreto = random.randint(1,101)

print(f"Tienes {tiempo} segundos para adivinar el numero secreto")
inicio = time.time()

while True:
    transcurrido = time.time() - inicio
    restante = tiempo - int(transcurrido)
    
    if restante <= 0:
        print(f"Se acabo el tiempo, el numero secreto era {secreto}")
        break
    numero = int(input("Adivina el numero:"))
    if secreto > numero:
        print(f"El numero secreto es mayor. Te quedan {restante} segundos")
    elif secreto < numero:
        print(f"El numero secreto es menor. Te quedan {restante} segundos")
    else:
        print(f"Adivinaste el numero secreto en {int(transcurrido)} segundos")
        break