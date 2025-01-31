package checking;

public class Checker {
    public static <T> boolean isEqualOrNull(T object1, T object2){
        if(object1 == null && object2 == null){
            return true;
        }
        if(object1 == null || object2 == null){
            return false;
        }
        return object1.equals(object2);
    }
}
