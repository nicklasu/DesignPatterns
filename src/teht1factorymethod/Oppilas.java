package teht1factorymethod;

public class Oppilas extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new Maito();
    }
}
