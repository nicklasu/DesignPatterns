package teht14builder;

public class Main {
    public static void main(final String[] arguments) {
        HesburgerKerroshampurilaisRakentaja hesburgerKerroshampurilaisRakentaja = new HesburgerKerroshampurilaisRakentaja();
        McDonaldsKerroshampurilaisRakentaja mcDonaldsKerroshampurilaisRakentaja = new McDonaldsKerroshampurilaisRakentaja();
        Kerroshampurilainen hesburgerKerroshampurilainen = hesburgerKerroshampurilaisRakentaja.getBurger();
        Kerroshampurilainen mcDonaldsKerroshampurilainen = mcDonaldsKerroshampurilaisRakentaja.getBurger();
        System.out.println(hesburgerKerroshampurilainen.getContents());
        System.out.println(mcDonaldsKerroshampurilainen.getContents());
    }
}
