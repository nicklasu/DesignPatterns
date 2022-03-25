package teht6decorator;

import java.util.ArrayList;

public class PizzaMenu {
    ArrayList<Pizza> PizzaMenu = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        PizzaMenu.add(pizza);
    }

    public void tulostaMenu() {
        for (Pizza pizza : PizzaMenu) {
            System.out.println(pizza.tayte() + " " + pizza.hinta() + "€");
        }
    }
}
