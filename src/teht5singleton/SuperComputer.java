package teht5singleton;

public class SuperComputer implements Computer {
    NetworkPrinterSingleton networkPrinterSingleton = NetworkPrinterSingleton.getInstance();
    String text = "";
    boolean color = false;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    //Only supercomputers can print in color.
    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public void print() {
        networkPrinterSingleton.print(text, color);
    }
}
