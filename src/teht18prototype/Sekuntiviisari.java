package teht18prototype;

public class Sekuntiviisari extends Viisari implements Cloneable {
    private int sekunti;

    @Override
    public void setAika(int aika) {
        sekunti = aika;
    }

    @Override
    public String getAika() {
        return String.valueOf(sekunti);
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
