package teht10chainofresponsibility;

public class Javacoder extends Worker {
    private double pay;

    public Javacoder(double pay) {
        this.pay = pay;
    }

    @Override
    public void demandPayRaise(Teamleader teamleader, double payRaise) {
        pay *= teamleader.acceptPayRaise(payRaise);
    }

    @Override
    public double getPay() {
        return pay;
    }
}
