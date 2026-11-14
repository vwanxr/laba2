package pokemon;

import moves.Body_Slam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Poliwag {
    public Poliwhirl (String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(65, 65, 65, 50, 50, 90);
        this.addMove(new Body_Slam());
    }
}
