package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swords_Dance extends StatusMove {
    public Swords_Dance() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon s) {
        s.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected boolean checkAccuracy(Pokemon s, Pokemon p) {
        return true;
    }

    @Override
    protected String describe() {
        return "исполняет танец с мечами, повышая показатель своей атаки на две ступени";
    }
}
