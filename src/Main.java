

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        printWelkomMessage();
        choosingPokemonToCreat();

//        Trainer trainer = new Trainer();
//
//        Pokemon pikachu1 = new ElectricPokemon(1);
//        Pokemon bulbasaur1 = new GrassPokemon(1);
//        Pokemon squirtle1 = new WaterPokemon(1);
//        Pokemon charmander1 = new FirePokemon(1);
//
//        trainer.addPokemon(pikachu1);
//        trainer.addPokemon(bulbasaur1);
//        trainer.addPokemon(squirtle1);
//        trainer.addPokemon(charmander1);
//
//        //Below is a check to see if the bi-directional relation between Trainer and Pokemon works
//        trainer.printPokemonDeck();
//        pikachu1.printTrainer();
//        bulbasaur1.printTrainer();
//        squirtle1.printTrainer();
//        charmander1.printTrainer();
//
//
//        Trainer trainer2 = new Trainer();
////Below is a check to see if the bi-directional relation between Trainer and Pokemon works. If the remove and add methods work
//        trainer.removePokemon(pikachu1);
//        System.out.println("pikachu bij Aram verwijderd");
//        pikachu1.printTrainer();
//        trainer.printPokemonDeck();
//        System.out.println("");
//
//
//        trainer2.addPokemon(pikachu1);
//        System.out.println("pikachu toegevoegd bij Henk");
//        pikachu1.printTrainer();
//        trainer2.printPokemonDeck();
//        System.out.println("");
//
//
//        trainer2.addPokemon(bulbasaur1);
//        System.out.println("bulbasaur toegevoegd bij Henk");
//        trainer2.printPokemonDeck();
//        trainer.printPokemonDeck();
//        bulbasaur1.printTrainer();
//        System.out.println("");
//
//        squirtle1.removeTrainer(squirtle1.getTrainer());
//        System.out.println("Aram verwijderd bij toBeDeleted.Squirtle");
//        squirtle1.printTrainer();
//        trainer.printPokemonDeck();
//        System.out.println("");
//
//        squirtle1.addTrainer(trainer2);
//        System.out.println("Henk toegevoegd aan squirtle");
//        squirtle1.printTrainer();
//        trainer2.printPokemonDeck();
//        trainer.printPokemonDeck();
//        System.out.println("");
//
//        charmander1.addTrainer(trainer2);
//        System.out.println("Henk toegevoegd aan charmander");
//        charmander1.printTrainer();
//        trainer.printPokemonDeck();
//        trainer2.printPokemonDeck();


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

        for (String line : picture) {
            System.out.println(line);
        }

    }

    public static void waitingMain(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void choosingPokemonToCreat() {
        Scanner userInput = new Scanner(System.in);
        Integer placeholderTypePokemon=null;
        Integer placeHolderPokemonChoice=null;
        boolean correctAnswer;
        Pokemon.printListOfPokemons();

        do {
            try {
                System.out.println("Welke van bovenstaande pokemons wil je aanmaken? Type eerst het nummer van het type en daarna het nummer van de pokemon");
                System.out.println("Type: ");
                placeholderTypePokemon=userInput.nextInt();
                System.out.println("Pokemon: ");
                placeHolderPokemonChoice=userInput.nextInt();
                correctAnswer=true;


            } catch (NoSuchElementException e) {
                System.out.println("Het is niet goed gegaan. Probeer het opnieuw");
                correctAnswer = false;
                userInput.nextLine();//workaround to reset the scanner
            }
        }
        while (!correctAnswer);

        switch (placeholderTypePokemon){
            case 1:
                System.out.println("Fire pokemon is made");
                break;
            case 2:
                System.out.println("Electric pokemon is made");
                break;
            case 3:
                System.out.println("Grass pokemon is made");
                break;
            case 4:
                System.out.println("Water pokemon is made");
                break;
        }
    }

}