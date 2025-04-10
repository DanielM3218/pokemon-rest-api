package com.example.pokemon_api_final.model

import com.example.pokemon_api_final.enums.PokemonType
import java.net.URL

data class Pokemon(
    val pokedexNumber: Int,
    val name: String,
    val types: List<PokemonType>,
    val imageUrl: URL
)
