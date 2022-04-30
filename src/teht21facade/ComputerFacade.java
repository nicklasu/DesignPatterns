package teht21facade;

public class ComputerFacade {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final HardDrive hardDrive = new HardDrive();

    public void Start() {
        System.out.println("Starting the computer with correct settings for loading MBR.");
        long kBootAddress = 1000;
        int kSectorSize = 512;
        long kBootSector = 0;
        cpu.freeze();
        hardDrive.writeBootSector();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
