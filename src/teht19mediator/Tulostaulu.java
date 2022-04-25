package teht19mediator;

import java.util.ArrayList;

public class Tulostaulu {
    private ArrayList<Tulosrivi> tulostaulu = new ArrayList<>();

    public void talletaPisteet(String hyppaajanNimi, int pisteet) {
        tulostaulu.add(new Tulosrivi(hyppaajanNimi, pisteet));
    }

    public ArrayList<Tulosrivi> getTulostaulu() {
        return tulostaulu;
    }
}
