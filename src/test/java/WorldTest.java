import org.junit.Before;
import org.junit.Test;
import players.Sourcerer;
import players.SourcererType;
import tool.ToolType;
import world.Boss;
import world.Room;
import world.Treasure;
import world.World;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WorldTest {

    private Sourcerer wizard;
    private Treasure treasure1;
    private Treasure treasure2;
    private Boss boss1;
    private Boss boss2;
    private Room room1;
    private Room room2;
    private World world;

    @Before
    public void before() {

        wizard = new Sourcerer(10, "Willy", 110, SourcererType.WIZARD, "Gnome", ToolType.FREEZE);
        treasure1 = new Treasure("gem", 10);
        treasure2 = new Treasure("gold", 30);
        boss1 = new Boss("Boorish Basil", ToolType.AXE);
        boss2 = new Boss("Surly Sharon", ToolType.POTION);
        room1 = new Room("Vault", treasure1, boss1);
        room2 = new Room("Dungeon", treasure2, boss2);
        world = new World(wizard);
    }

    @Test
    public void hasEmptyRoomList() {
        assertEquals(0, world.getRooms().size());
    }

    @Test
    public void canAddRooms(){
        world.addRoom(room1);
        assertEquals(1, world.getRooms().size());
    }

//    @Test
//    public void canCollectTreasure(){
//        world.addRoom(room1);
//        world.addRoom(room2);
//        assertEquals("collect treasure", world.canCollectTreasure());
//    }

}
