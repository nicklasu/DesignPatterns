package teht5singleton;

public class Laptop implements Computer {
    NetworkPrinterSingleton networkPrinterSingleton = NetworkPrinterSingleton.getInstance();
    String text = "";
    boolean color = false;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        networkPrinterSingleton.print(text, color);
    }
}
