package pokemon;

import moves.Focus_Blast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Politoed extends Poliwhirl {
    public Politoed (String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(90, 75, 75, 90, 100, 70);
        this.addMove(new Focus_Blast());
    }
}
