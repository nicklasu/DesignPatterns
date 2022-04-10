package teht13visitor;

public class Context {
    private State state = new StateOne(this);
    private Visitor visitor = new Visitor();

    void nextState() {
        visitor.visit(this);
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
