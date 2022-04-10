package teht11memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Asiakas asiakas = new Asiakas();
        asiakas.setMemento(arvuuttaja.liityPeliin(asiakas));
        asiakas.getArvuuttaja(arvuuttaja);
        Asiakas asiakas2 = new Asiakas();
        asiakas2.setMemento(arvuuttaja.liityPeliin(asiakas));
        asiakas2.getArvuuttaja(arvuuttaja);
        asiakas.start();
        asiakas2.start();
    }
}
