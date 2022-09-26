public abstract class ElectricPokemon extends Pokemon {

    private boolean chargeable;
    private boolean hasOutlet;
    public ElectricPokemon(String name, int hp, String food, String sound, String picture, boolean chargeable, boolean hasOutlet) {
        super(name, hp, food, sound,picture);
        this.chargeable = chargeable;
        this.hasOutlet = hasOutlet;
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
