package teht19mediator;

import java.util.Random;

public class Mittaaja {
    public Hyppy mittaaHypynPituus(Hyppy hyppy) {
        Random random = new Random();
        hyppy.setPituus(random.nextInt(1, 300));
        return hyppy;
    }
}
