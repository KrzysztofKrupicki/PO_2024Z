package memory;

public class DiskManager implements MemoryManager {
    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating Disk Space");
    }
}
