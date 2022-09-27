public class ElectricPokemon extends Pokemon {


    private int type;
    public ElectricPokemon(int type) {
        super();
        this.type=type;
        createPokemon();
//
    }

    public void createPokemon (){
        switch(type) {
            case 1:
                super.pokemonBirth("Pikachu", 60, "Hamster dryfood", "Pikachuuuuuuuuuuuuuuu", "quu..__\n" +
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
                        "                                   `:.:' Tim Park");

        }

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
