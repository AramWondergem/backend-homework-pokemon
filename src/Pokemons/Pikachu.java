package Pokemons;

import PokemonBuildingblocks.ElectricPokemon;
import PokemonBuildingblocks.Pokemon;

public class Pikachu extends ElectricPokemon {

    public Pikachu() {
        super("Pikachu", 60, "Hamster dryfood", "Pikachuuuuuuuuuuuuuuu");
    }

    @Override
    public void specialMove(Pokemon enemy) {
        attack(enemy,30,"Quick Attack");
    }
}