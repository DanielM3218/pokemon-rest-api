package com.example.pokemon_api_final.controller

import com.example.pokemon_api_final.enums.PokemonType
import com.example.pokemon_api_final.model.Pokemon
import com.example.pokemon_api_final.service.PokemonService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import com.example.pokemon_api_final.enums.AllPokemons
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

    @BeforeEach
    fun setUp() {
        pokemonController = PokemonController(pokemonService)
    }

    @Test
    fun `should return a list of pokemons on successful request`() {
        // Prepare the expected list of Pokemons using the AllPokemons enum
        val expectedPokemons = AllPokemons.entries.map { enumPokemon ->
            Pokemon(
                enumPokemon.number,
                enumPokemon.pokemonName,
                enumPokemon.types,
                URL(enumPokemon.imageUrl)
            )
        }

        // Mock the service response
        `when`(pokemonService.getAllPokemons()).thenReturn(expectedPokemons)

        // Call the controller method
        val result = pokemonController.listAllPokemons()

        // Assertions
        assertThat(result).isNotNull
        assertThat(result).hasSize(expectedPokemons.size)
        assertThat(result).isEqualTo(expectedPokemons)
    }

    @Test
    fun `getPokemonById should return pokemon when it exists`() {
        // Get a valid pokemon from AllPokemons enum
        val validPokedexNumber = 1
        val pokemon = AllPokemons.entries.first { it.number == validPokedexNumber }
        val expectedPokemon = Pokemon(
            pokemon.number,
            pokemon.pokemonName,
            pokemon.types,
            URL(pokemon.imageUrl)
        )

        // Mock the service response
        `when`(pokemonService.getPokemonById(validPokedexNumber)).thenReturn(expectedPokemon)

        // Call the controller method
        val response = pokemonController.getPokemonById(validPokedexNumber)

        // Assertions
        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(response.body).isNotNull
        assertThat(response.body).isEqualTo(expectedPokemon)
    }

    @Test
    fun `getPokemonById should return not found when pokemon does not exist`() {
        val nonExistentPokedexNumber = 999

        // Mock the service response
        `when`(pokemonService.getPokemonById(nonExistentPokedexNumber)).thenReturn(null)

        // Call the controller method
        val response = pokemonController.getPokemonById(nonExistentPokedexNumber)

        // Assertions
        assertThat(response.statusCode).isEqualTo(HttpStatus.NOT_FOUND)
        assertThat(response.body).isNull()
    }
}
