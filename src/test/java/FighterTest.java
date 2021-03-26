import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Fighter;
import players.FighterType;
import tool.ToolType;

import static org.junit.Assert.assertEquals;

public class FighterTest {


    Fighter dwarf;
    Fighter barbarian;
    Fighter knight;

    @Before
    public void before(){

        dwarf = new Fighter(40, "Derek", 102, FighterType.DWARF,ToolType.CLUB);
        barbarian = new Fighter(25, "Boris", 40, FighterType.BARBARIAN, ToolType.AXE);
        knight = new Fighter(60, "Keith", 22, FighterType.KNIGHT, ToolType.SWORD);
    }

    @Test
    public void hasPoints(){
        assertEquals(40, dwarf.getPoints());
    }

    @Test
    public void hasToolType(){
        assertEquals(ToolType.AXE, barbarian.getWeapon());
    }

    @Test
    public void hasFighterType(){
        assertEquals(FighterType.KNIGHT, knight.getType());
    }

    @Test
    public void hasName(){
        assertEquals("Boris", barbarian.getName());
    }
}
