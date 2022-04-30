package teht21facade;

public class Sector {
    private final int size;
    private String data;

    public Sector(int size, String data) {
        this.size = size;
        //Let's assume, that String is the representation of zeros and ones.
        //Let's also assume, that 1 byte == 1 ASCII character.
        if (data.length() <= size) {
            this.data = data;
        }
    }

    public String readData() {
        return data;
    }
    public int readSize(){
        return size;
    }
}
