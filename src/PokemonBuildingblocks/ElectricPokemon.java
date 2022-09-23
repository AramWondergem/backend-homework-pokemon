package PokemonBuildingblocks;

public abstract class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int hp, String food, String sound) {
        super(name, hp, food, sound);
    }

        public void thunderPunch(Pokemon enemy) {
            attack(enemy,30,"ThunderPunch" );
        }

        public void electroBall(Pokemon enemy) {
            attack(enemy,40, "electroball");
        }

        public void voltAttack(Pokemon enemy) {
            attack(enemy,50, "VoltAttack" );
        }

        public void thunder(Pokemon enemy) {
            attack(enemy,60, "thunder");
        }
    }
