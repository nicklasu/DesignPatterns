package teht6decorator;

public class Jauheliha extends PizzaDecorator implements Pizza {
    public Jauheliha(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String tayte() {
        return super.tayte() + tautaJauhelihalla();
    }

    @Override
    public int hinta() {
        return super.hinta() + 2;
    }

    private String tautaJauhelihalla() {
        return " jauhelihalla";
    }
}
