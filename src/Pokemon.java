import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String picture;
    private Trainer trainer;


    // Hashmaps from assets files with attacks
    private static Map<String, Map<String, Integer>> generalAttacks = new HashMap<>();
    private static Map<String, Integer> atacksElectric = new HashMap<>();
    private static Map<String, Integer> atacksGrass = new HashMap<>();
    private static Map<String, Integer> atacksFire = new HashMap<>();
    private static Map<String, Integer> atacksWater = new HashMap<>();
    //Hashmap with all pokemons which can be created
    protected static Map<String, Map<Integer, String>> collectionsOfPokemons = new HashMap<>();
    //List with created pokemons
    protected static List<Pokemon> createdPokemons = new ArrayList<>();

    //Filling the above hashmaps
    static {
        loadAttacks("assets/attacksElectric.txt", atacksElectric);
        loadAttacks("assets/attacksWater.txt", atacksWater);
        loadAttacks("assets/attacksGrass.txt", atacksGrass);
        loadAttacks("assets/attacksFire.txt", atacksFire);

        generalAttacks.put("Electric", atacksElectric);
        generalAttacks.put("Fire", atacksFire);
        generalAttacks.put("Water", atacksWater);
        generalAttacks.put("Grass", atacksGrass);


        collectionsOfPokemons.put("1. Fire Pokemons", FirePokemon.firePokemon);
        collectionsOfPokemons.put("2. Electric Pokemons", ElectricPokemon.electricPokemon);
        collectionsOfPokemons.put("3. Grass Pokemons", GrassPokemon.grassPokemon);
        collectionsOfPokemons.put("4. Water Pokemons", WaterPokemon.waterPokemon);
    }

    //Constructors
    public Pokemon(String type) {
        pokemonBirth(type);
        createdPokemons.add(this);

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
    } // should be adapted to work with the hashmap and the printAttacks method

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

    // Between class pokemon and class trainer there is a bi-directional relationship
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

    public void pokemonBirth(String type) {
        try {
            File pokemonsFile = new File("assets/pokemonsWithPicture.txt");
            Scanner fileScanner = new Scanner(pokemonsFile);
            fileScanner.useDelimiter(";");
            while (fileScanner.hasNext()) {

                String placeholderOutputFilescanner = fileScanner.next();

                if (placeholderOutputFilescanner.equals(type)) {
                    this.name = placeholderOutputFilescanner;
                    this.hp = Integer.parseInt(fileScanner.next());
                    this.food = fileScanner.next();
                    this.sound = fileScanner.next();
                    this.picture = fileScanner.next();
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Het document bestaat niet");
        }
        Main.waitingMain(1000);
        System.out.println("New " + getName() + " is build");
        Main.waitingMain(1000);
        printPokemon();

    }

    private static void loadAttacks(String pathname, Map attacksmap) {
        try {
            File attacksFile = new File(pathname);
            Scanner fileScanner = new Scanner(attacksFile);
            while (fileScanner.hasNext()) {

                attacksmap.put(fileScanner.nextLine(), Integer.valueOf(fileScanner.nextLine()));

            }

        } catch (FileNotFoundException e) {
            System.out.println("Het document bestaat niet");
        }

    }

    public static void printListOfPokemons() {

        TreeMap<String, Map<Integer, String>> treeMap = new TreeMap<>(collectionsOfPokemons);
        Iterator iterator = treeMap.keySet().iterator();


        while (iterator.hasNext()) {
            String keys = (String) iterator.next();
            System.out.println(keys);

            Map<Integer, String> placeholderHashmap = collectionsOfPokemons.get(keys);

            placeholderHashmap.forEach((key, value) -> System.out.println(key + " : " + value));


        }
    }

    private void printAttacks() {
        Iterator<Map.Entry<String, Map<String, Integer>>> iterator = generalAttacks.entrySet().iterator();


        while (iterator.hasNext()) {
            Map.Entry<String, Map<String, Integer>> result = iterator.next();
            System.out.println(result.getKey());

            Iterator<Map.Entry<String, Integer>> iterator2 = result.getValue().entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, Integer> result2 = iterator2.next();
                System.out.println("attack: " + result2.getKey() + "------Damage: " + result2.getValue());
            }

        }

    }
}
