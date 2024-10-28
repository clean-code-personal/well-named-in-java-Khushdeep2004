package colorcoder;

public class ColorPair {
    public MajorColor majorColor;
    public MinorColor minorColor;

    ColorPair(MajorColor major, MinorColor minor) {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }


     String ToString() {
            String colorPairStr = ColorConstants.MajorColorNames[majorColor.getIndex()];
            colorPairStr += " ";
            colorPairStr += ColorConstants.MinorColorNames[minorColor.getIndex()];
            return colorPairStr;
        }
}
