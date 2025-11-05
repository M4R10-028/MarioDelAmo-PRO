#!/usr/bin/env python
# -*- coding: utf-8 -*-
import os

# Carpeta y archivo de ejemplo
CARPETA = "Ficheros"
ARCHIVO = os.path.join(CARPETA, "fichero1.txt")

# Crear la carpeta si no existe
os.makedirs(CARPETA, exist_ok=True)

# Contenido inicial del archivo de ejemplo
if not os.path.exists(ARCHIVO):
    with open(ARCHIVO, "w") as f:
        f.write("Primera línea\nSegunda línea\nTercera línea\nCuarta línea\n")

def mostrar_menu():
    print("\n--- TUTORIAL DE FICHEROS EN PYTHON ---")
    print("1. Leer todo el archivo (read)")
    print("2. Leer archivo línea por línea (readlines)")
    print("3. Leer líneas específicas")
    print("4. Escribir al final del archivo (write/a)")
    print("5. Escribir al principio del archivo (write/r+ con seek)")
    print("6. Escribir lista de líneas (writelines)")
    print("7. Manejo de errores al abrir archivo")
    print("8. Salir")

def leer_todo():
    with open(ARCHIVO, "r") as f:
        contenido = f.read()
        print("\nContenido del archivo:\n", contenido)

def leer_lineas():
    with open(ARCHIVO, "r") as f:
        lineas = f.readlines()
        print("\nContenido línea por línea:\n", lineas)

def leer_lineas_especificas():
    inicio = int(input("Desde la línea: "))
    fin = int(input("Hasta la línea: "))
    with open(ARCHIVO, "r") as f:
        texto = (linea for i, linea in enumerate(f) if inicio <= i+1 <= fin)
        print("\nLíneas seleccionadas:")
        for linea in texto:
            print(linea, end="")

def escribir_final():
    texto = input("Texto a añadir al final: ")
    with open(ARCHIVO, "a") as f:
        f.write("\n" + texto)
    print("Texto añadido al final.")

def escribir_principio():
    texto = input("Texto a añadir al principio: ")
    with open(ARCHIVO, "r+") as f:
        contenido = f.read()
        f.seek(0, 0)
        f.write(texto + "\n" + contenido)
    print("Texto añadido al principio.")

def escribir_lista():
    lista = input("Introduce varias líneas separadas por coma: ").split(",")
    with open(ARCHIVO, "r+") as f:
        f.seek(0, 2)  # ir al final
        f.writelines([linea.strip() + "\n" for linea in lista])
    print("Lista escrita en el archivo.")

def manejo_errores():
    nombre = input("Nombre del archivo a abrir: ")
    try:
        with open(nombre, "r") as f:
            print(f.read())
    except FileNotFoundError:
        print("¡Error! El archivo no existe.")

# Bucle principal
while True:
    mostrar_menu()
    opcion = input("Elige una opción: ")
    
    if opcion == "1":
        leer_todo()
    elif opcion == "2":
        leer_lineas()
    elif opcion == "3":
        leer_lineas_especificas()
    elif opcion == "4":
        escribir_final()
    elif opcion == "5":
        escribir_principio()
    elif opcion == "6":
        escribir_lista()
    elif opcion == "7":
        manejo_errores()
    elif opcion == "8":
        print("Saliendo del tutorial...")
        break
    else:
        print("Opción no válida.")
