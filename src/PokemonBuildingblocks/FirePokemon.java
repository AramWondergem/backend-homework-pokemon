package PokemonBuildingblocks;

public abstract class FirePokemon extends Pokemon {

    private boolean rainProtected;
    private boolean doesSmokeSmell;
    public FirePokemon(String name, int hp, String food, String sound, String picture, Boolean rainProtected, Boolean doesSmokeSmell) {
        super(name, hp, food, sound,picture);
        this.rainProtected=rainProtected;
        this.doesSmokeSmell=doesSmokeSmell;
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

