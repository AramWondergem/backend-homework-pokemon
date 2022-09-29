import java.util.HashMap;
import java.util.Map;

public class FirePokemon extends Pokemon {

    protected static Map<Integer,String> firePokemon = new HashMap<>();

    static {
        firePokemon.put(1,"Charmander");
    }

    public FirePokemon(String type) {
        super(type);
    }

}

