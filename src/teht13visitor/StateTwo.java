package teht13visitor;

public class StateTwo extends State {
    public StateTwo(Context context) {
        super(context);
    }

    @Override
    public void handle(Context context) {
    }

    @Override
    public String toString(){
        return "StateTwo";
    }
}
