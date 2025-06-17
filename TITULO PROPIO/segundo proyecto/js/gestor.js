/* Crear un programa que permita;
- Crear 3 equipos, los cuales tienen un nombre, un presupuesto y una lista de jugadores
- Crear una lista de 10 jugadores, cada jugador tiene nombre valor posicion
- Ficha 5 jugadores por cada equipo (si el equipo no tiene suficiente presupuesto, no podra)
- Mostrar todos los jugadores de cada equipo
- Mostrar todos los jugadores iniciales aquellos que tengan un valor superior a 100000

Clases:
- Jugador
- Equipo
- GestorLiga
*/

const jugadores = [
  {
    nombre: "Lionel Messi",
    valor: 50000000,
    posicion: "Delantero",
    nacionalidad: "Argentina",
  },
  {
    nombre: "Cristiano Ronaldo",
    valor: 40000000,
    posicion: "Delantero",
    nacionalidad: "Portugal",
  },
  {
    nombre: "Kylian Mbappé",
    valor: 180000000,
    posicion: "Delantero",
    nacionalidad: "Francia",
  },
  {
    nombre: "Erling Haaland",
    valor: 170000000,
    posicion: "Delantero",
    nacionalidad: "Noruega",
  },
  {
    nombre: "Kevin De Bruyne",
    valor: 85000000,
    posicion: "Mediocampista",
    nacionalidad: "Bélgica",
  },
  {
    nombre: "Luka Modric",
    valor: 10000000,
    posicion: "Mediocampista",
    nacionalidad: "Croacia",
  },
  {
    nombre: "Pedri",
    valor: 100000000,
    posicion: "Mediocampista",
    nacionalidad: "España",
  },
  {
    nombre: "Jude Bellingham",
    valor: 120000000,
    posicion: "Mediocampista",
    nacionalidad: "Inglaterra",
  },
  {
    nombre: "Virgil van Dijk",
    valor: 70000000,
    posicion: "Defensor",
    nacionalidad: "Países Bajos",
  },
  {
    nombre: "Rúben Dias",
    valor: 80000000,
    posicion: "Defensor",
    nacionalidad: "Portugal",
  },
  {
    nombre: "João Cancelo",
    valor: 60000000,
    posicion: "Defensor",
    nacionalidad: "Portugal",
  },
  {
    nombre: "Achraf Hakimi",
    valor: 65000000,
    posicion: "Defensor",
    nacionalidad: "Marruecos",
  },
  {
    nombre: "Alphonso Davies",
    valor: 70000000,
    posicion: "Defensor",
    nacionalidad: "Canadá",
  },
  {
    nombre: "Marc-André ter Stegen",
    valor: 45000000,
    posicion: "Portero",
    nacionalidad: "Alemania",
  },
  {
    nombre: "Thibaut Courtois",
    valor: 50000000,
    posicion: "Portero",
    nacionalidad: "Bélgica",
  },
  {
    nombre: "Jan Oblak",
    valor: 35000000,
    posicion: "Portero",
    nacionalidad: "Eslovenia",
  },
  {
    nombre: "Vinícius Jr.",
    valor: 150000000,
    posicion: "Delantero",
    nacionalidad: "Brasil",
  },
  {
    nombre: "Rodri",
    valor: 90000000,
    posicion: "Mediocampista",
    nacionalidad: "España",
  },
  {
    nombre: "Declan Rice",
    valor: 95000000,
    posicion: "Mediocampista",
    nacionalidad: "Inglaterra",
  },
  {
    nombre: "Trent Alexander-Arnold",
    valor: 80000000,
    posicion: "Defensor",
    nacionalidad: "Inglaterra",
  },
  {
    nombre: "Antoine Griezmann",
    valor: 25000000,
    posicion: "Delantero",
    nacionalidad: "Francia",
  },
  {
    nombre: "Frenkie de Jong",
    valor: 75000000,
    posicion: "Mediocampista",
    nacionalidad: "Países Bajos",
  },
  {
    nombre: "Joshua Kimmich",
    valor: 85000000,
    posicion: "Mediocampista",
    nacionalidad: "Alemania",
  },
  {
    nombre: "Neymar Jr.",
    valor: 45000000,
    posicion: "Delantero",
    nacionalidad: "Brasil",
  },
  {
    nombre: "Raphaël Varane",
    valor: 30000000,
    posicion: "Defensor",
    nacionalidad: "Francia",
  },
  {
    nombre: "Édouard Mendy",
    valor: 25000000,
    posicion: "Portero",
    nacionalidad: "Senegal",
  },
  {
    nombre: "Manuel Neuer",
    valor: 15000000,
    posicion: "Portero",
    nacionalidad: "Alemania",
  },
  {
    nombre: "Bukayo Saka",
    valor: 110000000,
    posicion: "Delantero",
    nacionalidad: "Inglaterra",
  },
  {
    nombre: "Phil Foden",
    valor: 120000000,
    posicion: "Mediocampista",
    nacionalidad: "Inglaterra",
  },
  {
    nombre: "Marquinhos",
    valor: 65000000,
    posicion: "Defensor",
    nacionalidad: "Brasil",
  },
];

let equipo = new Equipo("Barcelona", 180000000);
equipo.ficharJugador(jugadores[0]);
equipo.ficharJugador(jugadores[3]);
equipo.mostrarJugadores();
