package teht10chainofresponsibility;

public abstract class Coordinator {
    public static double LÄHI = 1.02;
    public static double PÄÄLLIKKÖ = 1.05;

    private double level;

    private Coordinator nextCoordinator;

    public void setNextCoordinator(Coordinator nextCoordinator) {
        this.nextCoordinator = nextCoordinator;
    }

    public void acceptPayRaise(double level) {
        if (this.level >= level) {
            //Do the pay raise
        } else {
            this.nextCoordinator.acceptPayRaise(level);
        }
    }
}
