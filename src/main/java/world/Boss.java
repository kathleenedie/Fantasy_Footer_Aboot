package world;

import tool.ToolType;

public class Boss {

    private String name;
    private ToolType vulnerability;

    public Boss(String name, ToolType vulnerability) {
        this.name = name;
        this.vulnerability = vulnerability;
    }

    public String getName() {
        return name;
    }

    public ToolType getVulnerability() {
        return vulnerability;
    }
}
