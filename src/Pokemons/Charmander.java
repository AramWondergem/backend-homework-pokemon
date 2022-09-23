package Pokemons;

import PokemonBuildingblocks.FirePokemon;
import PokemonBuildingblocks.Pokemon;

public class Charmander extends FirePokemon {

    public Charmander() {
        super("Charmander", 60, "Chicken", "Chaaaarmander");
    }

    @Override
    public void specialMove(Pokemon enemy) {
        attack(enemy,30,"fire tail whipe");
    }
}
