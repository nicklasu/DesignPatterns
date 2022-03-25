package teht5singleton;

public class Main {
    public static void main(String[] args) {
        SuperComputer ibmSummit = new SuperComputer();
        Laptop ibmThinkPad = new Laptop();
        ibmThinkPad.setText("Not important at all");
        ibmSummit.setText("Important documentation");
        ibmSummit.print();
        ibmThinkPad.print();
        ibmSummit.setColor(true);
        ibmSummit.print();
    }
}
