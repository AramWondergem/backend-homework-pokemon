import java.util.HashMap;
import java.util.Map;

public class WaterPokemon extends Pokemon {

    protected static Map<Integer,String> waterPokemon = new HashMap<>();

    static {
        waterPokemon.put(1,"Squirtle");
    }
    public WaterPokemon(String type) {
        super(type);
    }

}
