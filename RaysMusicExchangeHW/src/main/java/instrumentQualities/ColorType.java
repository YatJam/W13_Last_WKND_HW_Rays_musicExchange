package instrumentQualities;

public enum ColorType {
    LIGHTBROWN("light brown"),
    MIDBROWN("mid brown"),
    DARKBROWN("dark brown"),
    RUBYRED("ruby red"),
    ELECTRICBLUE("electric blue"),
    TITAINIUMWHITE("titainium white"),
    LAMPBLACK("lamp black");

    private final String type;

    ColorType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
