package pokemon;

import moves.Double_Slap;
import moves.Quick_Attack;
import moves.Take_Down;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bunnelby extends Pokemon {
    public Bunnelby (String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(38, 36, 38, 32, 36, 57);
        this.addMove(new Double_Slap());
        this.addMove(new Take_Down());
        this.addMove(new Quick_Attack());
    }
}
