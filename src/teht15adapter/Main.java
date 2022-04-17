package teht15adapter;

public class Main {
    public static void main(final String[] arguments) {
        EuropeanDate europeanDate = new EuropeanDate(30,12,2020);
        System.out.println(europeanDate.getDate());
        DateAdapter dateAdapter = new DateAdapter(europeanDate);
        AmericanDate americanDate = dateAdapter.getAmericanDate();
        System.out.println(americanDate.getDate());
    }
}
