package teht10chainofresponsibility;

public abstract class Worker {
    private double pay;

    private void doPayRaise(double level) {
        this.pay *= level;
    }

    private double demandPayRaise(){
        return 0;
    }

    private double getPay() {
        return pay;
    }
}
