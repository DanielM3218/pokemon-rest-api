package com.example.pokemon_api_final.controller

import com.example.pokemon_api_final.model.Pokemon
import com.example.pokemon_api_final.service.PokemonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/pokemon")
class PokemonController(private val service: PokemonService) {

    @GetMapping
    fun listAllPokemons(): List<Pokemon> = service.getAllPokemons()

    @GetMapping("/{pokedexNumber}")
    fun getPokemonById(@PathVariable pokedexNumber: Int): ResponseEntity<Pokemon> {
        val pokemon = service.getPokemonById(pokedexNumber)
        return if (pokemon != null) ResponseEntity.ok(pokemon)
        else ResponseEntity.notFound().build()
    }
}
