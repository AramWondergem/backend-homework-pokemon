package Pokemons;

import PokemonBuildingblocks.ElectricPokemon;
import PokemonBuildingblocks.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pikachu extends ElectricPokemon {

    public Pikachu() {
        super("Pikachu", 60, "Hamster dryfood", "Pikachuuuuuuuuuuuuuuu", "quu..__\n" +
                " $$$b  `---.__\n" +
                "  \"$$b        `--.                          ___.---uuudP\n" +
                "   `$$b           `.__.------.__     __.---'      $$$$\"              .\n" +
                "     \"$b          -'            `-.-'            $$$\"              .'|\n" +
                "       \".                                       d$\"             _.'  |\n" +
                "         `.   /                              ...\"             .'     |\n" +
                "           `./                           ..::-'            _.'       |\n" +
                "            /                         .:::-'            .-'         .'\n" +
                "           :                          ::''\\          _.'            |\n" +
                "          .' .-.             .-.           `.      .'               |\n" +
                "          : /'$$|           .@\"$\\           `.   .'              _.-'\n" +
                "         .'|$u$$|          |$$,$$|           |  <            _.-'\n" +
                "         | `:$$:'          :$$$$$:           `.  `.       .-'\n" +
                "         :                  `\"--'             |    `-.     \\\n" +
                "        :##.       ==             .###.       `.      `.    `\\\n" +
                "        |##:                      :###:        |        >     >\n" +
                "        |#'     `..'`..'          `###'        x:      /     /\n" +
                "         \\                                   xXX|     /    ./\n" +
                "          \\                                xXXX'|    /   ./\n" +
                "          /`-.                                  `.  /   /\n" +
                "         :    `-  ...........,                   | /  .'\n" +
                "         |         ``:::::::'       .            |<    `.\n" +
                "         |             ```          |           x| \\ `.:``.\n" +
                "         |                         .'    /'   xXX|  `:`M`M':.\n" +
                "         |    |                    ;    /:' xXXX'|  -'MMMMM:'\n" +
                "         `.  .'                   :    /:'       |-'MMMM.-'\n" +
                "          |  |                   .'   /'        .'MMM.-'\n" +
                "          `'`'                   :  ,'          |MMM<\n" +
                "            |                     `'            |tbap\\\n" +
                "             \\                                  :MM.-'\n" +
                "              \\                 |              .''\n" +
                "               \\.               `.            /\n" +
                "                /     .:::::::.. :           /\n" +
                "               |     .:::::::::::`.         /\n" +
                "               |   .:::------------\\       /\n" +
                "              /   .''               >::'  /\n" +
                "              `',:                 :    .'\n" +
                "                                   `:.:' Tim Park", true,true);



    }

    @Override
    public void specialMove(Pokemon enemy) {
        attack(enemy,30,"Quick Attack");
    }

}

