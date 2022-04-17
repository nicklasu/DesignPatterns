package teht15adapter;

public class AmericanDate {
    private int day;
    private int month;
    private int year;

    public AmericanDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getDate() {
        return month + "." + day + "." + year;
    }
}
