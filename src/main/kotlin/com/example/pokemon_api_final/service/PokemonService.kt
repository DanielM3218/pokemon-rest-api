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
        ),
        Pokemon(
            3,
            "Venusaur",
            listOf(PokemonType.GRASS, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/venusaur.jpg")
        ),
        Pokemon(
            4,
            "Charmander",
            listOf(PokemonType.FIRE),
            URL("https://img.pokemondb.net/artwork/large/charmander.jpg")
        ),
        Pokemon(
            5,
            "Charmeleon",
            listOf(PokemonType.FIRE),
            URL("https://img.pokemondb.net/artwork/large/charmeleon.jpg")
        ),
        Pokemon(
            6,
            "Charizard",
            listOf(PokemonType.FIRE, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/charizard.jpg")
        ),
        Pokemon(7, "Squirtle", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/squirtle.jpg")),
        Pokemon(
            8,
            "Wartortle",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/wartortle.jpg")
        ),
        Pokemon(
            9,
            "Blastoise",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/blastoise.jpg")
        ),
        Pokemon(10, "Caterpie", listOf(PokemonType.BUG), URL("https://img.pokemondb.net/artwork/large/caterpie.jpg")),
        Pokemon(11, "Metapod", listOf(PokemonType.BUG), URL("https://img.pokemondb.net/artwork/large/metapod.jpg")),
        Pokemon(
            12,
            "Butterfree",
            listOf(PokemonType.BUG, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/butterfree.jpg")
        ),
        Pokemon(
            13,
            "Weedle",
            listOf(PokemonType.BUG, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/weedle.jpg")
        ),
        Pokemon(
            14,
            "Kakuna",
            listOf(PokemonType.BUG, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/kakuna.jpg")
        ),
        Pokemon(
            15,
            "Beedrill",
            listOf(PokemonType.BUG, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/beedrill.jpg")
        ),
        Pokemon(
            16,
            "Pidgey",
            listOf(PokemonType.NORMAL, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/pidgey.jpg")
        ),
        Pokemon(
            17,
            "Pidgeotto",
            listOf(PokemonType.NORMAL, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/pidgeotto.jpg")
        ),
        Pokemon(
            18,
            "Pidgeot",
            listOf(PokemonType.NORMAL, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/pidgeot.jpg")
        ),
        Pokemon(19, "Rattata", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/rattata.jpg")),
        Pokemon(
            20,
            "Raticate",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/raticate.jpg")
        ),
        Pokemon(
            21,
            "Spearow",
            listOf(PokemonType.NORMAL, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/spearow.jpg")
        ),
        Pokemon(
            22,
            "Fearow",
            listOf(PokemonType.NORMAL, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/fearow.jpg")
        ),
        Pokemon(23, "Ekans", listOf(PokemonType.POISON), URL("https://img.pokemondb.net/artwork/large/ekans.jpg")),
        Pokemon(24, "Arbok", listOf(PokemonType.POISON), URL("https://img.pokemondb.net/artwork/large/arbok.jpg")),
        Pokemon(
            25,
            "Pikachu",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/pikachu.jpg")
        ),
        Pokemon(26, "Raichu", listOf(PokemonType.ELECTRIC), URL("https://img.pokemondb.net/artwork/large/raichu.jpg")),
        Pokemon(
            27,
            "Sandshrew",
            listOf(PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/sandshrew.jpg")
        ),
        Pokemon(
            28,
            "Sandslash",
            listOf(PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/sandslash.jpg")
        ),
        Pokemon(
            29,
            "Nidoran♀",
            listOf(PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/nidoran-f.jpg")
        ),
        Pokemon(
            30,
            "Nidorina",
            listOf(PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/nidorina.jpg")
        ),
        Pokemon(
            31,
            "Nidoqueen",
            listOf(PokemonType.POISON, PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/nidoqueen.jpg")
        ),
        Pokemon(
            32,
            "Nidoran♂",
            listOf(PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/nidoran-m.jpg")
        ),
        Pokemon(
            33,
            "Nidorino",
            listOf(PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/nidorino.jpg")
        ),
        Pokemon(
            34,
            "Nidoking",
            listOf(PokemonType.POISON, PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/nidoking.jpg")
        ),
        Pokemon(35, "Clefairy", listOf(PokemonType.FAIRY), URL("https://img.pokemondb.net/artwork/large/clefairy.jpg")),
        Pokemon(36, "Clefable", listOf(PokemonType.FAIRY), URL("https://img.pokemondb.net/artwork/large/clefable.jpg")),
        Pokemon(37, "Vulpix", listOf(PokemonType.FIRE), URL("https://img.pokemondb.net/artwork/large/vulpix.jpg")),
        Pokemon(
            38,
            "Ninetales",
            listOf(PokemonType.FIRE),
            URL("https://img.pokemondb.net/artwork/large/ninetales.jpg")
        ),
        Pokemon(39, "Machop", listOf(PokemonType.FIGHTING), URL("https://img.pokemondb.net/artwork/large/machop.jpg")),
        Pokemon(
            40,
            "Machoke",
            listOf(PokemonType.FIGHTING),
            URL("https://img.pokemondb.net/artwork/large/machoke.jpg")
        ),
        Pokemon(
            41,
            "Machamp",
            listOf(PokemonType.FIGHTING),
            URL("https://img.pokemondb.net/artwork/large/machamp.jpg")
        ),
        Pokemon(
            42,
            "Bellsprout",
            listOf(PokemonType.GRASS, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/bellsprout.jpg")
        ),
        Pokemon(
            43,
            "Weepinbell",
            listOf(PokemonType.GRASS, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/weepinbell.jpg")
        ),
        Pokemon(
            44,
            "Victreebel",
            listOf(PokemonType.GRASS, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/victreebel.jpg")
        ),
        Pokemon(
            45,
            "Venomoth",
            listOf(PokemonType.BUG, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/venomoth.jpg")
        ),
        Pokemon(46, "Diglett", listOf(PokemonType.GROUND), URL("https://img.pokemondb.net/artwork/large/diglett.jpg")),
        Pokemon(47, "Dugtrio", listOf(PokemonType.GROUND), URL("https://img.pokemondb.net/artwork/large/dugtrio.jpg")),
        Pokemon(48, "Meowth", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/meowth.jpg")),
        Pokemon(49, "Persian", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/persian.jpg")),
        Pokemon(50, "Psyduck", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/psyduck.jpg")),
        Pokemon(51, "Golduck", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/golduck.jpg")),
        Pokemon(52, "Mankey", listOf(PokemonType.FIGHTING), URL("https://img.pokemondb.net/artwork/large/mankey.jpg")),
        Pokemon(
            53,
            "Primeape",
            listOf(PokemonType.FIGHTING),
            URL("https://img.pokemondb.net/artwork/large/primeape.jpg")
        ),
        Pokemon(
            54,
            "Growlithe",
            listOf(PokemonType.FIRE),
            URL("https://img.pokemondb.net/artwork/large/growlithe.jpg")
        ),
        Pokemon(55, "Arcanine", listOf(PokemonType.FIRE), URL("https://img.pokemondb.net/artwork/large/arcanine.jpg")),
        Pokemon(56, "Poliwag", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/poliwag.jpg")),
        Pokemon(
            57,
            "Poliwhirl",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/poliwhirl.jpg")
        ),
        Pokemon(58, "Politoed", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/politoed.jpg")),
        Pokemon(59, "Abra", listOf(PokemonType.PSYCHIC), URL("https://img.pokemondb.net/artwork/large/abra.jpg")),
        Pokemon(60, "Kadabra", listOf(PokemonType.PSYCHIC), URL("https://img.pokemondb.net/artwork/large/kadabra.jpg")),
        Pokemon(
            61,
            "Alakazam",
            listOf(PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/alakazam.jpg")
        ),
        Pokemon(62, "Tangela", listOf(PokemonType.GRASS), URL("https://img.pokemondb.net/artwork/large/tangela.jpg")),
        Pokemon(
            63,
            "Kangaskhan",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/kangaskhan.jpg")
        ),
        Pokemon(64, "Horsea", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/horsea.jpg")),
        Pokemon(65, "Seadra", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/seadra.jpg")),
        Pokemon(66, "Goldeen", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/goldeen.jpg")),
        Pokemon(67, "Seaking", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/seaking.jpg")),
        Pokemon(68, "Staryu", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/staryu.jpg")),
        Pokemon(
            69,
            "Starmie",
            listOf(PokemonType.WATER, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/starmie.jpg")
        ),
        Pokemon(
            70,
            "Mr. Mime",
            listOf(PokemonType.PSYCHIC, PokemonType.FAIRY),
            URL("https://img.pokemondb.net/artwork/large/mr-mime.jpg")
        ),
        Pokemon(
            71,
            "Scyther",
            listOf(PokemonType.BUG, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/scyther.jpg")
        ),
        Pokemon(
            72,
            "Jynx",
            listOf(PokemonType.ICE, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/jynx.jpg")
        ),
        Pokemon(
            73,
            "Electabuzz",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/electabuzz.jpg")
        ),
        Pokemon(74, "Magmar", listOf(PokemonType.FIRE), URL("https://img.pokemondb.net/artwork/large/magmar.jpg")),
        Pokemon(75, "Pinsir", listOf(PokemonType.BUG), URL("https://img.pokemondb.net/artwork/large/pinsir.jpg")),
        Pokemon(76, "Tauros", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/tauros.jpg")),
        Pokemon(77, "Magikarp", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/magikarp.jpg")),
        Pokemon(
            78,
            "Gyarados",
            listOf(PokemonType.WATER, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/gyarados.jpg")
        ),
        Pokemon(
            79,
            "Lapras",
            listOf(PokemonType.WATER, PokemonType.ICE),
            URL("https://img.pokemondb.net/artwork/large/lapras.jpg")
        ),
        Pokemon(80, "Ditto", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/ditto.jpg")),
        Pokemon(81, "Eevee", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/eevee.jpg")),
        Pokemon(82, "Vaporeon", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/vaporeon.jpg")),
        Pokemon(
            83,
            "Jolteon",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/jolteon.jpg")
        ),
        Pokemon(84, "Flareon", listOf(PokemonType.FIRE), URL("https://img.pokemondb.net/artwork/large/flareon.jpg")),
        Pokemon(85, "Porygon", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/porygon.jpg")),
        Pokemon(
            86,
            "Omanyte",
            listOf(PokemonType.ROCK, PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/omanyte.jpg")
        ),


        Pokemon(
            87,
            "Kabuto",
            listOf(PokemonType.ROCK, PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/kabuto.jpg")
        ),
        Pokemon(
            88,
            "Kabutops",
            listOf(PokemonType.ROCK, PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/kabutops.jpg")
        ),
        Pokemon(
            89,
            "Aerodactyl",
            listOf(PokemonType.ROCK, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/aerodactyl.jpg")
        ),
        Pokemon(90, "Snorlax", listOf(PokemonType.NORMAL), URL("https://img.pokemondb.net/artwork/large/snorlax.jpg")),
        Pokemon(
            91,
            "Articuno",
            listOf(PokemonType.ICE, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/articuno.jpg")
        ),
        Pokemon(
            92,
            "Zapdos",
            listOf(PokemonType.ELECTRIC, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/zapdos.jpg")
        ),
        Pokemon(
            93,
            "Moltres",
            listOf(PokemonType.FIRE, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/moltres.jpg")
        ),
        Pokemon(94, "Dratini", listOf(PokemonType.DRAGON), URL("https://img.pokemondb.net/artwork/large/dratini.jpg")),
        Pokemon(
            95,
            "Dragonair",
            listOf(PokemonType.DRAGON),
            URL("https://img.pokemondb.net/artwork/large/dragonair.jpg")
        ),
        Pokemon(
            96,
            "Dragonite",
            listOf(PokemonType.DRAGON, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/dragonite.jpg")
        ),
        Pokemon(97, "Mewtwo", listOf(PokemonType.PSYCHIC), URL("https://img.pokemondb.net/artwork/large/mewtwo.jpg")),
        Pokemon(98, "Mew", listOf(PokemonType.PSYCHIC), URL("https://img.pokemondb.net/artwork/large/mew.jpg")),


        Pokemon(99, "Grimer", listOf(PokemonType.POISON), URL("https://img.pokemondb.net/artwork/large/grimer.jpg")),
        Pokemon(100, "Muk", listOf(PokemonType.POISON), URL("https://img.pokemondb.net/artwork/large/muk.jpg")),
        Pokemon(
            101,
            "Shellder",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/shellder.jpg")
        ),
        Pokemon(
            102,
            "Cloyster",
            listOf(PokemonType.WATER, PokemonType.ICE),
            URL("https://img.pokemondb.net/artwork/large/cloyster.jpg")
        ),
        Pokemon(
            103,
            "Gastly",
            listOf(PokemonType.GHOST, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/gastly.jpg")
        ),
        Pokemon(
            104,
            "Haunter",
            listOf(PokemonType.GHOST, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/haunter.jpg")
        ),
        Pokemon(
            105,
            "Gengar",
            listOf(PokemonType.GHOST, PokemonType.POISON),
            URL("https://img.pokemondb.net/artwork/large/gengar.jpg")
        ),
        Pokemon(
            106,
            "Onix",
            listOf(PokemonType.ROCK, PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/onix.jpg")
        ),
        Pokemon(
            107,
            "Drowzee",
            listOf(PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/drowzee.jpg")
        ),
        Pokemon(108, "Hypno", listOf(PokemonType.PSYCHIC), URL("https://img.pokemondb.net/artwork/large/hypno.jpg")),
        Pokemon(109, "Krabby", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/krabby.jpg")),
        Pokemon(110, "Kingler", listOf(PokemonType.WATER), URL("https://img.pokemondb.net/artwork/large/kingler.jpg")),
        Pokemon(
            111,
            "Voltorb",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/voltorb.jpg")
        ),
        Pokemon(
            112,
            "Electrode",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/electrode.jpg")
        ),
        Pokemon(
            113,
            "Exeggcute",
            listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/exeggcute.jpg")
        ),
        Pokemon(
            114,
            "Exeggutor",
            listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/exeggutor.jpg")
        ),
        Pokemon(115, "Cubone", listOf(PokemonType.GROUND), URL("https://img.pokemondb.net/artwork/large/cubone.jpg")),
        Pokemon(116, "Marowak", listOf(PokemonType.GROUND), URL("https://img.pokemondb.net/artwork/large/marowak.jpg")),
        Pokemon(
            117,
            "Hitmonlee",
            listOf(PokemonType.FIGHTING),
            URL("https://img.pokemondb.net/artwork/large/hitmonlee.jpg")
        ),
        Pokemon(
            118,
            "Hitmonchan",
            listOf(PokemonType.FIGHTING),
            URL("https://img.pokemondb.net/artwork/large/hitmonchan.jpg")
        ),
        Pokemon(
            119,
            "Onix",
            listOf(PokemonType.ROCK, PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/onix.jpg")
        ),
        Pokemon(
            120,
            "Drowzee",
            listOf(PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/drowzee.jpg")
        ),
        Pokemon(
            121,
            "Hypno",
            listOf(PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/hypno.jpg")
        ),
        Pokemon(
            122,
            "Krabby",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/krabby.jpg")
        ),
        Pokemon(
            123,
            "Kingler",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/kingler.jpg")
        ),
        Pokemon(
            124,
            "Voltorb",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/voltorb.jpg")
        ),
        Pokemon(
            125,
            "Electrode",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/electrode.jpg")
        ),
        Pokemon(
            126,
            "Exeggcute",
            listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/exeggcute.jpg")
        ),
        Pokemon(
            127,
            "Exeggutor",
            listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/exeggutor.jpg")
        ),
        Pokemon(
            128,
            "Cubone",
            listOf(PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/cubone.jpg")
        ),
        Pokemon(
            129,
            "Marowak",
            listOf(PokemonType.GROUND),
            URL("https://img.pokemondb.net/artwork/large/marowak.jpg")
        ),
        Pokemon(
            130,
            "Hitmonlee",
            listOf(PokemonType.FIGHTING),
            URL("https://img.pokemondb.net/artwork/large/hitmonlee.jpg")
        ),
        Pokemon(
            131,
            "Tangela",
            listOf(PokemonType.GRASS),
            URL("https://img.pokemondb.net/artwork/large/tangela.jpg")
        ),
        Pokemon(
            132,
            "Kangaskhan",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/kangaskhan.jpg")
        ),
        Pokemon(
            133,
            "Horsea",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/horsea.jpg")
        ),
        Pokemon(
            134,
            "Seadra",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/seadra.jpg")
        ),
        Pokemon(
            135,
            "Goldeen",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/goldeen.jpg")
        ),
        Pokemon(
            136,
            "Seaking",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/seaking.jpg")
        ),
        Pokemon(
            137,
            "Staryu",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/staryu.jpg")
        ),
        Pokemon(
            138,
            "Starmie",
            listOf(PokemonType.WATER, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/starmie.jpg")
        ),
        Pokemon(
            139,
            "Mr. Mime",
            listOf(PokemonType.PSYCHIC, PokemonType.FAIRY),
            URL("https://img.pokemondb.net/artwork/large/mr-mime.jpg")
        ),
        Pokemon(
            140,
            "Scyther",
            listOf(PokemonType.BUG, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/scyther.jpg")
        ),
        Pokemon(
            141,
            "Jynx",
            listOf(PokemonType.ICE, PokemonType.PSYCHIC),
            URL("https://img.pokemondb.net/artwork/large/jynx.jpg")
        ),
        Pokemon(
            142,
            "Electabuzz",
            listOf(PokemonType.ELECTRIC),
            URL("https://img.pokemondb.net/artwork/large/electabuzz.jpg")
        ),
        Pokemon(
            143,
            "Magmar",
            listOf(PokemonType.FIRE),
            URL("https://img.pokemondb.net/artwork/large/magmar.jpg")
        ),
        Pokemon(
            144,
            "Pinsir",
            listOf(PokemonType.BUG),
            URL("https://img.pokemondb.net/artwork/large/pinsir.jpg")
        ),
        Pokemon(
            145,
            "Tauros",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/tauros.jpg")
        ),
        Pokemon(
            146,
            "Magikarp",
            listOf(PokemonType.WATER),
            URL("https://img.pokemondb.net/artwork/large/magikarp.jpg")
        ),
        Pokemon(
            147,
            "Gyarados",
            listOf(PokemonType.WATER, PokemonType.FLYING),
            URL("https://img.pokemondb.net/artwork/large/gyarados.jpg")
        ),
        Pokemon(
            148,
            "Lapras",
            listOf(PokemonType.WATER, PokemonType.ICE),
            URL("https://img.pokemondb.net/artwork/large/lapras.jpg")
        ),
        Pokemon(
            149,
            "Ditto",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/ditto.jpg")
        ),
        Pokemon(
            150,
            "Eevee",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/eevee.jpg")
        ),
        Pokemon(
            151,
            "Porygon",
            listOf(PokemonType.NORMAL),
            URL("https://img.pokemondb.net/artwork/large/porygon.jpg")
        )

    )

    fun getAllPokemons(): List<Pokemon> = pokemonList
    fun getPokemonById(pokedexNumber: Int): Pokemon? = pokemonList.find { it.pokedexNumber == pokedexNumber }
}
