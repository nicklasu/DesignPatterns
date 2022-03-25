package teht6decorator;

public class Tomaattikastike extends PizzaDecorator implements Pizza {
    public Tomaattikastike(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String tayte() {
        return super.tayte() + taytaTomaattikastikkeella();
    }

    @Override
    public int hinta() {
        return super.hinta() + 1;
    }

    private String taytaTomaattikastikkeella() {
        return " tomaattikastikkeella";
    }
}
