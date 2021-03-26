import org.junit.Before;
import org.junit.Test;
import players.Sourcerer;
import players.SourcererType;
import tool.ToolType;

import static org.junit.Assert.assertEquals;

public class SourcerTest {

    private Sourcerer warlock;
    private Sourcerer wizard;

    @Before
    public void before(){
        warlock = new Sourcerer(50, "Wally", 250, SourcererType.WARLOCK, "dragon", ToolType.FIREBALL);
        wizard = new Sourcerer(10, "Willy", 110, SourcererType.WIZARD, "Gnome", ToolType.FREEZE);
    }

    @Test
    public void getMythicalCreature() {
        assertEquals("dragon", warlock.getMythicalCreature());
    }

    @Test
    public void getSourcererType() {
        assertEquals(SourcererType.WIZARD, wizard.getType());
    }
}
