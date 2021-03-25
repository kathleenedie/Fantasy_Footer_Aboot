package world;

public class Treasure {

    private String name;
    private int points;

    public Treasure(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
