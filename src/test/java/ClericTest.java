import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import tool.ToolType;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){

        cleric = new Cleric(20, "Pastor Noricii", 75, ToolType.POULTICE);
    }

    @Test
    public void hasPoints(){
        assertEquals(20, cleric.getPoints());
    }

    @Test
    public void hasToolType(){
        assertEquals(ToolType.POULTICE, cleric.getHealer());
    }


}
