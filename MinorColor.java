package colorcoder;

public enum MinorColor implements Color {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);

    private int index;

    MinorColor(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    public static MinorColor fromIndex(int index) {
        return Color.fromIndex(index, MinorColor.values());
    }
}
