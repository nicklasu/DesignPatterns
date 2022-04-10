package teht13visitor;

import java.util.Objects;

public class Visitor {
    public void visit(Context context) {
        if (Objects.equals(context.getState().toString(), "StateOne"))
            context.setState(new StateTwo(context));
        else if (Objects.equals(context.getState().toString(), "StateTwo")) {
            context.setState(new StateThree(context));
        }
    }
}
