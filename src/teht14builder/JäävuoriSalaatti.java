package teht14builder;

public class JäävuoriSalaatti implements Osa{
    private String salaatti;
    public JäävuoriSalaatti(){
        salaatti = "Jäävuorisalaatti";
    }
    @Override
    public String toString(){
        return salaatti;
    }
}
