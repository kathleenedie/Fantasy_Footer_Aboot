package tool;

public enum ToolType {

    SWORD("weapon", 8),
    AXE("weapon", 10),
    CLUB("weapon", 5),
    ROPE("weapon", 3),
    GAUNTLET("weapon", 1),
    FIREBALL("spell", 7),
    LIGHTNING("spell", 10),
    BOILS("spell", 5),
    FREEZE("spell", 3),
    POTION("heal", 10),
    HERB("heal", 6),
    PRAYER("heal", 2),
    POULTICE("heal", 4);

    private final String toolCategory;
    private final int points;

    ToolType(String toolCategory, int points) {
        this.toolCategory = toolCategory;
        this.points = points;
    }

    public String getToolCategory() {
        return toolCategory;
    }

    public int getPoints() {
        return points;
    }
}
