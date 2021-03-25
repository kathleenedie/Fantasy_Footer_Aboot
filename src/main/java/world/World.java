package world;

import java.util.ArrayList;

public class World {

    private ArrayList<Room> rooms;

    public void World(){
        this.rooms = new ArrayList<Room>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
