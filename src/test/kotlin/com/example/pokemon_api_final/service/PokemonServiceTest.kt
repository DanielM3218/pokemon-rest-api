package com.example.pokemon_api_final.service

import com.example.pokemon_api_final.enums.PokemonType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.net.URL

class PokemonServiceTest {

    private val pokemonService = PokemonService()

    @Test
    fun `should return all pokemons`() {
        val result = pokemonService.getAllPokemons()


        assertThat(result).isNotEmpty
        assertThat(result).hasSize(2)

        assertThat(result[0].name).isEqualTo("Bulbasaur")
        assertThat(result[0].pokedexNumber).isEqualTo(1)
        assertThat(result[0].types).containsExactly(PokemonType.GRASS, PokemonType.POISON)
        assertThat(result[0].imageUrl).isEqualTo(URL("https://img.pokemondb.net/artwork/large/bulbasaur.jpg"))

        assertThat(result[1].pokedexNumber).isEqualTo(2)
        assertThat(result[1].name).isEqualTo("Ivysaur")
        assertThat(result[1].types).containsExactly(PokemonType.GRASS, PokemonType.POISON)
        assertThat(result[1].imageUrl).isEqualTo(URL("https://img.pokemondb.net/artwork/large/ivysaur.jpg"))
    }

    @Test
    fun `should return pokemon by pokedexNumber`() {
        val result = pokemonService.getPokemonById(1)

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
