package players;

public class Sourcerer extends Player{

    private SourcererType type;
    private String mythicalCreature;
    private ToolType spell;

    public Sourcerer(int points, String name, int age, SourcererType type, String mythicalCreature, ToolType spell) {
        super(points, name, age);
        this.type = type;
        this.mythicalCreature = mythicalCreature;
        this.spell = spell;
    }

    public String getMythicalCreature() {
        return mythicalCreature;
    }

    public ToolType getSpell() {
        return spell;
    }

    public SourcererType getType() {
        return type;
    }
}
