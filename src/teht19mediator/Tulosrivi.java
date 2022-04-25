package teht19mediator;

public class Tulosrivi {
    private String nimi;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getPisteet() {
        return pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    private int pisteet;

    public Tulosrivi(String nimi, int pisteet) {
        this.nimi = nimi;
        this.pisteet = pisteet;
    }
}
