import datetime

# -------------------
# Colores ANSI para consola
# -------------------
RESET = "\033[0m"
ROJO = "\033[91m"
VERDE = "\033[92m"
AMARILLO = "\033[93m"
AZUL = "\033[94m"
MAGENTA = "\033[95m"
CYAN = "\033[96m"

# -------------------
# Datos iniciales
# -------------------

almacen_central = [
    {"id": 1, "nombre": "Balón de baloncesto", "marca": "Spalding", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 2, "nombre": "Raqueta de tenis", "marca": "Wilson", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 3, "nombre": "Colchoneta", "marca": "Decathlon", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 4, "nombre": "Balón de fútbol", "marca": "Adidas", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 5, "nombre": "Pesa", "marca": "Domyos", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 6, "nombre": "Cuerda de saltar", "marca": "Reebok", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 7, "nombre": "Palo de hockey", "marca": "Grays", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 8, "nombre": "Guantes de boxeo", "marca": "Everlast", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 9, "nombre": "Red de voleibol", "marca": "Mikasa", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 10, "nombre": "Conos de entrenamiento", "marca": "Decathlon", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 11, "nombre": "Pelota de yoga", "marca": "Reebok", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 12, "nombre": "Raqueta de pádel", "marca": "Head", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 13, "nombre": "Barras de dominadas", "marca": "Domyos", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 14, "nombre": "Balón medicinal", "marca": "Adidas", "fecha_alta": "2025-10-24", "estado": "disponible"},
    {"id": 15, "nombre": "Bandas elásticas", "marca": "Reebok", "fecha_alta": "2025-10-24", "estado": "disponible"}
]

distritos = {
    "Norte": {
        "actividades": {"natacion": [], "tenis": [], "fitness": [], "baloncesto": [], "pádel": []},
        "materiales": [almacen_central[0], almacen_central[1], almacen_central[2], almacen_central[3], almacen_central[4]]
    },
    "Sur": {
        "actividades": {"natacion": [], "tenis": [], "fitness": [], "fútbol": [], "pádel": []},
        "materiales": [almacen_central[5], almacen_central[6], almacen_central[7], almacen_central[8], almacen_central[9]]
    },
    "Este": {
        "actividades": {"natacion": [], "tenis": [], "fitness": [], "voleibol": [], "pádel": []},
        "materiales": [almacen_central[10], almacen_central[11], almacen_central[12], almacen_central[0], almacen_central[1]]
    },
    "Oeste": {
        "actividades": {"natacion": [], "tenis": [], "fitness": [], "boxeo": [], "pádel": []},
        "materiales": [almacen_central[2], almacen_central[3], almacen_central[4], almacen_central[5], almacen_central[6]]
    }
}

usuarios = {}

# -------------------
# Funciones auxiliares
# -------------------

def listar_materiales(materiales):
    for mat in materiales:
        color = VERDE if mat["estado"]=="disponible" else ROJO
        print(f"{color}ID: {mat['id']} | {mat['nombre']} - {mat['marca']} - {mat['estado']} - {mat['fecha_alta']}{RESET}")

def buscar_material_por_id(materiales, id_buscar):
    for mat in materiales:
        if mat["id"] == id_buscar:
            return mat
    return None

def buscar_material_general(id_mat):
    for mat in almacen_central:
        if mat["id"] == id_mat:
            return mat, "Almacén central", None
    for distrito, datos in distritos.items():
        for mat in datos["materiales"]:
            if mat["id"] == id_mat:
                return mat, distrito, None
    return None, None, None

def autenticar_usuario():
    nombre = input("👤 Nombre de usuario: ").strip()
    contrasena = input("🔑 Contraseña: ").strip()
    for uid, data in usuarios.items():
        if data["nombre"] == nombre and data["contrasena"] == contrasena:
            print(f"{VERDE}✔ Autenticación correcta{RESET}")
            return uid
    print(f"{ROJO}❌ Usuario o contraseña incorrectos{RESET}")
    return None

