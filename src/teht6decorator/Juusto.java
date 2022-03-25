package teht6decorator;

public class Juusto extends PizzaDecorator implements Pizza {
    public Juusto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String tayte() {
        return super.tayte() + taytaJuustolla();
    }

    @Override
    public int hinta() {
        return super.hinta() + 2;
    }

    private String taytaJuustolla() {
        return " juustolla";
    }
}
