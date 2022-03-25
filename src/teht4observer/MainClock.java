package teht4observer;

import java.util.ArrayList;
import java.util.List;

public abstract class MainClock implements Clock {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private String event;
    private List<Observer> observers = new ArrayList();

    public void setObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setEvent(String event) {
        this.event = event;
        for (Observer o : observers) {
            o.update(this.event);
        }
    }

    @Override
    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        setEvent(this.getTime());
    }
    @Override
    public String getTime(){
        return hour + ":" + minute + ":" + second;
    }

}
