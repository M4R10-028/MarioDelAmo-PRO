const url = localStorage.getItem("valor");

fetch(url)
  .then((res) => res.json())
  .then((data) => {
    const detailDiv = document.getElementById("pokemonDetail");

    // Extraer datos útiles
    const nombre = data.name.toUpperCase();
    const imagen = data.sprites.front_default;
    const altura = data.height / 10; // metros
    const peso = data.weight / 10; // kg
    const tipos = data.types.map((t) => t.type.name).join(", ");
    const habilidades = data.abilities.map((a) => a.ability.name).join(", ");
    const ataques = data.moves.slice(0, 4).map((m) => m.move.name);

    detailDiv.innerHTML = `
      <div class="col-md-6">
        <div class="card">
          <img src="${imagen}" class="card-img-top" alt="${nombre}" />
          <div class="card-body">
            <h3 class="card-title">${nombre}</h3>
            <p><strong>Altura:</strong> ${altura} m</p>
            <p><strong>Peso:</strong> ${peso} kg</p>
            <p><strong>Tipo(s):</strong> ${tipos}</p>
            <p><strong>Habilidades:</strong> ${habilidades}</p>
            <p><strong>Ataques:</strong></p>
            <ul>
              ${ataques.map((ataque) => `<li>${ataque}</li>`).join("")}
            </ul>
            <a href="index.html" class="btn btn-secondary mt-3">← Volver</a>
          </div>
        </div>
      </div>
    `;
  })
  .catch((error) => {
    console.error("Error al obtener detalles:", error);
    document.getElementById("pokemonDetail").innerHTML = `
      <div class="alert alert-danger" role="alert">
        No se pudo cargar la información del Pokémon.
      </div>
    `;
  });
