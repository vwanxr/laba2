package pokemon;

import moves.Swords_Dance;
import ru.ifmo.se.pokemon.Type;

public final class Diggersby extends Bunnelby {
    public Diggersby (String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.GROUND);
        setStats(85, 56, 77, 50, 77, 78);
        this.addMove(new Swords_Dance());
    }
}
