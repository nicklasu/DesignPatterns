package teht6decorator;

public class PizzaImplementation implements Pizza {

    @Override
    public String tayte() {
        return "Rapea pizzapohja";
    }

    @Override
    public int hinta() {
        return 2;
    }
}
