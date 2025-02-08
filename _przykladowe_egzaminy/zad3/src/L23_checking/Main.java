package L23_checking;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {4,7,1,8,3,5};
        System.out.println(findMaxElement(integers));
    }
    public static <T extends Comparable<T>> T findMaxElement(T[] array){
        T max = array[0];
        for(T elem : array){
            if(max.compareTo(elem) < 0){
                max = elem;
            }
        }
        return max;
    }
}
