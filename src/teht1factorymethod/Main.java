package teht1factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();
        AterioivaOtus vierailja = new Vierailija();
        vierailja.aterioi();
    }
}
