package teht2abstractfactory;

public class AdidasPantsFactory implements PantsFactory{
    @Override
    public Pants createPants() {
        return new AdidasPants();
    }
}
