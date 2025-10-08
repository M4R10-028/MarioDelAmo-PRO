import math

# Colores para la terminal
RED = "\033[91m"
GREEN = "\033[92m"
YELLOW = "\033[93m"
RESET = "\033[0m"
CYAN = "\033[96m"

# 🔒 Contraseña
contra1 = int(input("Introduce la contraseña: "))
contra = 1234
opcion = 0

# ➕ Funciones matemáticas


def suma(a, b): return a + b
def resta(a, b): return a - b
def multiplicacion(a, b): return a * b
def division(a, b): return a / b
def valorAbsoluto(a): return a if a >= 0 else -a
def seno(g): return math.sin(math.radians(g))
def coseno(g): return math.cos(math.radians(g))
def tangente(g): return math.tan(math.radians(g))
def logaritmo10(n): return math.log10(n)
def logaritmoN(n): return math.log(n)
def eElevadoX(n): return math.exp(n)
def raizCuadrada(n): return math.sqrt(n)


# 🔑 Verificación de contraseña
if contra1 == contra:
    while opcion != 14:
        # Menú principal
        print("\n" * 2)
        print("╔═════════════════════════════════╗")
        print("🧮      CALCULADORA CIENTÍFICA      🧮")
        print("╚═════════════════════════════════╝\n")

        print("──────────── OPCIONES ────────────")
        print("1️⃣  Suma ➕")
        print("2️⃣  Resta ➖")
        print("3️⃣  Multiplicación ✖️")
        print("4️⃣  División ➗")
        print("5️⃣  Valor Absoluto |x|")
        print("6️⃣  Seno sin(x) 📐")
        print("7️⃣  Coseno cos(x) 📐")
        print("8️⃣  Tangente tan(x) 📐")
        print("9️⃣  Logaritmo base 10 🔢")
        print("1️⃣ 0️⃣  Logaritmo Neperiano ln(x) 🔢")
        print("1️⃣ 1️⃣  e elevada a x e^x 🔥")
        print("1️⃣ 2️⃣  Raíz Cuadrada √x 🌟")
        print("1️⃣ 3️⃣  Cambiar Contraseña 🔒")
        print("1️⃣ 4️⃣  Salir 🚪")
        print("────────────────────────────\n")

        opcion = int(input("Elige una opción: "))

        if opcion == 1:
            n1 = int(input("Ingresa el primer número: "))
            n2 = int(input("Ingresa el segundo número: "))
            print(f"\n{GREEN}Resultado: {suma(n1,n2)} ➕{RESET}\n")

        elif opcion == 2:
            n1 = int(input("Ingresa el primer número: "))
            n2 = int(input("Ingresa el segundo número: "))
            print(f"\n{GREEN}Resultado: {resta(n1,n2)} ➖{RESET}\n")

        elif opcion == 3:
            n1 = int(input("Ingresa el primer número: "))
            n2 = int(input("Ingresa el segundo número: "))
            print(f"\n{GREEN}Resultado: {multiplicacion(n1,n2)} ✖️{RESET}\n")

        elif opcion == 4:
            n1 = int(input("Ingresa el primer número: "))
            n2 = int(input("Ingresa el segundo número: "))
            print(f"\n{GREEN}Resultado: {division(n1,n2)} ➗{RESET}\n")

        elif opcion == 5:
            n = int(input("Ingresa el número: "))
            print(f"\n{GREEN}Valor absoluto: {valorAbsoluto(n)} |x|{RESET}\n")

        elif opcion == 6:
            g = int(input("Ingresa los grados: "))
            print(f"\n{GREEN}Seno({g}°) = {seno(g)} 📐{RESET}\n")

        elif opcion == 7:
            g = int(input("Ingresa los grados: "))
            print(f"\n{GREEN}Coseno({g}°) = {coseno(g)} 📐{RESET}\n")

        elif opcion == 8:
            g = int(input("Ingresa los grados: "))
            print(f"\n{GREEN}Tangente({g}°) = {tangente(g)} 📐{RESET}\n")

        elif opcion == 9:
            n = int(input("Ingresa el número: "))
            print(f"\n{GREEN}log10({n}) = {logaritmo10(n)} 🔢{RESET}\n")

        elif opcion == 10:
            n = int(input("Ingresa el número: "))
            print(f"\n{GREEN}ln({n}) = {logaritmoN(n)} 🔢{RESET}\n")

        elif opcion == 11:
            n = int(input("Ingresa el número: "))
            print(f"\n{GREEN}e^{n} = {eElevadoX(n)} 🔥{RESET}\n")

        elif opcion == 12:
            n = int(input("Ingresa el número: "))
            print(f"\n{GREEN}√{n} = {raizCuadrada(n)} 🌟{RESET}\n")

        elif opcion == 13:
            contra2 = int(input("Ingresa la contraseña antigua"))
            if contra2 == contra:
                print("Contraseña correcta")
                contra3 = int(input("Ingresa la contraseña nueva"))
                contra = contra3
                print("Contraseña Cambiada\n")
            else:
                print(f"\n{RED}🔒 Contraseña incorrecta{RESET}\n")

        elif opcion == 14:
            print(f"\n{YELLOW}Saliendo de la Calculadora... 🚪{RESET}\n")

        else:
            print(f"\n{RED}❌ Opción no válida{RESET}\n")

else:
    print(f"\n{RED}🔒 Contraseña incorrecta{RESET}\n")
