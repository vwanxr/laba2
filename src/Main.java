import pokemon.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main (String... args) {
        Battle b = new Battle();

        Bunnelby bunnelby = new Bunnelby("кролик", 1);
        Diggersby diggersby = new Diggersby("заяц", 1);
        Politoed politoed = new Politoed("жабка", 1);

        Poliwag poliwag = new Poliwag("головастик", 1);
        Poliwhirl poliwhirl = new Poliwhirl("силач", 1);
        Skarmory skarmory = new Skarmory("птичка", 1);

        b.addAlly(bunnelby);
        b.addAlly(diggersby);
        b.addAlly(politoed);

        b.addFoe(poliwag);
        b.addFoe(poliwhirl);
        b.addFoe(skarmory);
        b.go();
    }
}