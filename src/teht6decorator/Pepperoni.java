package teht6decorator;

public class Pepperoni extends PizzaDecorator implements Pizza {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String tayte() {
        return super.tayte() + taytaPepperonilla();
    }

    @Override
    public int hinta() {
        return super.hinta() + 4;
    }

    private String taytaPepperonilla() {
        return " pepperonilla";
    }
}
