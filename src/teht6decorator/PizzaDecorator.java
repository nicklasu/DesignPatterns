package teht6decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza paistettuPizza;
    public PizzaDecorator(Pizza pizza){
        paistettuPizza = pizza;
    }

    @Override
    public int hinta(){
        return paistettuPizza.hinta();
    }

    @Override
    public String tayte() {
        return paistettuPizza.tayte();
    }
}
