package teht20iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainD {
    public static void main(final String[] arguments) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Iterator<Integer> iterator = set.iterator();
        iterator.forEachRemaining((number) -> System.out.println(number));
        //Iterator pitää aina ajojen välissä asettaa uudelleen.
        iterator = set.iterator();
        //Iteroi setin, mutta alkaa 4 ja päättyy 8.
        iterator.forEachRemaining((number) -> System.out.println(number+3));
        iterator = set.iterator();
        //Näinkin voi iteroida.
        iterator.forEachRemaining(System.out::println);
        iterator = set.iterator();
        //Pitää kutsua next(), tai muuten remove() heittää illegalStateExceptionin.
        iterator.next();
        //Poistaa 1 tässä tapauksessa.
        iterator.remove();
        iterator.next();
        iterator.next();
        //Poistaa 2 ja 3.
        iterator.remove();
        //Iteroi jäljelle jääneet 4 ja 5.
        iterator.forEachRemaining(System.out::println);
    }
}
