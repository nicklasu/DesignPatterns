package teht4observer;

public class Main {
    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock casio = new DigitalClock();
        AnalogClock simo = new AnalogClock();
        clockTimer.setObserver(casio);
        clockTimer.setObserver(simo);

        //23 tuntia...
        for (int i = 0; i < 82800; i++) {
            clockTimer.tick();
        }
        Runnable runnable = () -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    clockTimer.tick();
                    System.out.println(casio);
                    System.out.println(simo + ". Aika mennä nukkumaan.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
