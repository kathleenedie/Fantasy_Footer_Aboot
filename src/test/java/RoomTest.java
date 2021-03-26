import org.junit.Before;
import org.junit.Test;
import tool.ToolType;
import world.Boss;
import world.Room;
import world.Treasure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RoomTest {

    private Treasure treasure1;
    private Treasure treasure2;
    private Boss boss1;
    private Boss boss2;
    private Room room1;
    private Room room2;

    @Before
    public void before(){
        treasure1 = new Treasure("gem", 10);
        treasure2 = new Treasure("gold", 30);
        boss1 = new Boss("Boorish Basil", ToolType.AXE);
        boss2 = new Boss("Surly Sharon", ToolType.POTION);
        room1 = new Room("Vault", treasure1, boss1);
        room2 = new Room("Dungeon", treasure2, boss2);
    }

    @Test
    public void getTreasure() {
        assertNotNull(room1.getTreasure());
    }

    @Test
    public void hasBoss() {
        assertNotNull(room2.getBoss());
    }

    @Test
    public void bossHasToolVulnerablity(){
        assertEquals(ToolType.POTION, boss2.getVulnerability());
    }
}
