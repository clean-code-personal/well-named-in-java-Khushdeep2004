package colorcoder;

public enum MinorColor {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);

     public int index;
        MinorColor(int index) {
            this.index = index;
        }
        int getIndex() {
            return index;
        }
        public static MinorColor fromIndex(int index) {
            for(MinorColor color: MinorColor.values()) {
                if(color.getIndex() == index) {
                    return color;
                }
            }
            return null;
}
}
