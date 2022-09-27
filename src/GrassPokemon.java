public class GrassPokemon extends Pokemon {

        private int type;
        public GrassPokemon(int type) {
            super();
            this.type=type;
            createPokemon();
//
        }

        public void createPokemon (){
            switch(type) {
                case 1:
                    super.pokemonBirth("toBeDeleted.Bulbasaur", 60, "Onions", "BrrrrBrrrrBrrrr","                                           /\n" +
                            "                        _,.------....___,.' ',.-.\n" +
                            "                     ,-'          _,.--\"        |\n" +
                            "                   ,'         _.-'              .\n" +
                            "                  /   ,     ,'                   `\n" +
                            "                 .   /     /                     ``.\n" +
                            "                 |  |     .                       \\.\\\n" +
                            "       ____      |___._.  |       __               \\ `.\n" +
                            "     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\\n" +
                            "    .  ,            __               `              |   .\n" +
                            "    `,'         ,-\"'  .               \\             |    L\n" +
                            "   ,'          '    _.'                -._          /    |\n" +
                            "  ,`-.    ,\".   `--'                      >.      ,'     |\n" +
                            " . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'\n" +
                            " ||:, .           ,'  ;  /  / \\ `        `.    .      .'/\n" +
                            " j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /\n" +
                            "/ L:_  |                 .  \"' :_;                `.'.'\n" +
                            ".    \"\"'                  \"\"\"\"\"'                    V\n" +
                            " `.                                 .    `.   _,..  `\n" +
                            "   `,_   .    .                _,-'/    .. `,'   __  `\n" +
                            "    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .\n" +
                            "   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |\n" +
                            "  .   _  `\"\"'--.._____..--\"   ,             '         |\n" +
                            "  | .\" `. `-.                /-.           /          ,\n" +
                            "  | `._.'    `,_            ;  /         ,'          .\n" +
                            " .'          /| `-.        . ,'         ,           ,\n" +
                            " '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'\n" +
                            " `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--' mh");

            }

        }

        public void leaveBlade(Pokemon enemy) {
            attack(enemy,30, "LeaveBlade");
        }

        public void leechSeed(Pokemon enemy) {
            attack(enemy,40, "Leechseed");
        }

        public void leafStorm(Pokemon enemy) {
            attack(enemy,50, "Leafstorm");
        }

        public void treeCanon(Pokemon enemy) {
            attack(enemy,60,"Treecanon");
        }
    }
