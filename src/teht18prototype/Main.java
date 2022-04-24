package teht18prototype;

public class Main {
    public static void main(final String[] arguments) {
        Kello kello = new Kello();
        kello.asetaAika(10, 20, 58);
        System.out.println(kello.naytaAika());
        Kello kello2 = kello.clone();
        System.out.println(kello2.naytaAika());
        kello2.asetaAika(12, 30, 14);
        System.out.println(kello2.naytaAika());
        System.out.println(kello.naytaAika());
    }
}
