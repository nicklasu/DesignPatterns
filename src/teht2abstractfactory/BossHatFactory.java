package teht2abstractfactory;

public class BossHatFactory implements HatFactory {
    @Override
    public Hat createHat() {
        return new BossHat();
    }
}
