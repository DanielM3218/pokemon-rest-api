package com.example.pokemon_api_final.service

import com.example.pokemon_api_final.enums.AllPokemons
import com.example.pokemon_api_final.model.Pokemon
import org.springframework.stereotype.Service
import java.net.URL

@Service
class PokemonService {
    private val pokemonList = AllPokemons.entries.map {
        Pokemon(
            it.number,
            it.pokemonName,
            it.types,
            URL(it.imageUrl)
        )
    }

    fun getAllPokemons(): List<Pokemon> = pokemonList
    fun getPokemonById(pokedexNumber: Int): Pokemon? = pokemonList.find { it.pokedexNumber == pokedexNumber }
}
