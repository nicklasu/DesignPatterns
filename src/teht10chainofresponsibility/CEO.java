package teht10chainofresponsibility;

public class CEO extends Coordinator {
    private final double level = 2;

    @Override
    public void setNextCoordinator(Coordinator nextCoordinator) {
    }

    @Override
    public double acceptPayRaise(double level) {
        if (this.level >= level) {
            System.out.println("Simo accepts.");
            //Do the pay raise
            return level;
        } else {
            System.out.println("That's too much!");
            return 1;
        }
    }
}
