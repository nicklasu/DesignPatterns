package teht5singleton;

public class NetworkPrinterSingleton {
    private static NetworkPrinterSingleton instance;

    private NetworkPrinterSingleton() {
    }

    public static NetworkPrinterSingleton getInstance() {
        if (instance == null) {
            instance = new NetworkPrinterSingleton();
        }
        return instance;
    }

    public void print(String string, boolean color) {
        if (color) {
            System.out.println(string + " \nin colors.\n");
        }
        System.out.println(string + "\nin black and white.\n");
    }
}
