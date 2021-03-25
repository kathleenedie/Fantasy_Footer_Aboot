package world;

public class Room {

    private Treasure treasure;
    private Boss boss;

    public Room(Treasure treasure, Boss boss){
        this.treasure = treasure;
        this.boss = boss;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Boss getBoss() {
        return boss;
    }
}
