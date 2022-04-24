package teht18prototype;

public class Kello implements Cloneable {
    private Sekuntiviisari sekuntiviisari;
    private Minuuttiviisari minuuttiviisari;
    private Tuntiviisari tuntiviisari;

    public Kello() {
        sekuntiviisari = new Sekuntiviisari();
        minuuttiviisari = new Minuuttiviisari();
        tuntiviisari = new Tuntiviisari();
    }

    public void asetaAika(int tunti, int minuutti, int sekunti) {
        sekuntiviisari.setAika(sekunti);
        minuuttiviisari.setAika(minuutti);
        tuntiviisari.setAika(tunti);
    }

    public String naytaAika() {
        return tuntiviisari.getAika() + ":" + minuuttiviisari.getAika() + ":" + sekuntiviisari.getAika();
    }

    public Kello clone() {
        //Syväkopio
        try {
            Kello k = (Kello) super.clone();
            k.tuntiviisari = (Tuntiviisari) tuntiviisari.clone();
            k.minuuttiviisari = (Minuuttiviisari) minuuttiviisari.clone();
            k.sekuntiviisari = (Sekuntiviisari) sekuntiviisari.clone();
            return k;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
