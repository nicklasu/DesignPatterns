package teht20iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainA {
    public static void main(final String[] arguments) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        Iterator<Integer> iterator2 = set.iterator();
        //a) Set käydään kaksi kertaa läpi, jos molemmilla threadeilla on omat iteraattorit
        Thread thread1 = new Thread(() -> {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        });
        Thread thread2 = new Thread(() -> {
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next());
            }
        });
        thread1.start();
        thread2.start();
    }
}
