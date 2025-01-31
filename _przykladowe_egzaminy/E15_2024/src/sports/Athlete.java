package sports;

public class Athlete {
    private String name;
    private String sport;
    private int yearOfAchievement;

    public Athlete(String name, String sport, int yearOfAchievement) {
        this.name = name;
        this.sport = sport;
        this.yearOfAchievement = yearOfAchievement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getYearOfAchievement() {
        return yearOfAchievement;
    }

    public void setYearOfAchievement(int yearOfAchievement) {
        this.yearOfAchievement = yearOfAchievement;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", yearOfAchievement=" + yearOfAchievement +
                '}';
    }
}
