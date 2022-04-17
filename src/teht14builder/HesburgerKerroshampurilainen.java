package teht14builder;

import java.util.ArrayList;

public class HesburgerKerroshampurilainen implements Kerroshampurilainen {
    private ArrayList<Osa> hampurilainen;

    public HesburgerKerroshampurilainen() {
        hampurilainen = new ArrayList<>();
        hampurilainen.add(new Sämpylä());
        hampurilainen.add(new Majoneesi());
        hampurilainen.add(new Pihvi());
        hampurilainen.add(new JäävuoriSalaatti());
    }

    @Override
    public String getContents() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Osa osa : hampurilainen) {
            stringBuilder.append(osa.toString()).append(" ");
        }
        return stringBuilder.toString();
    }
}
