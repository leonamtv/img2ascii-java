package core;

import java.awt.image.BufferedImage;

public class Converter {

    private final char LINE_BREAK = '\n';

    private BufferedImage image;

    public Converter (BufferedImage image) {
        this.image = image;
    }

    public String convert () {
        StringBuilder sbConvertedImage = new StringBuilder();
        for ( int y = 0; y < this.image.getHeight(); y++ ) {
            for ( int x = 0; x < this.image.getWidth(); x++ ) {
                final int clr = image.getRGB(x, y);
                final int red = this.getRed(clr);
                final int green = this.getGreen(clr);
                final int blue = this.getBlue(clr);
                final int brightness = this.normalizeBrightness(this.getBrightness(red, green, blue));
                sbConvertedImage.append(Ascii.brightnessToAscii(brightness));
                sbConvertedImage.append(' ');
            }
            sbConvertedImage.append(LINE_BREAK);
        }
        return sbConvertedImage.toString();
    }

    private int getRed ( int clr ) {
        return (clr & 0x00ff0000) >> 16;
    }

    private int getGreen ( int clr ) {
        return (clr & 0x0000ff00) >> 8;
    }

    private int getBlue ( int clr ) {
        return clr & 0x000000ff;
    }

    private int normalizeBrightness ( double brightness ) {
        return (int) Math.round(brightness);
    }

    private double getBrightness ( int r, int g, int b ) {
        return ( 0.2126*r + 0.7152*g + 0.0722*b );
    }

}
