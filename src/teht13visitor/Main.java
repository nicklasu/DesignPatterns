package teht13visitor;

public class Main {
    public static void main(final String[] arguments) {
        Context context = new Context();
        System.out.println(context.getState().toString());
        context.nextState();
        System.out.println(context.getState().toString());
        context.nextState();
        System.out.println(context.getState().toString());
        context.nextState(); //Doesn't change state.
        System.out.println(context.getState().toString());
    }
}
