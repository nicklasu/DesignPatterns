package teht19mediator;

import java.util.Random;

public class Arvostelutuomarit {
    public Hyppy arvioiHypynTyyli(Hyppy hyppy) {
        Random random = new Random();
        //Oletetaan, että tämä random on viiden tuomarin yhteispäätös.
        hyppy.setTyyli(random.nextInt(1, 5));
        return hyppy;
    }
}
