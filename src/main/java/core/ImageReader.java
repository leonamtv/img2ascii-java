package core;

import com.google.common.io.Resources;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImageReader {

    private String path;

    public ImageReader ( String path ) {
        this.path = path;
    }

    public BufferedImage read () throws IOException {
        final InputStream resource = Resources.getResource(this.path).openStream();
        final BufferedImage image = ImageIO.read(resource);
        return image;
    }

}
