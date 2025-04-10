package com.example.pokemon_api_final.service

import com.example.pokemon_api_final.enums.PokemonType
import com.example.pokemon_api_final.model.Pokemon
import org.springframework.stereotype.Service
import java.net.URL

@Service
class PokemonService {
    private val pokemonList = listOf(
        Pokemon(
            1,
            "Bulbasaur",
            listOf(PokemonType.GRASS, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/bulbasaur.jpg")
        ),
        Pokemon(
            2,
            "Ivysaur",
            listOf(PokemonType.GRASS, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/ivysaur.jpg")
        )
    )

    fun getAllPokemons(): List<Pokemon> = pokemonList
    fun getPokemonById(pokedexNumber: Int): Pokemon? = pokemonList.find { it.pokedexNumber == pokedexNumber }
}
