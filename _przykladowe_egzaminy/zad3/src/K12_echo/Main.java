package K12_echo;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Student 1", 23);
        Student student2 = new Student("Student 2", 24);
        Student student3 = new Student("Student 3", 23);
        System.out.println("student1, student2, student3: ");
        echoIfEquivalent(student1, student2, student3);
        System.out.println("student1, student3, student1: ");
        echoIfEquivalent(student1, student3, student1);
    }

    public static <T> void echoIfEquivalent(T arg1, T arg2, T arg3) {
        if (arg1.equals(arg2) && arg2.equals(arg3)) {
            System.out.println("Wszystkie trzy są równoważne");
        }
    }
}
