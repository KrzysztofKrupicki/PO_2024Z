package echo;

public class TestAlg {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", 23);
        Student student2 = new Student("Jacek", 23);
        Student student3 = new Student("Juliusz", 23);
        Alg.echoIfEquivalent(student1, student2, student3);
    }
}