# -------------------
# Funciones del menú
# -------------------

def alta_usuarios():
    nombre = input("👤 Nombre: ").strip()
    distrito = input("🏙 Distrito (Norte/Sur/Este/Oeste): ").strip()
    actividad = input(f"🎯 Actividad (elige según {distrito}): ").strip()
    contra = input("🔑 Contraseña: ").strip()

    if not nombre or distrito not in distritos or actividad not in distritos[distrito]["actividades"]:
        print(f"{ROJO}❌ Datos incorrectos{RESET}")
        return

    if len(distritos[distrito]["actividades"][actividad]) >= 5:
        print(f"{AMARILLO}⚠ Cupo lleno en esa actividad{RESET}")
        return

    usuario_id = f"{nombre}_{len(usuarios)+1}"
    usuarios[usuario_id] = {
        "nombre": nombre,
        "distrito": distrito,
        "actividad": actividad,
        "contrasena": contra,
        "reservas": []
    }
    distritos[distrito]["actividades"][actividad].append(usuario_id)
    print(f"{VERDE}✔ Usuario {nombre} dado de alta con ID: {usuario_id}{RESET}")

def baja_usuario():
    uid = autenticar_usuario()
    if uid:
        data = usuarios[uid]
        distritos[data["distrito"]]["actividades"][data["actividad"]].remove(uid)
        del usuarios[uid]
        print(f"{VERDE}✔ Usuario dado de baja{RESET}")

def listar_almacen():
    print(f"\n{CYAN}--- Almacén central ---{RESET}")
    listar_materiales(almacen_central)

def acceder_centro():
    distrito = input("🏙 Distrito (Norte/Sur/Este/Oeste): ").strip()
    if distrito not in distritos:
        print(f"{ROJO}❌ Distrito no válido{RESET}")
        return
    print(f"\n{CYAN}--- Centro {distrito} ---{RESET}")
    listar_materiales(distritos[distrito]["materiales"])
    ver_otros = input("¿Desea ver materiales de otros distritos? (s/n): ").strip().lower()
    if ver_otros == "s":
        for d, data in distritos.items():
            if d != distrito:
                print(f"\n{CYAN}--- Centro {d} ---{RESET}")
                listar_materiales(data["materiales"])

def acceder_actividad():
    uid = autenticar_usuario()
    if not uid:
        return
    data = usuarios[uid]
    print(f"{VERDE}✔ Bienvenido a la actividad {data['actividad']} del distrito {data['distrito']}{RESET}")

def listar_materiales_ubicacion():
    uid = autenticar_usuario()
    if not uid:
        return
    data = usuarios[uid]
    opcion = input("Ver materiales de (1) toda la ubicación o (2) solo mi actividad? (1/2): ").strip()
    materiales = distritos[data["distrito"]]["materiales"]
    if opcion == "2":
        print(f"{CYAN}Mostrando materiales relacionados con {data['actividad']}:{RESET}")
        listar_materiales(materiales[:5])
    else:
        print(f"{CYAN}Mostrando todos los materiales del centro:{RESET}")
        listar_materiales(materiales)

def buscar_material():
    criterio = input("Buscar por (nombre/marca/fecha/estado): ").strip().lower()
    valor = input("Valor a buscar: ").strip().lower()
    encontrados = []
    for mat in almacen_central:
        if valor in str(mat[criterio]).lower():
            encontrados.append(mat)
    for d, data in distritos.items():
        for mat in data["materiales"]:
            if valor in str(mat[criterio]).lower() and mat not in encontrados:
                encontrados.append(mat)
    if encontrados:
        print(f"{VERDE}✔ Materiales encontrados ({len(encontrados)}):{RESET}")
        listar_materiales(encontrados)
    else:
        print(f"{ROJO}❌ No se encontraron materiales{RESET}")

