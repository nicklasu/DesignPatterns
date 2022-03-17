package teht1factorymethod;

public class Vierailija extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new Kotikalja();
    }
}
