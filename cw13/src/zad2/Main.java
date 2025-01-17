package zad2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Grand Theft Auto 5", "action", LocalDate.parse("2015-12-20"));
        VideoGame game2 = game1.clone();
        game1.releaseDate = LocalDate.parse("2025-10-20");
        System.out.println(game1.getReleaseDate());
        System.out.println(game2.getReleaseDate());

//        VideoGame game2 = null;
//        try {
//            game2 = (VideoGame) game1.clone();
//        } catch (CloneNotSupportedException e) {
//            System.out.println("Nie udalo sie sklonowac");
//        }
//        game1.releaseDate = LocalDate.parse("2025-10-20");
//        System.out.println(game1.getReleaseDate());
//        System.out.println(game2.getReleaseDate());
    }
}
