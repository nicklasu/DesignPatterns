package teht19mediator;

import java.util.ArrayList;

public class Hyppaaja {
    private ArrayList<Hyppy> hyppytaulu = new ArrayList<>();
    private String nimi;

    public String getNimi() {
        return nimi;
    }

    public Hyppaaja(String nimi) {
        this.nimi = nimi;
    }

    public Hyppy hyppaa() {
        return new Hyppy();
    }

    public void talletaHyppy(Hyppy hyppy) {
        hyppytaulu.add(hyppy);
    }
}
