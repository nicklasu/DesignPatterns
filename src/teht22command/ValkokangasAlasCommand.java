package teht22command;

public record ValkokangasAlasCommand(Valkokangas valkokangas) implements ValkokangasCommand {
    @Override
    public void valkokangasTila() {
        valkokangas.valkokangasAlas();
    }
}
