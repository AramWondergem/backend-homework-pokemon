import PokemonBuildingblocks.*;
import Pokemons.Bulbasaur;
import Pokemons.Charmander;
import Pokemons.Pikachu;
import Pokemons.Squirtle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printWelkomMessage();

        ElectricPokemon pikachu1 = new Pikachu();
        GrassPokemon bulbasaur1 = new Bulbasaur();
        WaterPokemon squirtle1 = new Squirtle();
        FirePokemon charmander = new Charmander();

        pikachu1.thunderPunch(bulbasaur1);
        bulbasaur1.leaveBlade(squirtle1);
        squirtle1.rainDance(charmander);
        charmander.pyroBall(pikachu1);

        pikachu1.thunder(bulbasaur1);
        bulbasaur1.leafStorm(squirtle1);
        squirtle1.surf(charmander);
        charmander.specialMove(pikachu1);

        
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

}