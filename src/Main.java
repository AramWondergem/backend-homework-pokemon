import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printWelkomMessage();

        Trainer trainer = new Trainer();

        ElectricPokemon pikachu1 = new Pikachu();
        GrassPokemon bulbasaur1 = new Bulbasaur();
        WaterPokemon squirtle1 = new Squirtle();
        FirePokemon charmander1 = new Charmander();

        trainer.addPokemon(pikachu1);
        trainer.addPokemon(bulbasaur1);
        trainer.addPokemon(squirtle1);
        trainer.addPokemon(charmander1);

        //Below is a check to see if the bi-directional relation between Trainer and Pokemon works
        trainer.printPokemonDeck();
        pikachu1.printTrainer();
        bulbasaur1.printTrainer();
        squirtle1.printTrainer();
        charmander1.printTrainer();

//        Pokemons attack each other
        pikachu1.thunderPunch(bulbasaur1);
        bulbasaur1.leaveBlade(squirtle1);
        squirtle1.rainDance(charmander1);
        charmander1.pyroBall(pikachu1);

        pikachu1.thunder(bulbasaur1);
        bulbasaur1.leafStorm(squirtle1);
        squirtle1.surf(charmander1);
        charmander1.specialMove(pikachu1);

        Trainer trainer2 = new Trainer();
//Below is a check to see if the bi-directional relation between Trainer and Pokemon works. If the remove and add methods work
        trainer.removePokemon(pikachu1);
        System.out.println("pikachu bij Aram verwijderd");
        pikachu1.printTrainer();
        trainer.printPokemonDeck();
        System.out.println("");


        trainer2.addPokemon(pikachu1);
        System.out.println("pikachu toegevoegd bij Henk");
        pikachu1.printTrainer();
        trainer2.printPokemonDeck();
        System.out.println("");


        trainer2.addPokemon(bulbasaur1);
        System.out.println("bulbasaur toegevoegd bij Henk");
        trainer2.printPokemonDeck();
        trainer.printPokemonDeck();
        bulbasaur1.printTrainer();
        System.out.println("");

        squirtle1.removeTrainer(squirtle1.getTrainer());
        System.out.println("Aram verwijderd bij Squirtle");
        squirtle1.printTrainer();
        trainer.printPokemonDeck();
        System.out.println("");

        squirtle1.addTrainer(trainer2);
        System.out.println("Henk toegevoegd aan squirtle");
        squirtle1.printTrainer();
        trainer2.printPokemonDeck();
        trainer.printPokemonDeck();
        System.out.println("");

        charmander1.addTrainer(trainer2);
        System.out.println("Henk toegevoegd aan charmander");
        charmander1.printTrainer();
        trainer.printPokemonDeck();
        trainer2.printPokemonDeck();




        
    }


    static void printWelkomMessage() {

        List<String> picture = new ArrayList<>();
        picture.add("" +
                "__  __   __     _,\n" +
                "\\\\  \\\\   / ___ '||  ___  ___ __  _  _   ___    _/|_ ___\n" +
                " \\\\ /\\\\ / //_\\) || // \\)// \\\\ ||'||'|| //_\\)    || // \\\\\n" +
                "  \\/  \\/  \\\\__,_||_\\\\__,\\\\_//_||_||_||_\\\\__,    \\|_\\\\_//\n" +
                "                                  ,'\\\n" +
                "    _.----.        ____         ,'  _\\   ___    ___     ____\n" +
                "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" +
                "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" +
                " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" +
                "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" +
                "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" +
                "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" +
                "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" +
                "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" +
                "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" +
                "                                `'                            '-._|");

        for(String line:picture){
            System.out.println(line);
        }

    }

    static void waitingMain(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}