package teht2abstractfactory;

public class BossPantsFactory implements PantsFactory {
    @Override
    public Pants createPants() {
        return new BossPants();
    }
}
