package players;

import tool.ToolType;

public class Fighter extends Player{

    private FighterType type;
    private ToolType weapon;

    public Fighter(int points, String name, int age, FighterType type, ToolType weapon) {
        super(points, name, age);
        this.type = type;
        this.weapon = weapon;
    }

    public ToolType getWeapon() {
        return weapon;
    }

    public FighterType getType() {
        return type;
    }
}
