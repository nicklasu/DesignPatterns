package teht15adapter;

public class DateAdapter {
    EuropeanDate europeanDate;

    public DateAdapter(EuropeanDate europeanDate) {
        this.europeanDate = europeanDate;
    }

    public AmericanDate getAmericanDate() {
        //Erotellaan päivät, vuodet ja kuukaudet
        String date = europeanDate.getDate();
        int day = Integer.parseInt(date.substring(0, date.indexOf(".")));
        int month = Integer.parseInt(date.substring(date.indexOf(".") + 1, date.lastIndexOf(".")));
        int year = Integer.parseInt(date.substring(date.lastIndexOf(".") + 1));
        return new AmericanDate(month, day, year);
    }
}
