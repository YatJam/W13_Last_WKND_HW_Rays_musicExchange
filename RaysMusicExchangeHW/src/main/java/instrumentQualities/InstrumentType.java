package instrumentQualities;

public enum InstrumentType {
    WIND("wind"),
    KEYBOARD("keyboard"),
    STRING("string"),
    BRASS("brass"),
    PERCUSSION("percussion");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
