package teht4observer;

public class Main {
    public static void main(String[] args) {
        ClockObserver simo = new ClockObserver();
        ClockObserver fullstackDeveloper = new ClockObserver();
        DigitalClock casioClock = new DigitalClock();

        casioClock.setObserver(simo);
        casioClock.setObserver(fullstackDeveloper);

        for(int i = 0; i < 82800; i++){
            casioClock.tick();
            System.out.println(simo);
        }

        System.out.println(fullstackDeveloper);

    }
}
