package com.example.pokemon_api_final.enums

enum class AllPokemons(
    val number: Int, // Pokedex Number
    val pokemonName: String, // Name of the Pokemon
    val types: List<PokemonType>,
    val imageUrl: String
) {
    BULBASAUR(
        1,
        "Bulbasaur",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/bulbasaur.jpg"
    ),
    IVYSAUR(
        2,
        "Ivysaur",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/ivysaur.jpg"
    ),
    VENUSAUR(
        3,
        "Venusaur",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/venusaur.jpg"
    ),
    CHARMANDER(4, "Charmander", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/charmander.jpg"),
    CHARMELEON(5, "Charmeleon", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/charmeleon.jpg"),
    CHARIZARD(
        6,
        "Charizard",
        listOf(PokemonType.FIRE, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/charizard.jpg"
    ),
    SQUIRTLE(7, "Squirtle", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/squirtle.jpg"),
    WARTORTLE(8, "Wartortle", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/wartortle.jpg"),
    BLASTOISE(9, "Blastoise", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/blastoise.jpg"),
    CATERPIE(10, "Caterpie", listOf(PokemonType.BUG), "https://img.pokemondb.net/artwork/large/caterpie.jpg"),
    METAPOD(11, "Metapod", listOf(PokemonType.BUG), "https://img.pokemondb.net/artwork/large/metapod.jpg"),
    BUTTERFREE(
        12,
        "Butterfree",
        listOf(PokemonType.BUG, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/butterfree.jpg"
    ),
    WEEDLE(
        13,
        "Weedle",
        listOf(PokemonType.BUG, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/weedle.jpg"
    ),
    KAKUNA(
        14,
        "Kakuna",
        listOf(PokemonType.BUG, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/kakuna.jpg"
    ),
    BEEDRILL(
        15,
        "Beedrill",
        listOf(PokemonType.BUG, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/beedrill.jpg"
    ),
    PIDGEY(
        16,
        "Pidgey",
        listOf(PokemonType.NORMAL, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/pidgey.jpg"
    ),
    PIDGEOTTO(
        17,
        "Pidgeotto",
        listOf(PokemonType.NORMAL, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/pidgeotto.jpg"
    ),
    PIDGEOT(
        18,
        "Pidgeot",
        listOf(PokemonType.NORMAL, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/pidgeot.jpg"
    ),
    RATTATA(19, "Rattata", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/rattata.jpg"),
    RATICATE(20, "Raticate", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/raticate.jpg"),
    SPEAROW(
        21,
        "Spearow",
        listOf(PokemonType.NORMAL, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/spearow.jpg"
    ),
    FEAROW(
        22,
        "Fearow",
        listOf(PokemonType.NORMAL, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/fearow.jpg"
    ),
    EKANS(23, "Ekans", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/ekans.jpg"),
    ARBOK(24, "Arbok", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/arbok.jpg"),
    PIKACHU(25, "Pikachu", listOf(PokemonType.ELECTRIC), "https://img.pokemondb.net/artwork/large/pikachu.jpg"),
    RAICHU(26, "Raichu", listOf(PokemonType.ELECTRIC), "https://img.pokemondb.net/artwork/large/raichu.jpg"),
    SANDSHREW(27, "Sandshrew", listOf(PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/sandshrew.jpg"),
    SANDSLASH(28, "Sandslash", listOf(PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/sandslash.jpg"),
    NIDORAN_F(29, "Nidoran♀", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/nidoran-f.jpg"),
    NIDORINA(30, "Nidorina", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/nidorina.jpg"),
    NIDOQUEEN(
        31,
        "Nidoqueen",
        listOf(PokemonType.POISON, PokemonType.GROUND),
        "https://img.pokemondb.net/artwork/large/nidoqueen.jpg"
    ),
    NIDORAN_M(32, "Nidoran♂", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/nidoran-m.jpg"),
    NIDORINO(33, "Nidorino", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/nidorino.jpg"),
    NIDOKING(
        34,
        "Nidoking",
        listOf(PokemonType.POISON, PokemonType.GROUND),
        "https://img.pokemondb.net/artwork/large/nidoking.jpg"
    ),
    CLEFAIRY(35, "Clefairy", listOf(PokemonType.FAIRY), "https://img.pokemondb.net/artwork/large/clefairy.jpg"),
    CLEFABLE(36, "Clefable", listOf(PokemonType.FAIRY), "https://img.pokemondb.net/artwork/large/clefable.jpg"),
    VULPIX(37, "Vulpix", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/vulpix.jpg"),
    NINETALES(38, "Ninetales", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/ninetales.jpg"),
    MACHOP(39, "Machop", listOf(PokemonType.FIGHTING), "https://img.pokemondb.net/artwork/large/machop.jpg"),
    MACHOKE(40, "Machoke", listOf(PokemonType.FIGHTING), "https://img.pokemondb.net/artwork/large/machoke.jpg"),
    MACHAMP(41, "Machamp", listOf(PokemonType.FIGHTING), "https://img.pokemondb.net/artwork/large/machamp.jpg"),
    BELLSPROUT(
        42,
        "Bellsprout",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/bellsprout.jpg"
    ),
    WEEPINBELL(
        43,
        "Weepinbell",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/weepinbell.jpg"
    ),
    VICTREEBEL(
        44,
        "Victreebel",
        listOf(PokemonType.GRASS, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/victreebel.jpg"
    ),
    VENOMOTH(
        45,
        "Venomoth",
        listOf(PokemonType.BUG, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/venomoth.jpg"
    ),
    DIGLETT(46, "Diglett", listOf(PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/diglett.jpg"),
    DUGTRIO(47, "Dugtrio", listOf(PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/dugtrio.jpg"),
    MEOWTH(48, "Meowth", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/meowth.jpg"),
    PERSIAN(49, "Persian", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/persian.jpg"),
    PSYDUCK(50, "Psyduck", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/psyduck.jpg"),
    GOLDUCK(51, "Golduck", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/golduck.jpg"),
    MANKEY(52, "Mankey", listOf(PokemonType.FIGHTING), "https://img.pokemondb.net/artwork/large/mankey.jpg"),
    PRIMEAPE(53, "Primeape", listOf(PokemonType.FIGHTING), "https://img.pokemondb.net/artwork/large/primeape.jpg"),
    GROWLITHE(54, "Growlithe", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/growlithe.jpg"),
    ARCANINE(55, "Arcanine", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/arcanine.jpg"),
    POLIWAG(56, "Poliwag", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/poliwag.jpg"),
    POLIWHIRL(57, "Poliwhirl", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/poliwhirl.jpg"),
    POLITOED(58, "Politoed", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/politoed.jpg"),
    ABRA(59, "Abra", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/abra.jpg"),
    KADABRA(60, "Kadabra", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/kadabra.jpg"),
    ALAKAZAM(61, "Alakazam", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/alakazam.jpg"),
    TANGELA(62, "Tangela", listOf(PokemonType.GRASS), "https://img.pokemondb.net/artwork/large/tangela.jpg"),
    KANGASKHAN(63, "Kangaskhan", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/kangaskhan.jpg"),
    HORSEA(64, "Horsea", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/horsea.jpg"),
    SEADRA(65, "Seadra", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/seadra.jpg"),
    GOLDEEN(66, "Goldeen", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/goldeen.jpg"),
    SEAKING(67, "Seaking", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/seaking.jpg"),
    STARYU(68, "Staryu", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/staryu.jpg"),
    STARMIE(
        69,
        "Starmie",
        listOf(PokemonType.WATER, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/starmie.jpg"
    ),
    MR_MIME(
        70,
        "Mr. Mime",
        listOf(PokemonType.PSYCHIC, PokemonType.FAIRY),
        "https://img.pokemondb.net/artwork/large/mr-mime.jpg"
    ),
    SCYTHER(
        71,
        "Scyther",
        listOf(PokemonType.BUG, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/scyther.jpg"
    ),
    JYNX(72, "Jynx", listOf(PokemonType.ICE, PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/jynx.jpg"),
    ELECTABUZZ(
        73,
        "Electabuzz",
        listOf(PokemonType.ELECTRIC),
        "https://img.pokemondb.net/artwork/large/electabuzz.jpg"
    ),
    MAGMAR(74, "Magmar", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/magmar.jpg"),
    PINSIR(75, "Pinsir", listOf(PokemonType.BUG), "https://img.pokemondb.net/artwork/large/pinsir.jpg"),
    TAUROS(76, "Tauros", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/tauros.jpg"),
    MAGIKARP(77, "Magikarp", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/magikarp.jpg"),
    GYARADOS(
        78,
        "Gyarados",
        listOf(PokemonType.WATER, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/gyarados.jpg"
    ),
    LAPRAS(
        79,
        "Lapras",
        listOf(PokemonType.WATER, PokemonType.ICE),
        "https://img.pokemondb.net/artwork/large/lapras.jpg"
    ),
    DITTO(80, "Ditto", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/ditto.jpg"),
    EEVE(81, "Eevee", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/eevee.jpg"),
    VAPOREON(82, "Vaporeon", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/vaporeon.jpg"),
    JOLTEON(83, "Jolteon", listOf(PokemonType.ELECTRIC), "https://img.pokemondb.net/artwork/large/jolteon.jpg"),
    FLAREON(84, "Flareon", listOf(PokemonType.FIRE), "https://img.pokemondb.net/artwork/large/flareon.jpg"),
    PORYGON(85, "Porygon", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/porygon.jpg"),
    OMANYTE(
        86,
        "Omanyte",
        listOf(PokemonType.ROCK, PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/omanyte.jpg"
    ),


    KABUTO(
        87,
        "Kabuto",
        listOf(PokemonType.ROCK, PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/kabuto.jpg"
    ),
    KABUTOPS(
        88,
        "Kabutops",
        listOf(PokemonType.ROCK, PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/kabutops.jpg"
    ),
    AERODACTYL(
        89,
        "Aerodactyl",
        listOf(PokemonType.ROCK, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/aerodactyl.jpg"
    ),
    SNORLAX(90, "Snorlax", listOf(PokemonType.NORMAL), "https://img.pokemondb.net/artwork/large/snorlax.jpg"),
    ARTICUNO(
        91,
        "Articuno",
        listOf(PokemonType.ICE, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/articuno.jpg"
    ),
    ZAPDOS(
        92,
        "Zapdos",
        listOf(PokemonType.ELECTRIC, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/zapdos.jpg"
    ),
    MOLTRES(
        93,
        "Moltres",
        listOf(PokemonType.FIRE, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/moltres.jpg"
    ),
    DRATINI(94, "Dratini", listOf(PokemonType.DRAGON), "https://img.pokemondb.net/artwork/large/dratini.jpg"),
    DRAGONAIR(95, "Dragonair", listOf(PokemonType.DRAGON), "https://img.pokemondb.net/artwork/large/dragonair.jpg"),
    DRAGONITE(
        96,
        "Dragonite",
        listOf(PokemonType.DRAGON, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/dragonite.jpg"
    ),
    MEWTWO(97, "Mewtwo", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/mewtwo.jpg"),
    MEW(98, "Mew", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/mew.jpg"),


    GRIMER(99, "Grimer", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/grimer.jpg"),
    MUK(100, "Muk", listOf(PokemonType.POISON), "https://img.pokemondb.net/artwork/large/muk.jpg"),
    SHELLDER(101, "Shellder", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/shellder.jpg"),
    CLOYSTER(
        102,
        "Cloyster",
        listOf(PokemonType.WATER, PokemonType.ICE),
        "https://img.pokemondb.net/artwork/large/cloyster.jpg"
    ),
    GASTLY(
        103,
        "Gastly",
        listOf(PokemonType.GHOST, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/gastly.jpg"
    ),
    HAUNTER(
        104,
        "Haunter",
        listOf(PokemonType.GHOST, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/haunter.jpg"
    ),
    GENGAR(
        105,
        "Gengar",
        listOf(PokemonType.GHOST, PokemonType.POISON),
        "https://img.pokemondb.net/artwork/large/gengar.jpg"
    ),
    ONIX(106, "Onix", listOf(PokemonType.ROCK, PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/onix.jpg"),
    DROWZEE(107, "Drowzee", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/drowzee.jpg"),
    HYPNO(108, "Hypno", listOf(PokemonType.PSYCHIC), "https://img.pokemondb.net/artwork/large/hypno.jpg"),
    KRABBY(109, "Krabby", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/krabby.jpg"),
    KINGLER(110, "Kingler", listOf(PokemonType.WATER), "https://img.pokemondb.net/artwork/large/kingler.jpg"),
    VOLTORB(111, "Voltorb", listOf(PokemonType.ELECTRIC), "https://img.pokemondb.net/artwork/large/voltorb.jpg"),
    ELECTRODE(112, "Electrode", listOf(PokemonType.ELECTRIC), "https://img.pokemondb.net/artwork/large/electrode.jpg"),
    EXEGGCUTE(
        113,
        "Exeggcute",
        listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/exeggcute.jpg"
    ),
    EXEGGUTOR(
        114,
        "Exeggutor",
        listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/exeggutor.jpg"
    ),
    CUBONE(115, "Cubone", listOf(PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/cubone.jpg"),
    MAROWAK(116, "Marowak", listOf(PokemonType.GROUND), "https://img.pokemondb.net/artwork/large/marowak.jpg"),
    HITMONLEE(117, "Hitmonlee", listOf(PokemonType.FIGHTING), "https://img.pokemondb.net/artwork/large/hitmonlee.jpg"),
    HITMONCHAN(
        118,
        "Hitmonchan",
        listOf(PokemonType.FIGHTING),
        "https://img.pokemondb.net/artwork/large/hitmonchan.jpg"
    ),
    Onix(
        119,
        "Onix",
        listOf(PokemonType.ROCK, PokemonType.GROUND),
        "https://img.pokemondb.net/artwork/large/onix.jpg"
    ),
    Drowzee(
        120,
        "Drowzee",
        listOf(PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/drowzee.jpg"
    ),
    Hypno(
        121,
        "Hypno",
        listOf(PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/hypno.jpg"
    ),
    Krabby(
        122,
        "Krabby",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/krabby.jpg"
    ),
    Kingler(
        123,
        "Kingler",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/kingler.jpg"
    ),
    Voltorb(
        124,
        "Voltorb",
        listOf(PokemonType.ELECTRIC),
        "https://img.pokemondb.net/artwork/large/voltorb.jpg"
    ),
    Electrode(
        125,
        "Electrode",
        listOf(PokemonType.ELECTRIC),
        "https://img.pokemondb.net/artwork/large/electrode.jpg"
    ),
    Exeggcute(
        126,
        "Exeggcute",
        listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/exeggcute.jpg"
    ),
    Exeggutor(
        127,
        "Exeggutor",
        listOf(PokemonType.GRASS, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/exeggutor.jpg"
    ),
    Cubone(
        128,
        "Cubone",
        listOf(PokemonType.GROUND),
        "https://img.pokemondb.net/artwork/large/cubone.jpg"
    ),
    Marowak(
        129,
        "Marowak",
        listOf(PokemonType.GROUND),
        "https://img.pokemondb.net/artwork/large/marowak.jpg"
    ),
    Hitmonlee(
        130,
        "Hitmonlee",
        listOf(PokemonType.FIGHTING),
        "https://img.pokemondb.net/artwork/large/hitmonlee.jpg"
    ),
    Tangela(
        131,
        "Tangela",
        listOf(PokemonType.GRASS),
        "https://img.pokemondb.net/artwork/large/tangela.jpg"
    ),
    Kangaskhan(
        132,
        "Kangaskhan",
        listOf(PokemonType.NORMAL),
        "https://img.pokemondb.net/artwork/large/kangaskhan.jpg"
    ),
    Horsea(
        133,
        "Horsea",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/horsea.jpg"
    ),
    Seadra(
        134,
        "Seadra",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/seadra.jpg"
    ),
    Goldeen(
        135,
        "Goldeen",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/goldeen.jpg"
    ),
    Seaking(
        136,
        "Seaking",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/seaking.jpg"
    ),
    Staryu(
        137,
        "Staryu",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/staryu.jpg"
    ),
    Starmie(
        138,
        "Starmie",
        listOf(PokemonType.WATER, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/starmie.jpg"
    ),
    Mime(
        139,
        "Mr. Mime",
        listOf(PokemonType.PSYCHIC, PokemonType.FAIRY),
        "https://img.pokemondb.net/artwork/large/mr-mime.jpg"
    ),
    Scyther(
        140,
        "Scyther",
        listOf(PokemonType.BUG, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/scyther.jpg"
    ),
    Jynx(
        141,
        "Jynx",
        listOf(PokemonType.ICE, PokemonType.PSYCHIC),
        "https://img.pokemondb.net/artwork/large/jynx.jpg"
    ),
    Electabuzz(
        142,
        "Electabuzz",
        listOf(PokemonType.ELECTRIC),
        "https://img.pokemondb.net/artwork/large/electabuzz.jpg"
    ),
    Magmar(
        143,
        "Magmar",
        listOf(PokemonType.FIRE),
        "https://img.pokemondb.net/artwork/large/magmar.jpg"
    ),
    Pinsir(
        144,
        "Pinsir",
        listOf(PokemonType.BUG),
        "https://img.pokemondb.net/artwork/large/pinsir.jpg"
    ),
    Tauros(
        145,
        "Tauros",
        listOf(PokemonType.NORMAL),
        "https://img.pokemondb.net/artwork/large/tauros.jpg"
    ),
    Magikarp(
        146,
        "Magikarp",
        listOf(PokemonType.WATER),
        "https://img.pokemondb.net/artwork/large/magikarp.jpg"
    ),
    Gyarados(
        147,
        "Gyarados",
        listOf(PokemonType.WATER, PokemonType.FLYING),
        "https://img.pokemondb.net/artwork/large/gyarados.jpg"
    ),
    Lapras(
        148,
        "Lapras",
        listOf(PokemonType.WATER, PokemonType.ICE),
        "https://img.pokemondb.net/artwork/large/lapras.jpg"
    ),
    Ditto(
        149,
        "Ditto",
        listOf(PokemonType.NORMAL),
        "https://img.pokemondb.net/artwork/large/ditto.jpg"
    ),
    Eevee(
        150,
        "Eevee",
        listOf(PokemonType.NORMAL),
        "https://img.pokemondb.net/artwork/large/eevee.jpg"
    ),
    Porygon(
        151,
        "Porygon",
        listOf(PokemonType.NORMAL),
        "https://img.pokemondb.net/artwork/large/porygon.jpg"
    )

}
