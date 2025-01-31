package algorithm;

import java.util.HashSet;

public class TestSubset {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(5);
        hs1.add(3);
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(4);
        hs2.add(5);
        hs2.add(2);
        hs2.add(3);
        Subset subset = new Subset();
        System.out.println(subset.isSubset(hs1, hs2));
        HashSet<Book> hsb1 = new HashSet<>();
        hsb1.add(new Book("AA", "TT"));
        hsb1.add(new Book("BB", "SR"));
        HashSet<Book> hsb2 = new HashSet<>();
        hsb2.add(new Book("AA", "TT"));
        hsb2.add(new Book("PP", "NN"));
        hsb2.add(new Book("BB", "RR"));
        System.out.println(subset.isSubset(hsb1, hsb2));
    }
}
