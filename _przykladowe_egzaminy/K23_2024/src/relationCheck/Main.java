package relationCheck;

public class Main {
    public static void main(String[] args) {
        String obj1 = null;
        String obj2 = "obj2";
        System.out.println(isExactlyOneNull(obj1, obj1));
        System.out.println(isExactlyOneNull(obj1, obj2));
    }
    public static <T> boolean isExactlyOneNull(T object1, T object2){
        return object1 == null && object2 != null || object1 != null && object2 == null;
    }
}