def reservar_material():
    uid = autenticar_usuario()
    if not uid:
        return
    data = usuarios[uid]
    if len(data["reservas"]) >= 3:
        print(f"{AMARILLO}⚠ Has alcanzado el máximo de reservas (3){RESET}")
        return
    try:
        id_mat = int(input("ID del material a reservar: "))
    except ValueError:
        print(f"{ROJO}❌ Debes introducir un número{RESET}")
        return
    mat, distrito, _ = buscar_material_general(id_mat)
    if not mat:
        print(f"{ROJO}❌ Material no encontrado{RESET}")
        return
    if mat["estado"] != "disponible":
        print(f"{AMARILLO}⚠ Material no disponible{RESET}")
        return
    mat["estado"] = "reservado"
    data["reservas"].append({"id": id_mat, "fecha_reserva": datetime.date.today()})
    print(f"{VERDE}✔ Material {mat['nombre']} reservado{RESET}")

def ver_mis_reservas():
    uid = autenticar_usuario()
    if not uid:
        return
    data = usuarios[uid]
    if not data["reservas"]:
        print(f"{AMARILLO}⚠ No tienes reservas{RESET}")
        return
    print(f"{CYAN}Tus reservas:{RESET}")
    for r in data["reservas"]:
        mat, distrito, _ = buscar_material_general(r["id"])
        print(f"ID {mat['id']} - {mat['nombre']} - Distrito: {distrito} - Actividad: {data['actividad']} - Fecha reserva: {r['fecha_reserva']}")

def devolver_material():
    uid = autenticar_usuario()
    if not uid:
        return
    data = usuarios[uid]
    if not data["reservas"]:
        print(f"{AMARILLO}⚠ No tienes reservas{RESET}")
        return
    try:
        id_mat = int(input("ID del material a devolver: "))
    except ValueError:
        print(f"{ROJO}❌ Debes introducir un número{RESET}")
        return
    for r in data["reservas"]:
        if r["id"] == id_mat:
            mat, distrito, _ = buscar_material_general(id_mat)
            mat["estado"] = "disponible"
            data["reservas"].remove(r)
            print(f"{VERDE}✔ Material {mat['nombre']} devuelto{RESET}")
            return
    print(f"{ROJO}❌ No tienes reservado ese material{RESET}")

# -------------------
# Menú principal
# -------------------

def menu():
    while True:
        print(f"\n{CYAN}🏟️ --- Menú CDM Alcorcón --- 🏟️{RESET}")
        print(f"{AMARILLO}1️⃣  Alta de usuario")
        print(f"2️⃣  Baja de usuario")
        print(f"3️⃣  Acceder al almacén central")
        print(f"4️⃣  Acceder a un distrito y su centro general")
        print(f"5️⃣  Acceder a una actividad específica")
        print(f"6️⃣  Listar materiales de la ubicación actual")
        print(f"7️⃣  Buscar material por nombre/marca/fecha/estado")
        print(f"8️⃣  Reservar material")
        print(f"9️⃣  Ver mis reservas")
        print(f"🔟  Devolver material")
        print(f"1️⃣ 1️⃣  Salir{RESET}")

        opcion = input("➡️ Elige una opción: ").strip()

        if opcion == "1":
            alta_usuarios()
        elif opcion == "2":
            baja_usuario()
        elif opcion == "3":
            listar_almacen()
        elif opcion == "4":
            acceder_centro()
        elif opcion == "5":
            acceder_actividad()
        elif opcion == "6":
            listar_materiales_ubicacion()
        elif opcion == "7":
            buscar_material()
        elif opcion == "8":
            reservar_material()
        elif opcion == "9":
            ver_mis_reservas()
        elif opcion == "10":
            devolver_material()
        elif opcion == "11":
            print(f"{MAGENTA}👋 Saliendo... ¡Hasta luego!{RESET}")
            break
        else:
            print(f"{ROJO}❌ Opción no válida{RESET}")

# -------------------
# Iniciar aplicación
# -------------------

menu()
