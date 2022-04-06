package teht10chainofresponsibility;

public abstract class Coordinator {
    public static int LÄHI = 0;
    public static int PÄÄLLIKKÖ = 1;

    private int level;

    private Coordinator nextCoordinator;
    public void setNextCoordinator(Coordinator nextCoordinator){
        this.nextCoordinator = nextCoordinator;
    }
    public void acceptPayRaise(int level){
        if(this.level >= level){
            //Do the pay raise
        } else {
            this.nextCoordinator.acceptPayRaise(level);
        }
    }
}
