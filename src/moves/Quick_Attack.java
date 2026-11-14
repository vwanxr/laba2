package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Quick_Attack extends PhysicalMove {
    public Quick_Attack() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "наносит стремительный физический удар";
    }
}
