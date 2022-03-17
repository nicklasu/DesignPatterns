package teht2abstractfactory;

public class BossShoesFactory implements ShoesFactory {
    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}
