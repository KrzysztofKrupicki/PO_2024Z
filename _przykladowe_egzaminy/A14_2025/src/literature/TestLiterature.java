package literature;

public class TestLiterature {
    public static void main(String[] args) {
        Novel n1 = new Novel("Novel 1", "Author 1", new double[]{3.5, 5.1});
        Novel n2 = new Novel("Novel 2", "Author 1", new double[]{6.1, 8.6});
        n2.addRating(7.5);
        System.out.println(n2);
        System.out.println(n1.equals(n2));
        System.out.println(n2.hashCode());
    }
}
