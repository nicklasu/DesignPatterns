package teht5singleton;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setText("Important documentation");
        computer.print();
        computer.setColor(true);
        computer.print();
    }
}
