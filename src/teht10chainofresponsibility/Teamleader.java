package teht10chainofresponsibility;

public class Teamleader extends Coordinator {

    private final double level = 1.02;
    private Coordinator nextCoordinator;

    @Override
    public void setNextCoordinator(Coordinator nextCoordinator) {
        this.nextCoordinator = nextCoordinator;
    }

    @Override
    public double acceptPayRaise(double level) {
        if (this.level >= level) {
            System.out.println("Teamleader accepts.");
            //Do the pay raise
            return level;
        } else {
            return this.nextCoordinator.acceptPayRaise(level);
        }
    }
}
