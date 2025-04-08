
package com.example.pokemonfinal.controller

import com.example.pokemonfinal.Model.Pokemon
import com.example.pokemonfinal.service.PokemonService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.http.HttpStatus

@ExtendWith(MockitoExtension::class)
class PokemonControllerTest {

    @Mock
    private lateinit var pokemonService: PokemonService

    private lateinit var pokemonController: PokemonController

    private val bulbasaur = Pokemon(
        1,
        "Bulbasaur",
        listOf("Grass", "Poison"),
        1,
        "https://img.pokemondb.net/artwork/large/bulbasaur.jpg"
    )

    private val ivysaur = Pokemon(
        2,
        "Ivysaur",
        listOf("Grass", "Poison"),
        2,
        "https://img.pokemondb.net/artwork/large/ivysaur.jpg"
    )

    @BeforeEach
    fun setUp() {
        pokemonController = PokemonController(pokemonService)
    }

    @Test
    fun `listAllPokemons should return all pokemons from service`() {
        // Given
        val expectedPokemons = listOf(bulbasaur, ivysaur)
        `when`(pokemonService.getAllPokemons()).thenReturn(expectedPokemons)

        // When
        val result = pokemonController.listAllPokemons()

        // Then
        assertThat(result).isNotNull
        assertThat(result).hasSize(2)
        assertThat(result).isEqualTo(expectedPokemons)
    }

    @Test
    fun `getPokemonById should return pokemon when it exists`() {
        // Given
        val pokemonId = 1
        `when`(pokemonService.getPokemonById(pokemonId)).thenReturn(bulbasaur)

        // When
        val response = pokemonController.getPokemonById(pokemonId)

        // Then
        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(response.body).isNotNull
        assertThat(response.body).isEqualTo(bulbasaur)
    }

    @Test
    fun `getPokemonById should return not found when pokemon does not exist`() {
        // Given
        val nonExistentId = 999
        `when`(pokemonService.getPokemonById(nonExistentId)).thenReturn(null)

        // When
        val response = pokemonController.getPokemonById(nonExistentId)

        // Then
        assertThat(response.statusCode).isEqualTo(HttpStatus.NOT_FOUND)
        assertThat(response.body).isNull()
    }
}