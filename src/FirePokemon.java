public class FirePokemon extends Pokemon {

    private int type;
    public FirePokemon(int type) {
        super();
        this.type=type;
        createPokemon();
    }

    public void createPokemon (){
        switch(type) {
            case 1:
                super.pokemonBirth("toBeDeleted.Charmander", 60, "Chicken", "Chaaaarmander", "              _.--\"\"`-..\n" +
                        "            ,'          `.\n" +
                        "          ,'          __  `.\n" +
                        "         /|          \" __   \\\n" +
                        "        , |           / |.   .\n" +
                        "        |,'          !_.'|   |\n" +
                        "      ,'             '   |   |\n" +
                        "     /              |`--'|   |\n" +
                        "    |                `---'   |\n" +
                        "     .   ,                   |                       ,\".\n" +
                        "      ._     '           _'  |                    , ' \\ `\n" +
                        "  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|\n" +
                        "  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\n" +
                        "-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\n" +
                        "  `,         \"\"\"\"'     `.              ,'         |   |  ',,\n" +
                        "    `.      '            '            /          '    |'. |/\n" +
                        "      `.   |              \\       _,-'           |       ''\n" +
                        "        `._'               \\   '\"\\                .      |\n" +
                        "           |                '     \\                `._  ,'\n" +
                        "           |                 '     \\                 .'|\n" +
                        "           |                 .      \\                | |\n" +
                        "           |                 |       L              ,' |\n" +
                        "           `                 |       |             /   '\n" +
                        "            \\                |       |           ,'   /\n" +
                        "          ,' \\               |  _.._ ,-..___,..-'    ,'\n" +
                        "         /     .             .      `!             ,j'\n" +
                        "        /       `.          /        .           .'/\n" +
                        "       .          `.       /         |        _.'.'\n" +
                        "        `.          7`'---'          |------\"'_.'\n" +
                        "       _,.`,_     _'                ,''-----\"'\n" +
                        "   _,-_    '       `.     .'      ,\\\n" +
                        "   -\" /`.         _,'     | _  _  _.|\n" +
                        "    \"\"--'---\"\"\"\"\"'        `' '! |! /\n" +
                        "                            `\" \" -' mh");

        }

    }

        public void inferno(Pokemon enemy) {
            attack(enemy,30,"Inferno" );
        }

        public void pyroBall(Pokemon enemy) {
            attack(enemy,40, "Pyroball" );
        }

        public void fireLash(Pokemon enemy) {
            attack(enemy,50,"Firelash" );
        }

        public void flameThrower(Pokemon enemy) {
            attack(enemy,60,"Flamethrower" );
        }
    }

