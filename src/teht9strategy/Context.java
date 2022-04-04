package teht9strategy;

import java.util.ArrayList;
import java.util.List;

public class Context {
    List<String> list = new ArrayList<>();
    ChangeRowEveryOther changeRowEveryOther = new ChangeRowEveryOther();
    ChangeRowEveryTime changeRowEveryTime = new ChangeRowEveryTime();
    ChangeRowEveryThird changeRowEveryThird = new ChangeRowEveryThird();

    public void addItem() {
        for (int i = 0; i < 7; i++) {
            list.add("simo s");
            list.add("e gamma");
        }
        list.add("j coder");
    }

    public void printChangeRowList() {
        System.out.println("Every time change row:");
        System.out.println(changeRowEveryTime.listToString(list));
    }

    public void printChangeEveryOtherList() {
        System.out.println("Every second change row:");
        System.out.println(changeRowEveryOther.listToString(list));
    }

    public void printChangeRowEveryThird() {
        System.out.println("Every third change row:");
        System.out.println(changeRowEveryThird.listToString(list));
    }
}
