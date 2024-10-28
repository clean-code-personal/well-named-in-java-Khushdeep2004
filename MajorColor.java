package colorcoder;

public enum MajorColor implements Color {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);

    private int index;

    MajorColor(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    public static MajorColor fromIndex(int index) {
        return Color.fromIndex(index, MajorColor.values());
    }
}
