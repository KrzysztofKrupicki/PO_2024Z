package L25_validation;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Author 1");
        Book book2 = new Book("World", "Author 1");
        Book book3 = new Book("Java", "Author 1");
        System.out.println(isAnyMatch(book1, book2, book3));
    }

    public static <T> boolean isAnyMatch(T arg1, T arg2, T arg3) {
        return arg1.equals(arg2) || arg2.equals(arg3) || arg3.equals(arg1);
    }
}
