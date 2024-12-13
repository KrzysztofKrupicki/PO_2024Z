public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.nrIndeksu = "1";
        student.imie = "Robert";
        student.nazwisko = "Kubica";

        Student student2 = new Student("2", "Andrzej", "Andrzejewski");
        student.przedstawSie();
        student2.przedstawSie();
    }
}