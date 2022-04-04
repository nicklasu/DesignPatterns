package teht9strategy;

import java.util.List;

public class ChangeRowEveryOther implements ListConverter {
    @Override
    public String listToString(List list) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (((i + 1) % 2) == 0) {
                string.append(list.get(i).toString()).append("\n");
            } else {
                string.append(list.get(i).toString()).append(" ");
            }
        }
        return string.toString();
    }
}
