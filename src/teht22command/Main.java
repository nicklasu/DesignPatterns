package teht22command;

public class Main {
    public static void main(final String[] arguments) {
        Valkokangas valkokangas = new Valkokangas();
        ValkokangasSäädinNappula valkokangasAlasNappula = new ValkokangasSäädinNappula(new ValkokangasAlasCommand(valkokangas));
        ValkokangasSäädinNappula valkokangasYlösNappula = new ValkokangasSäädinNappula(new ValkokangasYlösCommand(valkokangas));
        valkokangasAlasNappula.paina();
        valkokangasYlösNappula.paina();
    }
}
