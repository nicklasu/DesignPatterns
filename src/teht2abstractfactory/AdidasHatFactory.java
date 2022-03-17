package teht2abstractfactory;

public class AdidasHatFactory implements HatFactory {
    @Override
    public Hat createHat() {
        return new AdidasHat();
    }
}
