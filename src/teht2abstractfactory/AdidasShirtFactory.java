package teht2abstractfactory;

public class AdidasShirtFactory implements ShirtFactory {
    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }
}