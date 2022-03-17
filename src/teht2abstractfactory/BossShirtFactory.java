package teht2abstractfactory;

public class BossShirtFactory implements ShirtFactory {
    @Override
    public Shirt createShirt() {
        return new BossShirt();
    }
}