package teht11memento;

import java.util.Random;

public class Asiakas extends Thread {
    private Memento memento;
    private Arvuuttaja arvuuttaja;
    private Random random;

    public Asiakas() {
        random = new Random();
    }

    public int arvaaLuku() {
        return new Random().nextInt();
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento annaMemento() {
        return memento;
    }

    public void getArvuuttaja(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        while (true) {
            int kysymys = random.nextInt(0, 1000);
            System.out.println("Arvattu luku: " + kysymys);
            if (kysymys == arvuuttaja.katsoSisalto(memento)) {
                System.out.println(kysymys + " oli oikea vastaus.");
                break;
            }
        }
        interrupt();
    }
}
