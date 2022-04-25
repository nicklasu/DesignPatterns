package teht19mediator;

public class Mediator {
    private final Hyppaaja hyppaaja = new Hyppaaja("Simo");
    private final Mittaaja mittaaja = new Mittaaja();
    private final Arvostelutuomarit arvostelutuomarit = new Arvostelutuomarit();
    private final Kisasihteeri kisasihteeri = new Kisasihteeri();
    private final Tulostaulu tulostaulu = new Tulostaulu();

    public void aloitaKisa() {
        Hyppy hyppy = hyppaaja.hyppaa();
        hyppy = mittaaja.mittaaHypynPituus(hyppy);
        hyppy = arvostelutuomarit.arvioiHypynTyyli(hyppy);
        hyppaaja.talletaHyppy(hyppy);
        int pituus = hyppy.getPituus();
        int tyyli = hyppy.getTyyli();
        int pisteet = kisasihteeri.laskePisteet(pituus, tyyli);
        tulostaulu.talletaPisteet(hyppaaja.getNimi(), pisteet);
        System.out.println(tulostaulu.getTulostaulu().get(0).getNimi() + " pisteet:" + tulostaulu.getTulostaulu().get(0).getPisteet());
    }
}
