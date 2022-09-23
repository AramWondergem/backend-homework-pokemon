package PokemonBuildingblocks;




public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    String picture;

    public Pokemon(String name, int hp, String food, String sound,String picture) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.picture=picture;
        pokemonBirth();

    }

    public void eats(){
        System.out.println("\n" + name + " is eating: " + food);
    }

    public void speaks(){
        System.out.println("");
        for (int i=0;i<3;i++) {
            System.out.print(sound);
        }
    }

    public abstract void specialMove(Pokemon enemy);

    public void attack(Pokemon enemy, int damage, String nameAttack){
        speaks();
        waiting(1000);
        System.out.println("\n\n\n"+ name + " does the attack on " + enemy.getName()+ ": " + nameAttack);
        waiting(1000);
        System.out.println("\n" +
                "\n" +
                "\n" +
                "  /$$$$$$  /$$$$$$$           /$$$$$ /$$$$$$$$       /$$      /$$ /$$   /$$ /$$$$$$ /$$      \n" +
                " /$$__  $$| $$__  $$         |__  $$| $$_____/      | $$$    /$$$| $$  | $$|_  $$_/| $$      \n" +
                "| $$  \\ $$| $$  \\ $$            | $$| $$            | $$$$  /$$$$| $$  | $$  | $$  | $$      \n" +
                "| $$  | $$| $$$$$$$/            | $$| $$$$$         | $$ $$/$$ $$| $$  | $$  | $$  | $$      \n" +
                "| $$  | $$| $$____/        /$$  | $$| $$__/         | $$  $$$| $$| $$  | $$  | $$  | $$      \n" +
                "| $$  | $$| $$            | $$  | $$| $$            | $$\\  $ | $$| $$  | $$  | $$  | $$      \n" +
                "|  $$$$$$/| $$            |  $$$$$$/| $$$$$$$$      | $$ \\/  | $$|  $$$$$$/ /$$$$$$| $$$$$$$$\n" +
                " \\______/ |__/             \\______/ |________/      |__/     |__/ \\______/ |______/|________/\n" +
                "                                                                                             \n" +
                "                                                                                             \n" +
                "                                                                                             ");
        enemy.setHp(enemy.getHp() - damage);
        waiting(1000);
        System.out.println("The level of " + enemy.getName() + " is now: " + enemy.getHp());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp(int level) {
        if (level<3){
        this.level++;}
        else {
            System.out.println("Your pokemon is already level 3");
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void printPokemon (){
        System.out.println(picture);
    }

    public void pokemonBirth () {
        waiting(1000);
        System.out.println("New " + getName() + " is build");
        waiting(1000);
        printPokemon();
    }

    private void waiting(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
