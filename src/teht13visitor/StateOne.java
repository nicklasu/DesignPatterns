package teht13visitor;

public class StateOne extends State {
    public StateOne(Context context) {
        super(context);
    }

    @Override
    public void handle(Context context) {
    }

    @Override
    public String toString() {
        return "StateOne";
    }
}
