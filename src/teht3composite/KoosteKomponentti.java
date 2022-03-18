package teht3composite;

import java.util.ArrayList;
import java.util.List;

public class KoosteKomponentti implements LaiteOsa {
    private int hinta;
    private String nimi;
    private final List<LaiteOsa> liitetytOsat = new ArrayList<>();

    public KoosteKomponentti(int hinta, String nimi) {
        this.hinta = hinta;
        this.nimi = nimi;
    }

    public void add(LaiteOsa laiteOsa) {
        liitetytOsat.add(laiteOsa);
    }

    @Override
    public void setHinta(int hinta) {
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public LaiteOsa get(int i) {
        return liitetytOsat.get(i);
    }

    @Override
    public String toString() {
        String kokonaisuus = "Koostekomponentin hinta: " + hinta + "€ nimi " + nimi + " osat:\n";
        int kokonaishinta = 0;
        for (LaiteOsa laiteOsa : liitetytOsat) {
            if (laiteOsa.getClass() == Komponentti.class) {
                kokonaisuus += laiteOsa.toString() + ", " + laiteOsa.getHinta() + "€\n";
                kokonaishinta += laiteOsa.getHinta();
            } else {
                KoosteKomponentti koosteKomponentti = (KoosteKomponentti) laiteOsa;
                kokonaishinta += koosteKomponentti.kokonaishinta();
                kokonaisuus += laiteOsa.toString();
            }
        }
        return kokonaisuus + nimi + " komponenttien kokonaishinta: " + (kokonaishinta + hinta) + "€\n";
    }

    public int size() {
        return liitetytOsat.size();
    }

    public int kokonaishinta() {
        int kokonaishinta = 0;
        for (LaiteOsa laiteOsa : liitetytOsat) {
            kokonaishinta += laiteOsa.getHinta();
        }
        return (kokonaishinta + hinta);
    }
}
