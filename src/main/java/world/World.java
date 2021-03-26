package world;

import players.Player;

import java.util.ArrayList;

public class World {

    private ArrayList<Room> rooms;
    private Player player;

    public World(Player pLayer){
        this.rooms = new ArrayList<Room>();
        this.player = player;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public String canCollectTreasure(){
        for (Room room : getRooms()) {
            Treasure treasure = room.getTreasure();
            if (player.getPoints() >= treasure.getPoints()) {
                return "collect treasure";
            }
        }
        return "no more rooms";
    }


}
