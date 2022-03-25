package teht4observer;

public interface Clock {
    int hour = 0;
    int minute = 0;
    int second = 0;

    public default void tick() {
    }

    public default String getTime() {
        return hour + ":" + minute + ":" + second;
    }
}
