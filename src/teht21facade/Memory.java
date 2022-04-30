package teht21facade;

import java.util.ArrayList;

public class Memory {
    //This memory operates with a byte (8 bits, eight ones and zeroes), which is not how real memory operates
    ArrayList<Sector> memory = new ArrayList<>();

    public Memory() {
        //This system has a megabyte of memory
        for (int i = 0; i < 1_000_000; i++) {
            memory.add(new Sector(1, "0"));
        }
    }

    public void load(long position, String data) {
        System.out.println("Setting memory from position " + position + " onwards with data from the hard disk: " + data);
        for (int i = (int) position; i < data.length(); i++) {
            memory.add(i, new Sector(i, String.valueOf(data.charAt(i))));
        }
    }
}
