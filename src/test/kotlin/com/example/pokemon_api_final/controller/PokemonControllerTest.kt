package com.example.pokemon_api_final.controller

import com.example.pokemon_api_final.enums.PokemonType
import com.example.pokemon_api_final.model.Pokemon
import com.example.pokemon_api_final.service.PokemonService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.http.HttpStatus
import java.net.URL

@ExtendWith(MockitoExtension::class)
class PokemonControllerTest {

    @Mock
    private lateinit var pokemonService: PokemonService

    private lateinit var pokemonController: PokemonController

    private val bulbasaur = Pokemon(
        1,
        "Bulbasaur",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        URL("https://img.pokemondb.net/artwork/large/bulbasaur.jpg")
    )

    private val ivysaur = Pokemon(
        2,
        "Ivysaur",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        URL("https://img.pokemondb.net/artwork/large/ivysaur.jpg")
    )

    @BeforeEach
    fun setUp() {
        pokemonController = PokemonController(pokemonService)
    }

    @Test
    fun `should return a list of pokemons on successful request`() {

        val expectedPokemons = listOf(bulbasaur, ivysaur)
        `when`(pokemonService.getAllPokemons()).thenReturn(expectedPokemons)


        val result = pokemonController.listAllPokemons()


        assertThat(result).isNotNull
        assertThat(result).hasSize(2)
        assertThat(result).isEqualTo(expectedPokemons)
    }

    @Test
    fun `getPokemonById should return pokemon when it exists`() {

        val pokemonPokedexNumber = 1
        `when`(pokemonService.getPokemonById(pokemonPokedexNumber)).thenReturn(bulbasaur)


        val response = pokemonController.getPokemonById(pokemonPokedexNumber)


        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(response.body).isNotNull
        assertThat(response.body).isEqualTo(bulbasaur)
    }

    @Test
    fun `getPokemonById should return not found when pokemon does not exist`() {

        val nonExistentPokedexNumber = 999
        `when`(pokemonService.getPokemonById(nonExistentPokedexNumber)).thenReturn(null)


        val response = pokemonController.getPokemonById(nonExistentPokedexNumber)


        assertThat(response.statusCode).isEqualTo(HttpStatus.NOT_FOUND)
        assertThat(response.body).isNull()
    }
}
