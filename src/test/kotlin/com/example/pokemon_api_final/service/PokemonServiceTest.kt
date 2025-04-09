package com.example.pokemon_api_final.service

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class PokemonServiceTest {

    // Create an object of PokemonService
    private val pokemonService = PokemonService()

    @Test
    fun `should return all pokemons`() {
        // Call the getAllPokemons function
        val result = pokemonService.getAllPokemons()

        // Ensure the list is not empty and contains the expected pokemons
        assertThat(result).isNotEmpty
        assertThat(result).hasSize(2)  // Since we have exactly two pokemons in the list

        // Ensure the details of the pokemons are correct
        assertThat(result[0].name).isEqualTo("Bulbasaur")
        assertThat(result[1].name).isEqualTo("Ivysaur")
    }

    @Test
    fun `should return pokemon by id`() {
        // Call the getPokemonById function with id 1
        val result = pokemonService.getPokemonById(1)

        // Ensure the returned pokemon is Bulbasaur
        assertThat(result).isNotNull
        assertThat(result?.name).isEqualTo("Bulbasaur")

        // Call the getPokemonById function with a non-existent id
        val nonExistentPokemon = pokemonService.getPokemonById(999)

        // Ensure the pokemon was not found and is null
        assertThat(nonExistentPokemon).isNull()
    }
}
