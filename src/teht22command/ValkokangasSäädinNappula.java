package teht22command;

public record ValkokangasSäädinNappula(ValkokangasCommand valkokangasCommand) {
    public void paina() {
        valkokangasCommand.valkokangasTila();
    }
}
