package teht21facade;

import java.util.ArrayList;

public class HardDrive {
    //Source for the lba information:
    //http://www.idema.org/wp-content/downloads/2169.pdf
    private final ArrayList<Sector> hardDrive = new ArrayList<>();
    //Newer hard drives might have sector size of 4096 bytes.
    //It is probably faster (4096 bytes) when accessing big data sets
    //This hard drive has a sector size of 512 bytes.
    //Interesting LBA discussion https://superuser.com/questions/418211/lba-and-sector-size
    private final int sectorSize = 512;

    public HardDrive() {
        //This hard drive has 97 696 368 LBA counts, which is 300GB with a sector size of 512 bytes.
        System.out.println("Initializing hard drive with zeroes");
        for (int i = 0; i < 97_696_368; i++) {
            //512 byte sector size
            hardDrive.add(new Sector(sectorSize, "0"));
        }
    }

    public void writeBootSector() {
        System.out.println("Writing the boot sector (one LBA == 512 bytes). Sector can be bigger than one LBA.");
        StringBuilder stringBuilder = new StringBuilder();
        //Emulating master boot record.
        for (int i = 0; i < sectorSize; i++) {
            if (i % 2 == 0) {
                System.out.println("Byte: " + (i + 1) + " Data: 0");
                stringBuilder.append("0");
            } else {
                System.out.println("Byte: " + (i + 1) + " Data: 1");
                stringBuilder.append("1");
            }
        }
        //MBR is always the first sector of the drive.
        hardDrive.add(0, new Sector(sectorSize, stringBuilder.toString()));
    }

    public String read(long lba, int size) {
        System.out.println("Reading from lba position " + lba + " (first sector of the disk) with data size of " + size + " bytes (size of the sector)");
        StringBuilder data = new StringBuilder();
        //Each lba block is 512 bytes which means that the size (for example 4096 bytes) has to get divided, so we get the correct data for this application.
        //If size is 512 bytes, it means the loop goes through once, because 512 / 512 is 1.
        //Because each sector is 512 bytes, the math is correct.
        for (long i = lba; i <= size / sectorSize; i++) {
            data.append(hardDrive.get((int) i).readData());
        }
        return data.toString();
    }
}
