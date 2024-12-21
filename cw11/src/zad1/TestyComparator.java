package zad1;

public class TestyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        return MyComparator.super.compare(a, b);
    }
}
