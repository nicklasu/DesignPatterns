package teht9strategy;

import java.util.ArrayList;
import java.util.List;

public class Context {
    List<String> list = new ArrayList<>();
    ChangeRow changeRow = new ChangeRow();

    public void addItem() {
        list.add("test");
    }

    public void printList() {
        System.out.println(changeRow.listToString(list));
    }
}
