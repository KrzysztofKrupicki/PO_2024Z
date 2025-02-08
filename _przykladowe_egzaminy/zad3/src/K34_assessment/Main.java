package K34_assessment;

public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        Course course1 = new Course("Subject", "Code 1");
        Course course2 = new Course("Subject", "Code 2");
        Course course3 = new Course("Subject", "Code 1");
        signalIfNotEqual(course1, course2, course3);
        System.out.println("2");
        signalIfNotEqual("hello", "hello", "hello");
    }

    public static <T> void signalIfNotEqual(T arg1, T arg2, T arg3) {
        if (!arg1.equals(arg2) || !arg2.equals(arg3) || !arg3.equals(arg1)) {
            System.out.println("Co najmniej jeden jest różny");
        }
    }
}
