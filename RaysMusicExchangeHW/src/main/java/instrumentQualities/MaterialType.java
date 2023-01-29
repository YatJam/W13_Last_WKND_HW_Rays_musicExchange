package instrumentQualities;

public enum MaterialType {
    WOOD("wood"),
    BRASS("brass"),
    GOLD("gold");

    private String type;

    MaterialType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
