package teht2abstractfactory;

public class AdidasShoesFactory implements ShoesFactory {
    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
