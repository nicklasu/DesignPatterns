package teht10chainofresponsibility;

public abstract class Worker {
    private double pay;

    public abstract void demandPayRaise(Teamleader teamleader, double payRaise);

    public abstract double getPay();
}
