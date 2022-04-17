package teht14builder;

public class Sämpylä implements Osa {
    private String sämpylä;

    public Sämpylä() {
        sämpylä = "Seesaminsiemensämpylä";
    }

    @Override
    public String toString() {
        return sämpylä;
    }
}

