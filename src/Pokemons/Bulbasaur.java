package Pokemons;

import PokemonBuildingblocks.GrassPokemon;
import PokemonBuildingblocks.Pokemon;

public class Bulbasaur extends GrassPokemon {

    public Bulbasaur() {
        super("Bulbasaur", 60, "Onions", "BrrrrBrrrrBrrrr");
    }

    @Override
    public void specialMove(Pokemon enemy) {
        attack(enemy,30,"Vine Whip");
    }
}
