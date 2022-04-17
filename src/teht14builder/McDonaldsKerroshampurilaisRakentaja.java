package teht14builder;

public class McDonaldsKerroshampurilaisRakentaja implements KerroshampurilaisBuilder {
    @Override
    public Kerroshampurilainen getBurger() {
        return new McDonaldsKerroshampurilainen();
    }
}
