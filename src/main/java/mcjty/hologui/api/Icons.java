package mcjty.hologui.api;

// Predefined icons
public enum Icons {
    WHITE_PLAYER(128+64, 128),
    GRAY_ARROW_DOWN(128, 128-16),
    WHITE_ARROW_DOWN(128+16, 128-16),
    GRAY_ARROW_UP(128+32, 128-16),
    WHITE_ARROW_UP(128+48, 128-16),
    GRAY_ARROW_RIGHT(128, 128),
    WHITE_ARROW_RIGHT(128+16, 128),
    GRAY_ARROW_LEFT(128+32, 128),
    WHITE_ARROW_LEFT(128+48, 128),
    GRAY_DOUBLE_ARROW_RIGHT(128, 128+16),
    WHITE_DOUBLE_ARROW_RIGHT(128+16, 128+16),
    GRAY_DOUBLE_ARROW_LEFT(128+32, 128+16),
    WHITE_DOUBLE_ARROW_LEFT(128+48, 128+16),
    FADED_RED_BALL(128+80, 128),
    RED_BALL(128+96, 128),
    FADED_QUESTION_MARK(128+64, 128-16),
    QUESTION_MARK(128+80, 128-16),
    FADED_NAVIGATE_BACK(128+96, 128-16),
    NAVIGATE_BACK(128+112, 128-16),
    GREEN_CHECK(128+64, 128+16),
    GRAY_CROSS(128+80, 128+16),
    RED_CROSS(128+96, 128+16),
    REDSTONE_DUST(128, 128+32),
    REDSTONE_OFF(128+16, 128+32),
    REDSTONE_ON(128+32, 128+32),
    BLUE_EMPTY_BUTTON(128+48, 128+32),
    BLUE_1_BUTTON(128+64, 128+32),
    BLUE_2_BUTTON(128+80, 128+32),
    BLUE_3_BUTTON(128+96, 128+32),
    BLUE_4_BUTTON(128+112, 128+32),
    NBT_OFF(128-32, 128-16),
    NBT_ON(128-16, 128-16),
    DAM_OFF(128-32, 128),
    DAM_ON(128-16, 128),
    ORE_OFF(128-32, 128+16),
    ORE_ON(128-16, 128+16),
    BOX_OFF(128-32, 128+32),
    BOX_ON(128-16, 128+32),
    ITEMFLOW_OFF(128-32, 128+48),
    ITEMFLOW_ON(128-16, 128+48),
    COLOR_WHITE(0, 128),
    COLOR_ORANGE(16, 128),
    COLOR_MAGENTA(32, 128),
    COLOR_LIGHT_BLUE(48, 128),
    COLOR_YELLOW(0, 128+16),
    COLOR_LIME(16, 128+16),
    COLOR_PINK(32, 128+16),
    COLOR_GRAY(48, 128+16),
    COLOR_SILVER(0, 128+32),
    COLOR_CYAN(16, 128+32),
    COLOR_PURPLE(32, 128+32),
    COLOR_BLUE(48, 128+32),
    COLOR_BROWN(0, 128+48),
    COLOR_GREEN(16, 128+48),
    COLOR_RED(32, 128+48),
    COLOR_BLACK(48, 128+48),
    NOT_COLOR_WHITE(0, 128+64),
    NOT_COLOR_ORANGE(16, 128+64),
    NOT_COLOR_MAGENTA(32, 128+64),
    NOT_COLOR_LIGHT_BLUE(48, 128+64),
    NOT_COLOR_YELLOW(0, 128+80),
    NOT_COLOR_LIME(16, 128+80),
    NOT_COLOR_PINK(32, 128+80),
    NOT_COLOR_GRAY(48, 128+80),
    NOT_COLOR_SILVER(0, 128+96),
    NOT_COLOR_CYAN(16, 128+96),
    NOT_COLOR_PURPLE(32, 128+96),
    NOT_COLOR_BLUE(48, 128+96),
    NOT_COLOR_BROWN(0, 128+112),
    NOT_COLOR_GREEN(16, 128+112),
    NOT_COLOR_RED(32, 128+112),
    NOT_COLOR_BLACK(48, 128+112),
    ;

    private final int u;
    private final int v;

    Icons(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public int getU() {
        return u;
    }

    public int getV() {
        return v;
    }
}
