package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable {
    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGoals() {
        return goals;
    }

    public void setGoals(int[] goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }

    @Override
    public FootballPlayer clone() {
        try {
            FootballPlayer clone = (FootballPlayer) super.clone();
            clone.goals = goals.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void changeGoalsOnLastPosition(int value) {
        goals[goals.length - 1] = value;
    }
}
