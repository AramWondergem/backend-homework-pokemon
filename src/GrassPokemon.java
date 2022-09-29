import java.util.HashMap;
import java.util.Map;

public class GrassPokemon extends Pokemon {

    protected static Map<Integer,String> grassPokemon = new HashMap<>();

    static {
        grassPokemon.put(1,"Bulbasaur");
    }
        public GrassPokemon(String type) {
            super(type);
        }


    }
