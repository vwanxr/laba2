package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Body_Slam extends PhysicalMove {
    public Body_Slam() {
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "наваливается на соперника, нанося урон с шансом парализовать его";
    }
}
