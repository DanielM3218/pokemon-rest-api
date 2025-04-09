package com.example.pokemon_api_final.service

import com.example.pokemon_api_final.Enums.PokemonType
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import java.net.URL

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
        assertThat(result[0].id).isEqualTo(1)
        assertThat(result[0].types).containsExactly(PokemonType.GRASS, PokemonType.POISON)
        assertThat(result[0].pokedexNumber).isEqualTo(1)
        assertThat(result[0].imageUrl).isEqualTo(URL("https://img.pokemondb.net/artwork/large/bulbasaur.jpg"))

        assertThat(result[1].id).isEqualTo(2)
        assertThat(result[1].name).isEqualTo("Ivysaur")
        assertThat(result[1].types).containsExactly(PokemonType.GRASS, PokemonType.POISON)
        assertThat(result[1].pokedexNumber).isEqualTo(2)
        assertThat(result[1].imageUrl).isEqualTo(URL("https://img.pokemondb.net/artwork/large/ivysaur.jpg"))
    }

    @Test
    fun `should return pokemon by id`() {
        // Call the getPokemonById function with id 1
        val result = pokemonService.getPokemonById(1)

        // Ensure the returned pokemon is Bulbasaur
        assertThat(result?.name).isEqualTo("Bulbasaur")
        assertThat(result?.types).containsExactly(PokemonType.GRASS, PokemonType.POISON)
        assertThat(result?.pokedexNumber).isEqualTo(1)
        assertThat(result?.imageUrl).isEqualTo(URL("https://img.pokemondb.net/artwork/large/bulbasaur.jpg"))
    }


    @Test
    fun `getPokemonById should return null or error for non-existent Pokémon`() {
        val result = pokemonService.getPokemonById(999)

        assertThat(result).isNull()
    }

}
