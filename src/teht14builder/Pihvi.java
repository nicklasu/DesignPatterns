package teht14builder;

public class Pihvi implements Osa{
    private String pihvi;
    public Pihvi(){
        pihvi = "Maukas pihvi";
    }
    @Override
    public String toString(){
        return pihvi;
    }
}
