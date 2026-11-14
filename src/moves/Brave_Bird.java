package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Brave_Bird extends PhysicalMove {
    public Brave_Bird() {
        super(Type.FLYING, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon s, double damage) {
        s.setMod(Stat.HP, (int) Math.round(damage / 3.0));
    }

    @Override
    protected String describe() {
        return "наносит сокрушительный урон, но получает урон от отдачи";
    }
}
