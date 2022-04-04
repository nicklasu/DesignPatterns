package teht9strategy;

import java.util.List;

public class ChangeRow implements ListConverter{
    @Override
    public String listToString(List list) {
        StringBuilder string = new StringBuilder("");
        for (Object o : list) {
            string.append(o.toString());
        }
        return string.toString();
    }
}
