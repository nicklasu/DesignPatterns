package teht6decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new Tomaattikastike(new Juusto(new Pepperoni(new PizzaImplementation())));
        Pizza margaritaPizza = new Tomaattikastike(new Juusto((new PizzaImplementation())));
        Pizza jauhelihaPizza = new Tomaattikastike(new Juusto((new Jauheliha(new PizzaImplementation()))));
        PizzaMenu pizzaMenu = new PizzaMenu();
        pizzaMenu.addPizza(pepperoniPizza);
        pizzaMenu.addPizza(margaritaPizza);
        pizzaMenu.addPizza(jauhelihaPizza);
        pizzaMenu.tulostaMenu();
    }
}
