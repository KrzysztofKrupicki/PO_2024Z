package zad1;

public interface MyComparator {
    default int compare(int a, int b) {
        if (a < b) return -1;
        if (a > b) return 1;
        return 0;
    }
}
