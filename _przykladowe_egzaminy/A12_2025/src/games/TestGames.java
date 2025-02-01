package games;

public class TestGames {
    public static void main(String[] args) {
        ComputerGame game1 = new ComputerGame("Game 1", "Producer 1", new double[]{4.5, 5.2, 7.8});
        ComputerGame game2 = new ComputerGame("Game 2", "Producer 1", new double[]{7.5, 2.7, 6.4});
        System.out.println(game1);
        game1.addRating(4.2);
        System.out.println(game1);
        System.out.println(game2);
        game2.removeRating(1);
        System.out.println(game2);
        System.out.println("game1.equals(game1)= " + game1.equals(game1));
        System.out.println("game1.equals(game2)= " + game1.equals(game2));
        System.out.println("game1.hashcode()= " + game1.hashCode());
        System.out.println("game2.hashcode()= " + game2.hashCode());
    }
}
