package K31_integrity;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 1");
        Book book3 = new Book("Book 1", "Author 1");
        Book book4 = new Book("Book 3", "Author 1");
        System.out.println("1");
        announceIfUnique(book1, book2, book3);
        System.out.println("2");
        announceIfUnique(book1, book2, book4);
    }

    public static <T> void announceIfUnique(T arg1, T arg2, T arg3) {
        if (!arg1.equals(arg2) && !arg2.equals(arg3) && !arg3.equals(arg1)) {
            System.out.println("Każdy element jest unikalny");
        }
    }
}
