package teht21facade;

public class CPU {
    public void freeze() {
        System.out.println("Freeze!");
    }

    public void jump(long position) {
        //I don't fully understand what jump means in this context.
        //It has something to do with assembly code.
        System.out.println("CPU jump to position " + position);
    }

    public void execute() {
        System.out.println("Loading the system.");
    }
}
