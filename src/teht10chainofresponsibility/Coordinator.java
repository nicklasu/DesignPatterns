package teht10chainofresponsibility;

public abstract class Coordinator {
    private double level;

    private Coordinator nextCoordinator;

    public abstract void setNextCoordinator(Coordinator nextCoordinator);

    public abstract double acceptPayRaise(double level);
}
