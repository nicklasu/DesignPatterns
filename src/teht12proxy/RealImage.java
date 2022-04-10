package teht12proxy;

import java.util.Date;

class RealImage implements Image {
    private final String filename;
    private final String creationDate;
    private final String size;
    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        this.creationDate = String.valueOf(new Date(System.currentTimeMillis()));
        this.size = String.valueOf(10);
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        loadImageFromDisk();
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Filename: " + filename + " Creation date: " + creationDate + " Size: " + size + "MB");
    }
}
