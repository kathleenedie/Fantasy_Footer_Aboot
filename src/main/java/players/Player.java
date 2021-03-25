package players;

public abstract class Player {

    private int points;
    private String name;
    private int age;

    public Player(int points, String name, int age) {
        this.points = points;
        this.name = name;
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
