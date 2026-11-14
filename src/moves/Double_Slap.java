package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Double_Slap extends PhysicalMove {
    public Double_Slap() {
        super(Type.NORMAL, 15, 85);
    }
    private int hits;
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        double chance = Math.random();
        if (chance <= (3.0/8)) {
            hits = 2;
        }
        else if (chance <= (6.0/8)) {
            hits = 3;
        }
        else if (chance <= (7.0/8)) {
            hits = 4;
        }
        else {
            hits = 5;
        }
        super.applyOppDamage(p, damage*hits);
    }
    @Override
    protected String describe() {
        return "отвешивает пощечины, нанося " + hits + " удара(ов) подряд";
    }
}
