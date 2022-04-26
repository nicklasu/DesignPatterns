package teht20iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainC {
    public static void main(final String[] arguments) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> iterator = set.iterator();
        set.remove(2);
        //c) Ohjelma kaatuu, jos settiin tehdään muutoksia iteraattorin alustuksen jälkeen.
        //Iterator ei ole thread safe, mutta se ei nähtävästi ole ongelma
        //Vaikka muutokset olisi tehty ennen threadien käynnistystä, mutta iteraattorin alustuksen jälkeen
        //Ohjelma kaatuu
        //https://stackoverflow.com/questions/64910609/thread-safety-of-iterator-next
        Thread thread1 = new Thread(() -> {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        });
        Thread thread2 = new Thread(() -> {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        });
        thread1.start();
        thread2.start();
    }
}
