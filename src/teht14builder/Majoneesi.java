package teht14builder;

public class Majoneesi implements Osa {
    private String majoneesi;

    public Majoneesi() {
        majoneesi = "Herkullinen paprikamajoneesi";
    }
    @Override
    public String toString() {
        return majoneesi;
    }
}
