package teht20iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainB {
    public static void main(final String[] arguments) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.remove(2);
        Iterator<Integer> iterator = set.iterator();
        //b) Set käydään vain kerran läpi jos molemmilla sama iteraattori.
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
