package world;

public class Room {

    private String name;
    private Treasure treasure;
    private Boss boss;

    public Room(String name, Treasure treasure, Boss boss){
        this.name = name;
        this.treasure = treasure;
        this.boss = boss;

    }

    public String getName() {
        return name;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Boss getBoss() {
        return boss;
    }
}
