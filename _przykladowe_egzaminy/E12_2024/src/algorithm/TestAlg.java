package algorithm;

public class TestAlg {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 4.3F);
        Student student2 = new Student("Jan Kowalski", 4.3F);
        Student student3 = new Student("Adam Nowak", 4.7F);
        System.out.println(Alg.compareThree(student1, student2, student3));
        System.out.println(Alg.compareThree(student1, student2, student1));
    }
}
