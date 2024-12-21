package zad6;

public class Main {
    public static void main(String[] args) {
        try {
            sprawdzFormatDanych("test$mail.com");
        } catch (NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
        try {
            sprawdzFormatDanych("test@mail.com");
        } catch (NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
    }

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if (!dane.contains("@")) {
            throw new NiepoprawnyFormatDanychException("Niepoprawne dane");
        }
        System.out.println("Poprawne dane");
    }
}
