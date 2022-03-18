package teht3composite;

public class Main {
    public static void main(String[] args) {
        Komponentti näytönohjain = new Komponentti(1000, "Nvidia RTX 3060");
        Komponentti muistipiiri = new Komponentti(50, "DDR4 2666Mhz 8GB");
        Komponentti muistipiiri2 = new Komponentti(50, "DDR4 2666Mhz 8GB");
        Komponentti prosessori = new Komponentti(250, "AMD Ryzen 5 5600X");
        Komponentti ssd = new Komponentti(100, "Samsung m2 500GB");
        KoosteKomponentti emolevy = new KoosteKomponentti(100, "Asus B370");
        KoosteKomponentti kotelo = new KoosteKomponentti(75, "Antec mid tower");
        Komponentti kiintolevy = new Komponentti(100, "Western Digital, 3TB");
        Komponentti virtalähde = new Komponentti(100, "Evga 650W");

        emolevy.add(muistipiiri);
        emolevy.add(muistipiiri2);
        emolevy.add(ssd);
        emolevy.add(näytönohjain);
        emolevy.add(prosessori);
        kotelo.add(virtalähde);
        kotelo.add(emolevy);
        kotelo.add(kiintolevy);

        System.out.println(kotelo.toString());

    }
}
