package teht11memento;

import java.util.Random;

public class Arvuuttaja {
    public Memento liityPeliin(Asiakas asiakas){
        return new Memento(new Random().nextInt(0, 1000));
    }
    public int katsoSisalto(Memento memento){
        return memento.getLuku();
    }
}
