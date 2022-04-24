package teht18prototype;

public class Minuuttiviisari extends Viisari implements Cloneable {
    private int minuutti;

    @Override
    public void setAika(int aika) {
        minuutti = aika;
    }

    @Override
    public String getAika() {
        return String.valueOf(minuutti);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
