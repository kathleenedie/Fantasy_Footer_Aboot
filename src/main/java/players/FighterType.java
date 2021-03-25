package players;

public enum FighterType {

    DWARF("stabber"),
    BARBARIAN("club"),
    KNIGHT("joist");

    private final String fightingStyle;

    FighterType(String style){
        this.fightingStyle = style;
    }

    public String getFightingStyle() {
        return fightingStyle;
    }
}
