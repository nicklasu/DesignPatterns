package teht10chainofresponsibility;

public class TeamTeamleader extends Coordinator {
    private final double level = 1.05;
    private Coordinator nextCoordinator;

    @Override
    public void setNextCoordinator(Coordinator nextCoordinator) {
        this.nextCoordinator = nextCoordinator;
    }

    @Override
    public double acceptPayRaise(double level) {
        if (this.level >= level) {
            System.out.println("TeamTeamleader accepts.");
            //Do the pay raise
            return level;
        } else {
            return this.nextCoordinator.acceptPayRaise(level);
        }
    }
}
