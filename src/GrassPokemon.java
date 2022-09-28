public abstract class GrassPokemon extends Pokemon {

    private boolean allergicForFertilizer;
    private int numberOfWateringTimesWeek;
    public GrassPokemon(String name, int hp, String food, String sound,String picture,boolean allergicForFertilizer, int numberOfWateringTimesWeek) {
        super(name, hp, food, sound, picture);
        this.allergicForFertilizer=allergicForFertilizer;
        this.numberOfWateringTimesWeek=numberOfWateringTimesWeek;
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
