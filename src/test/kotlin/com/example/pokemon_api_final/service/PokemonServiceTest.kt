package com.example.pokemon_api_final.service

import com.example.pokemon_api_final.enums.PokemonType
import com.example.pokemon_api_final.model.Pokemon
import org.assertj.core.api.Assertions.assertThat
import com.example.pokemon_api_final.enums.AllPokemons
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import java.net.URL

class PokemonServiceTest {

    private val pokemonService = PokemonService()

    @Test
    fun `should return all pokemons from enum`() {

        val result = pokemonService.getAllPokemons()

        // Ensure the list is not empty and has the same size as the enum
        assertThat(result).isNotEmpty
        assertThat(result).hasSize(AllPokemons.entries.size)

        // Iterate over AllPokemons enum and validate each one
        AllPokemons.entries.forEachIndexed { index, enumPokemon ->
            val pokemon = result[index]

            assertThat(pokemon.pokedexNumber).isEqualTo(enumPokemon.number)
            assertThat(pokemon.name).isEqualTo(enumPokemon.pokemonName)
            assertThat(pokemon.types).containsExactlyElementsOf(enumPokemon.types)
            assertThat(pokemon.imageUrl).isEqualTo(URL(enumPokemon.imageUrl))
        }
    }

    @Test
    fun `should return pokemon by pokedexNumber from enum`() {
        AllPokemons.entries.forEach { enumPokemon ->
            val result = pokemonService.getPokemonById(enumPokemon.number)

            assertThat(result?.name).isEqualTo(enumPokemon.pokemonName)
            assertThat(result?.types).containsExactlyElementsOf(enumPokemon.types)
            assertThat(result?.pokedexNumber).isEqualTo(enumPokemon.number)
            assertThat(result?.imageUrl).isEqualTo(URL(enumPokemon.imageUrl))
        }
    }

    @Test
    fun `getPokemonById should return null for non-existent Pokemon`() {
        val result = pokemonService.getPokemonById(999)

        // Check that the result is null for a Pokémon that doesn't exist
        assertThat(result).isNull()
    }
}
