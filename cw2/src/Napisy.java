public class Napisy {
    public static String reverseString(String napis) {
        StringBuilder odwrocony = new StringBuilder(napis);
//        for (int i = napis.length()-1; i>= 0; i--){
//            odwrocony.append(napis.charAt(i));
//        }
        return odwrocony.reverse().toString();
    }

    public static boolean startAndEndWithTheSameChar(String napis) {
        return napis.toLowerCase().charAt(0) == napis.toLowerCase().charAt(napis.length() - 1);
    }

    public static String replaceFirstAndLastChar(String napis) {
        return napis.charAt(napis.length() - 1) +
                napis.substring(1, napis.length() - 1) +
                napis.charAt(0);
    }

//    public static String piramida(char znak, int n) {
//        StringBuilder choinka = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) choinka.append(" ");
//            for (int j = i * 2; j >= 0; j--) choinka.append(znak);
//            choinka.append("\n");
//        }
//        return choinka.toString();
//    }
    public static void piramida(char znak, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = i * 2; j >= 0; j--) System.out.print(znak);
            System.out.println();
        }
    }

}