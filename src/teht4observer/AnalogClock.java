package teht4observer;

public class AnalogClock implements Observer {
    private String time;

    @Override
    public void update(Object o) {
        //Check that the object is of correct type (String).
        if (o instanceof String) {
            this.time = (String) o;
        }
    }

    @Override
    public String toString() {
        return "Kello on " + time;
    }
}
