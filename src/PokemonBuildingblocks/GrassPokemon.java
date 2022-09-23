package PokemonBuildingblocks;

public abstract class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int hp, String food, String sound) {
        super(name, hp, food, sound);
    }

        public void leaveBlade(Pokemon enemy) {
            attack(enemy,30, "LeaveBlade");
        }

        public void leechSeed(Pokemon enemy) {
            attack(enemy,40, "Leechseed");
        }

        public void leafStorm(Pokemon enemy) {
            attack(enemy,50, "Leafstorm");
        }

        public void treeCanon(Pokemon enemy) {
            attack(enemy,60,"Treecanon");
        }
    }
