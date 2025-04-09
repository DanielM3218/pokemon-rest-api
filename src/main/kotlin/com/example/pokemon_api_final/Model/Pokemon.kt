package com.example.pokemon_api_final.Model

import com.example.pokemon_api_final.Enums.PokemonType
import java.net.URL

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<PokemonType>,
    val pokedexNumber: Int,
    val imageUrl: URL
)