import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String picture;
    private Trainer trainer;

    private static Map<String, Map<String, String>> generalAttacks = new HashMap<>();
    private static Map<String, Integer> atacksElectric = new HashMap<>();
    private static Map<String, Integer> atacksGrass = new HashMap<>();
    private static Map<String, Integer> atacksFire = new HashMap<>();
    private static Map<String, Integer> atacksWater = new HashMap<>();

    static {
        try {
            File scoreFile = new File("assets/attacksElectric.txt");
            Scanner fileScanner = new Scanner(scoreFile);
            while (fileScanner.hasNext()) {

                atacksElectric.put(fileScanner.nextLine(), Integer.valueOf(fileScanner.nextLine()));

            }

        } catch (FileNotFoundException e) {
            System.out.println("Het document bestaat niet");
        }
        Iterator<Map.Entry<String, Integer>> iterator = atacksElectric.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> result = (Map.Entry<String, Integer>) iterator.next();
            System.out.println(result.getKey() + " " + result.getValue());

        }
    }


    public Pokemon() {
        pokemonBirth();
    }

    public void eats() {
        System.out.println("\n" + name + " is eating: " + food);
    }

    public void speaks() {
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print(sound);
        }
    }

//    public abstract void specialMove(Pokemon enemy);

    public void attack(Pokemon enemy, int damage, String nameAttack) {
        speaks();
        Main.waitingMain(1000);
        System.out.println("\n\n\n" + name + " does the attack on " + enemy.getName() + ": " + nameAttack);
        Main.waitingMain(1000);
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
        Main.waitingMain(1000);
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
        if (level < 3) {
            this.level++;
        } else {
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

    public void printPokemon() {
        System.out.println(picture);
    }


    public Trainer getTrainer() {
        return trainer;
    }

    public void addTrainer(Trainer trainer) {
        if (this.trainer != trainer && this.trainer != null) {
            this.trainer.removePokemon(this);
        }
        if (!trainer.checkPokemon(this)) {
            trainer.addPokemon(this);
        }
        this.trainer = trainer;

    }

    public void removeTrainer(Trainer trainer) {
        if (trainer.checkPokemon(this)) {
            trainer.removePokemon(this);
        }
        this.trainer = null;
    }

    public void printTrainer() {
        if (this.trainer != null) {
            System.out.println("The trainer of " + name + " is " + this.trainer.getName());
        } else {
            System.out.println(name + " has no trainer.");
        }
    }

    public void pokemonBirth(String name, int hp, String food, String sound, String picture) {
        this.name = name;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.picture = picture;
        Main.waitingMain(1000);
        System.out.println("New " + getName() + " is build");
        Main.waitingMain(1000);
        printPokemon();
    }
}
