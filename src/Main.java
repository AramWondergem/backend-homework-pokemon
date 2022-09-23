import PokemonBuildingblocks.GrassPokemon;
import PokemonBuildingblocks.Pokemon;
import PokemonBuildingblocks.ElectricPokemon;
import Pokemons.Bulbasaur;
import Pokemons.Pikachu;

public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu1 = new Pikachu();
        GrassPokemon bulbasaur1 = new Bulbasaur();

        pikachu1.thunderPunch(bulbasaur1);
        pikachu1.specialMove(bulbasaur1);
        bulbasaur1.eats();

        printPokemon();
    }


    public static void printPokemon() {

        String[] pokemon = {"                                  ,'\\\n" +
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
                "                                `'                            '-._|"};
        for (String line:pokemon){
            System.out.println(line);
        }
    }
}