package teht9strategy;

import java.util.Iterator;
import java.util.List;

public class ChangeRowEveryTime implements ListConverter {

    @Override
    public String listToString(List list) {
        Iterator iterator = list.iterator();
        StringBuilder string = new StringBuilder();
        while (iterator.hasNext()) {
            string.append(iterator.next()).append("\n");
        }
        return string.toString();
    }
}
