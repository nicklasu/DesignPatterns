package teht14builder;

public class McDonaldsKerroshampurilainen implements Kerroshampurilainen {
    private String salaatti;
    private String pihvi;
    private String sämpylä;
    private String majoneesi;
    private StringBuilder hampurilainen;

    public McDonaldsKerroshampurilainen() {
        hampurilainen = new StringBuilder();
        salaatti = "Rapea salaatti";
        pihvi = "Mehevä pihvi";
        sämpylä = "Seesaminsiemensämpylä";
        majoneesi = "Salainen Thousand Island";
        hampurilainen.append(sämpylä).append(" ").append(salaatti).append(" ").append(pihvi).append(" ").append(" ").append(majoneesi);
    }

    @Override
    public String getContents() {
        return hampurilainen.toString();
    }
}
