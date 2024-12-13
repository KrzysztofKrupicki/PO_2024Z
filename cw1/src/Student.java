public class Student {
    public String nrIndeksu;
    public String imie;
    public String nazwisko;

    public Student() {

    }

    public Student(String nrIndeksu, String imie, String nazwisko) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie + " " + nazwisko);
    }
}
