package teht3composite;

public class Komponentti implements LaiteOsa {
    private int hinta;
    private String nimi;
    public Komponentti(int hinta, String nimi) {
        this.hinta = hinta;
        this.nimi = nimi;
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

    @Override
    public String toString() {
        return nimi;
    }
}
