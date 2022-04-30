package teht22command;

public record ValkokangasYlösCommand(Valkokangas valkokangas) implements ValkokangasCommand {
    @Override
    public void valkokangasTila() {
        valkokangas.valkokangasYlös();
    }
}
