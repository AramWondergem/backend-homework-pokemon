package PokemonBuildingblocks;

public abstract class WaterPokemon extends Pokemon{
    public WaterPokemon(String name, int hp, String food, String sound) {
        super(name, hp, food, sound);
    }

        public void surf(Pokemon enemy) {
            attack(enemy,30,"surf");
        }

        public void rainDance(Pokemon enemy) {
            attack(enemy,40,"Raindance" );
        }

        public void hydroPump(Pokemon enemy) {
            attack(enemy,50, "Hydropump");
        }

        public void hydroCanon(Pokemon enemy) {
            attack(enemy,60,"Hydrocanon" );
        }
    }
