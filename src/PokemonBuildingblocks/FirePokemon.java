package PokemonBuildingblocks;

public abstract class FirePokemon extends Pokemon {
    public FirePokemon(String name, int hp, String food, String sound) {
        super(name, hp, food, sound);
    }

        public void inferno(Pokemon enemy) {
            attack(enemy,30,"Inferno" );
        }

        public void pyroBall(Pokemon enemy) {
            attack(enemy,40, "Pyroball" );
        }

        public void fireLash(Pokemon enemy) {
            attack(enemy,50,"Firelash" );
        }

        public void flameThrower(Pokemon enemy) {
            attack(enemy,60,"Flamethrower" );
        }
    }
}
