package teht15adapter;

public class EuropeanDate {
    private int day;
    private int month;
    private int year;
    public EuropeanDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDate(){
        return day + "." + month + "." + year;
    }
}
