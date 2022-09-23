package PokemonBuildingblocks;

public abstract class WaterPokemon extends Pokemon{

    private boolean canFloat;
    private boolean saltWaterResitant;

    public WaterPokemon(String name, int hp, String food, String sound, String picture,boolean canFloat, boolean saltWaterResitant) {
        super(name, hp, food, sound,picture);
        this.canFloat=canFloat;
        this.saltWaterResitant=saltWaterResitant;
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
