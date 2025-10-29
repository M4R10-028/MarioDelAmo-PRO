import random

digitos = tuple(str(i) for i in range(10))
letras = tuple("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
especiales = tuple("!@#$%^&*()_+-=[]{};:,<.>/?")

longitud = int(input("Longitud de la contraseña (8-64): "))

# Contraseña fuerte
num_dig = max(1, longitud * 20 // 100)
num_let = max(1, longitud * 40 // 100)
num_esp = longitud - num_dig - num_let

fuerte = (
    random.sample(digitos, num_dig)
    + random.sample(letras, num_let)
    + random.sample(especiales, num_esp)
)
random.shuffle(fuerte)
print("Contraseña fuerte:", "".join(fuerte))

# Contraseña débil
num_dig = max(1, longitud * 80 // 100)
num_let = max(1, longitud * 15 // 100)
num_esp = longitud - num_dig - num_let

debil = (
    random.sample(digitos, num_dig)
    + random.sample(letras, num_let)
    + random.sample(especiales, num_esp)
)
random.shuffle(debil)
print("Contraseña débil:", "".join(debil))
