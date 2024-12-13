package zad4.entertainment;

import zad4.AdventureGame;
import zad4.StrategyGame;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new StrategyGame());
        games.add(new AdventureGame());
        games.add(new AdventureGame());
        games.add(new StrategyGame());
        games.add(new StrategyGame());

        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i).getRating());
        }
    }
}
