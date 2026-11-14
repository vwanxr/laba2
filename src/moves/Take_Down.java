package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Take_Down extends PhysicalMove {
    public Take_Down() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfDamage(Pokemon s, double damage) {
        s.setMod(Stat.HP, (int) Math.round(damage / 4.0));
    }

    @Override
    protected String describe() {
        return "бросается на соперника, нанося урон, но травмируя себя от отдачи";
    }
}
