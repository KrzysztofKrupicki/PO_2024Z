package zad3;

public class Main {
    public static void main(String[] args) {
        checkEmail("tester@gmail.com");
        checkEmail("tester#gmail.com");
    }
    public static void checkEmail(String email){
        try {
            if(!email.contains("@")){
                throw new NiepoprawnyFormatDanychException();
            }
            System.out.println("Poprawny email");
        } catch (NiepoprawnyFormatDanychException e){
            System.out.println("Podany tekst nie jest adresem email");
        }
    }
}
