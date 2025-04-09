package com.example.pokemon_api_final.service

import com.example.pokemon_api_final.Enums.PokemonType
import com.example.pokemon_api_final.Model.Pokemon
import org.springframework.stereotype.Service
import java.net.URL

@Service
class PokemonService {
    private val pokemonList = listOf(
        Pokemon(
            1,
            "Bulbasaur",
            listOf(PokemonType.GRASS, PokemonType.POISON), // Use the PokemonType enum
            1,
            URL("https://img.pokemondb.net/artwork/large/bulbasaur.jpg")
        ),
        Pokemon(
            2,
            "Ivysaur",
            listOf(PokemonType.GRASS, PokemonType.POISON), // Use the PokemonType enum
            2,
            URL("https://img.pokemondb.net/artwork/large/ivysaur.jpg")
        )
    )

    fun getAllPokemons(): List<Pokemon> = pokemonList
    fun getPokemonById(id: Int): Pokemon? = pokemonList.find { it.id == id }
}