package teht9strategy;

import java.util.List;

public class ChangeRowEveryThird implements ListConverter {
    @Override
    public String listToString(List list) {
        StringBuilder string = new StringBuilder();
        String[] stringArray = new String[list.size()];
        stringArray = (String[]) list.toArray(stringArray);
        for (int i = 0; i < stringArray.length; i++) {
            if (((i + 1) % 3) == 0) {
                string.append(stringArray[i]).append("\n");
            } else {
                string.append(stringArray[i]).append(" ");
            }
        }
        return string.toString();
    }
}
