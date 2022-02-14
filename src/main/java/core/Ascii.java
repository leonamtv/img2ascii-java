package core;

public class Ascii {

    private static final String colorScale = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'.";

    public static char brightnessToAscii ( int brightness ) {
        int index = MathUtil.map(brightness, 0, 255, 0, colorScale.length() - 1);
        return colorScale.charAt(index);
    }

}

