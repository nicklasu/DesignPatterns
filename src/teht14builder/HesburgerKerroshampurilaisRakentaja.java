package teht14builder;

public class HesburgerKerroshampurilaisRakentaja implements KerroshampurilaisBuilder {
    @Override
    public HesburgerKerroshampurilainen getBurger() {
        return new HesburgerKerroshampurilainen();
    }
}
