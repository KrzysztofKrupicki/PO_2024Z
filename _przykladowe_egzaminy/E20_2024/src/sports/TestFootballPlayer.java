package sports;

public class TestFootballPlayer {
    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer("Football Player 1", new int[]{3,5,7});
        FootballPlayer fp2 = fp1.clone();
        fp1.changeGoalsOnLastPosition(3);
        System.out.println(fp1);
        System.out.println(fp2);
    }
}
