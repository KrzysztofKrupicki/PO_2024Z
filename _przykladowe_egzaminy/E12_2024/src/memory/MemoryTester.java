package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager ramManager = new RAMManager();
        DiskManager diskManager = new DiskManager();
        ramManager.allocateMemory(5);
        ramManager.freeMemory();
        diskManager.allocateMemory(6);
        diskManager.freeMemory();
        System.out.println(MemoryManager.getMemoryType());
    }
}
