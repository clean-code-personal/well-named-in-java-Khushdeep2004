package colorcoder;

public class ColorPairUtils {

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / MinorColor.values().length);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % MinorColor.values().length);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
    }
     public static String getColorCodeManual() {
        StringBuilder manual = new StringBuilder();
        int pairNumber = 1;
        for (MajorColor major : MajorColor.values()) {
            for (MinorColor minor : MinorColor.values()) {
                manual.append(String.format("Pair Number %d: %s\n", pairNumber, new ColorPair(major, minor).toString()));
                pairNumber++;
            }
        }
        return manual.toString();
    }
}
