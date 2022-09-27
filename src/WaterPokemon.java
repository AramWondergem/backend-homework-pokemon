public class WaterPokemon extends Pokemon {

    private int type;
    public WaterPokemon(int type) {
        super();
        this.type=type;
        createPokemon();
    }

    public void createPokemon (){
        switch(type) {
            case 1:
                super.pokemonBirth("toBeDeleted.Squirtle", 60, "seaweed", "Hibriaaaaa","               _,........__\n" +
                        "            ,-'            \"`-.\n" +
                        "          ,'                   `-.\n" +
                        "        ,'                        \\\n" +
                        "      ,'                           .\n" +
                        "      .'\\               ,\"\".       `\n" +
                        "     ._.'|             / |  `       \\\n" +
                        "     |   |            `-.'  ||       `.\n" +
                        "     |   |            '-._,'||       | \\\n" +
                        "     .`.,'             `..,'.'       , |`-.\n" +
                        "     l                       .'`.  _/  |   `.\n" +
                        "     `-.._'-   ,          _ _'   -\" \\  .     `\n" +
                        "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n" +
                        ".'        `\"-..___      __,'\\          \\  \\     \\\n" +
                        "\\_ .          |   `\"\"\"\"'    `.           . \\     \\\n" +
                        "  `.          |              `.          |  .     L\n" +
                        "    `.        |`--...________.'.        j   |     |\n" +
                        "      `._    .'      |          `.     .|   ,     |\n" +
                        "         `--,\\       .            `7\"\"' |  ,      |\n" +
                        "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n" +
                        "             \\ `.     .          /      |  '      |  ,'          `.\n" +
                        "              \\  v.__  .        '       .   \\    /| /              \\\n" +
                        "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n" +
                        "                `        .        `._ ___,j.  `/ .-       ,---.     |\n" +
                        "                ,`-.      \\         .\"     `.  |/        j     `    |\n" +
                        "               /    `.     \\       /         \\ /         |     /    j\n" +
                        "              |       `-.   7-.._ .          |\"          '         /\n" +
                        "              |          `./_    `|          |            .     _,'\n" +
                        "              `.           / `----|          |-............`---'\n" +
                        "                \\          \\      |          |\n" +
                        "               ,'           )     `.         |\n" +
                        "                7____,,..--'      /          |\n" +
                        "                                  `---.__,--.'mh");

        }

    }
        public void surf(Pokemon enemy) {
            attack(enemy,30,"surf");
        }

        public void rainDance(Pokemon enemy) {
            attack(enemy,40,"Raindance" );
        }

        public void hydroPump(Pokemon enemy) {
            attack(enemy,50, "Hydropump");
        }

        public void hydroCanon(Pokemon enemy) {
            attack(enemy,60,"Hydrocanon" );
        }
    }
