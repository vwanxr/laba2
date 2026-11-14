package pokemon;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Skarmory extends Pokemon {
    public Skarmory (String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FLYING);
        setStats(65, 80,140, 40, 70, 70);
        this.addMove(new Swagger());
        this.addMove(new Agility());
        this.addMove(new Rock_Tomb());
        this.addMove(new Brave_Bird());
    }
}
