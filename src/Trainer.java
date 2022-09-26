import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trainer {
    private String name;
    private static String trainerSign = "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "TTTTTTTTTTTTTTTTTTTTTTT                                      iiii                                                                          \n" +
            "T:::::::::::::::::::::T                                     i::::i                                                                         \n" +
            "T:::::::::::::::::::::T                                      iiii                                                                          \n" +
            "T:::::TT:::::::TT:::::T                                                                                                                    \n" +
            "TTTTTT  T:::::T  TTTTTTrrrrr   rrrrrrrrr   aaaaaaaaaaaaa   iiiiiiinnnn  nnnnnnnn        eeeeeeeeeeee    rrrrr   rrrrrrrrr                  \n" +
            "        T:::::T        r::::rrr:::::::::r  a::::::::::::a  i:::::in:::nn::::::::nn    ee::::::::::::ee  r::::rrr:::::::::r                 \n" +
            "        T:::::T        r:::::::::::::::::r aaaaaaaaa:::::a  i::::in::::::::::::::nn  e::::::eeeee:::::eer:::::::::::::::::r                \n" +
            "        T:::::T        rr::::::rrrrr::::::r         a::::a  i::::inn:::::::::::::::ne::::::e     e:::::err::::::rrrrr::::::r               \n" +
            "        T:::::T         r:::::r     r:::::r  aaaaaaa:::::a  i::::i  n:::::nnnn:::::ne:::::::eeeee::::::e r:::::r     r:::::r               \n" +
            "        T:::::T         r:::::r     rrrrrrraa::::::::::::a  i::::i  n::::n    n::::ne:::::::::::::::::e  r:::::r     rrrrrrr               \n" +
            "        T:::::T         r:::::r           a::::aaaa::::::a  i::::i  n::::n    n::::ne::::::eeeeeeeeeee   r:::::r                           \n" +
            "        T:::::T         r:::::r          a::::a    a:::::a  i::::i  n::::n    n::::ne:::::::e            r:::::r                           \n" +
            "      TT:::::::TT       r:::::r          a::::a    a:::::a i::::::i n::::n    n::::ne::::::::e           r:::::r                           \n" +
            "      T:::::::::T       r:::::r          a:::::aaaa::::::a i::::::i n::::n    n::::n e::::::::eeeeeeee   r:::::r                           \n" +
            "      T:::::::::T       r:::::r           a::::::::::aa:::ai::::::i n::::n    n::::n  ee:::::::::::::e   r:::::r                           \n" +
            "      TTTTTTTTTTT       rrrrrrr            aaaaaaaaaa  aaaaiiiiiiii nnnnnn    nnnnnn    eeeeeeeeeeeeee   rrrrrrr                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "IIIIIIIIII                                                                                                                                 \n" +
            "I::::::::I                                                                                                                                 \n" +
            "I::::::::I                                                                                                                                 \n" +
            "II::::::II                                                                                                                                 \n" +
            "  I::::I      ssssssssss                                                                                                                   \n" +
            "  I::::I    ss::::::::::s                                                                                                                  \n" +
            "  I::::I  ss:::::::::::::s                                                                                                                 \n" +
            "  I::::I  s::::::ssss:::::s                                                                                                                \n" +
            "  I::::I   s:::::s  ssssss                                                                                                                 \n" +
            "  I::::I     s::::::s                                                                                                                      \n" +
            "  I::::I        s::::::s                                                                                                                   \n" +
            "  I::::I  ssssss   s:::::s                                                                                                                 \n" +
            "II::::::IIs:::::ssss::::::s                                                                                                                \n" +
            "I::::::::Is::::::::::::::s                                                                                                                 \n" +
            "I::::::::I s:::::::::::ss                                                                                                                  \n" +
            "IIIIIIIIII  sssssssssss                                                                                                                    \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                   dddddddd\n" +
            "        CCCCCCCCCCCCC                                                                tttt                                          d::::::d\n" +
            "     CCC::::::::::::C                                                             ttt:::t                                          d::::::d\n" +
            "   CC:::::::::::::::C                                                             t:::::t                                          d::::::d\n" +
            "  C:::::CCCCCCCC::::C                                                             t:::::t                                          d:::::d \n" +
            " C:::::C       CCCCCCrrrrr   rrrrrrrrr       eeeeeeeeeeee    aaaaaaaaaaaaa  ttttttt:::::ttttttt        eeeeeeeeeeee        ddddddddd:::::d \n" +
            "C:::::C              r::::rrr:::::::::r    ee::::::::::::ee  a::::::::::::a t:::::::::::::::::t      ee::::::::::::ee    dd::::::::::::::d \n" +
            "C:::::C              r:::::::::::::::::r  e::::::eeeee:::::eeaaaaaaaaa:::::at:::::::::::::::::t     e::::::eeeee:::::ee d::::::::::::::::d \n" +
            "C:::::C              rr::::::rrrrr::::::re::::::e     e:::::e         a::::atttttt:::::::tttttt    e::::::e     e:::::ed:::::::ddddd:::::d \n" +
            "C:::::C               r:::::r     r:::::re:::::::eeeee::::::e  aaaaaaa:::::a      t:::::t          e:::::::eeeee::::::ed::::::d    d:::::d \n" +
            "C:::::C               r:::::r     rrrrrrre:::::::::::::::::e aa::::::::::::a      t:::::t          e:::::::::::::::::e d:::::d     d:::::d \n" +
            "C:::::C               r:::::r            e::::::eeeeeeeeeee a::::aaaa::::::a      t:::::t          e::::::eeeeeeeeeee  d:::::d     d:::::d \n" +
            " C:::::C       CCCCCC r:::::r            e:::::::e         a::::a    a:::::a      t:::::t    tttttte:::::::e           d:::::d     d:::::d \n" +
            "  C:::::CCCCCCCC::::C r:::::r            e::::::::e        a::::a    a:::::a      t::::::tttt:::::te::::::::e          d::::::ddddd::::::dd\n" +
            "   CC:::::::::::::::C r:::::r             e::::::::eeeeeeeea:::::aaaa::::::a      tt::::::::::::::t e::::::::eeeeeeee   d:::::::::::::::::d\n" +
            "     CCC::::::::::::C r:::::r              ee:::::::::::::e a::::::::::aa:::a       tt:::::::::::tt  ee:::::::::::::e    d:::::::::ddd::::d\n" +
            "        CCCCCCCCCCCCC rrrrrrr                eeeeeeeeeeeeee  aaaaaaaaaa  aaaa         ttttttttttt      eeeeeeeeeeeeee     ddddddddd   ddddd\n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           \n" +
            "                                                                                                                                           ";
    private List<Pokemon> pokemonDeck = new ArrayList<>();

    public Trainer() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name, trainer?");
        this.name = userInput.nextLine();
        System.out.println(trainerSign);
        Main.waitingMain(1000);
        System.out.println("Their name is " + name);
    }

    public String getName() {
        return name;
    }

    public void addPokemon (Pokemon pokemon) {
        pokemonDeck.add(pokemon);
        if (pokemon.getTrainer()!=this&&pokemon.getTrainer()!=null) {
            pokemon.removeTrainer(pokemon.getTrainer());
        }
        pokemon.addTrainer(this);
    }

    public void removePokemon (Pokemon pokemon) {
        pokemonDeck.remove(pokemon);
        pokemon.removeTrainer(this);
    }

    public boolean checkPokemon (Pokemon pokemon) {
        return pokemonDeck.contains(pokemon);

    }

    public void printPokemonDeck () {
        System.out.println(name + " has the following pokemons:");
        for (Pokemon p:pokemonDeck) {
            System.out.println(p.getName());
        }
    }

}
