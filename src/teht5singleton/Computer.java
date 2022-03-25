package teht5singleton;

public class Computer {
    NetworkPrinterSingleton networkPrinterSingleton = NetworkPrinterSingleton.getInstance();
    String text = "";
    boolean color = false;

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(boolean color){
        this.color = color;
    }

    public void print() {
        networkPrinterSingleton.print(text, color);
    }
}
