import core.Converter;
import core.ImageReader;

import java.io.IOException;
import java.io.PrintWriter;

public class Img2Ascii {

    public static void main(String[] args) {
        String inputPath = "silly_walk.png";
        String outputPath = "/home/leonamtv/Projetos/output.txt";
        PrintWriter out = null;
        ImageReader reader = new ImageReader(inputPath);
        Converter converter = null;
        try {
            converter = new Converter(reader.read());
            String result = converter.convert();
            out = new PrintWriter(outputPath);
            out.println(result);
        } catch ( IOException e ) {
            System.out.println(e.getMessage());
        }
    }

}
