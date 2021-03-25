package players;

import tool.ToolType;

public class Cleric extends Player{

    private ToolType healer;

    public Cleric(int points, String name, int age, ToolType healer) {
        super(points, name, age);
        this.healer = healer;
    }

    public ToolType getHealer() {
        return healer;
    }
}
