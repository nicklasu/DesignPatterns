package teht22command;

public record ValkokangasYl√∂sCommand(Valkokangas valkokangas) implements ValkokangasCommand {
    @Override
    public void valkokangasTila() {
        valkokangas.valkokangasYl√∂s();
    }
}
