package vehicle;

public class TestAlg {
    public static void main(String[] args) {
        Integer[] integers1 = new Integer[]{5, 3, 2, 1};
        Integer[] integers2 = new Integer[]{5, 3, 4, 1};
        System.out.println(Alg.isDescending(integers1));
        System.out.println(Alg.isDescending(integers2));
    }
}
