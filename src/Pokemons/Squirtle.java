package Pokemons;

import PokemonBuildingblocks.Pokemon;
import PokemonBuildingblocks.WaterPokemon;

public class Squirtle extends WaterPokemon {

    public Squirtle() {
        super("Squirtle", 60, "seaweed", "Hibriaaaaa");
    }

    @Override
    public void specialMove(Pokemon enemy) {
        attack(enemy,30,"WaterSplash");
    }
}
