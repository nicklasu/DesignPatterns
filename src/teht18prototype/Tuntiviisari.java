package teht18prototype;

public class Tuntiviisari extends Viisari implements Cloneable {
    private int tunti;

    @Override
    public void setAika(int aika) {
        tunti = aika;
    }

    @Override
    public String getAika() {
        return String.valueOf(tunti);
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

