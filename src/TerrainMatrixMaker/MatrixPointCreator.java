package TerrainMatrixMaker;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class MatrixPointCreator {
    private static int rows = 1000;
    private static int columns = 2000;
    static Point[][] terrain = new Point[rows][columns];

    public MatrixPointCreator() {
       for (int i = 0; i < 1000; i++){
           for (int j = 0; j < 2000; j++){
               double depth = 0;

               terrain[i][j] = new Point ((double) ((i+1)/(rows/10)), (double) ((j+1)/(columns/10)), (Math.sin((double) (j+1/columns)))* Math.sin((double) (i+1/rows)));

           }
       }
    }

    public void importInFile(){

        Path file = FileSystems.getDefault().getPath("C:/Users/Влад/IdeaProjects/lab.txt");

        Charset charset = Charset.forName("US-ASCII");
        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
        for (Point[] pArr: terrain){
            for (Point point: pArr){
                writer.write(point.toString(), 0, point.toString().length());
            }
        }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }

}
