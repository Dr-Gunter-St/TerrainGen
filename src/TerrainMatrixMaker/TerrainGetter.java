package TerrainMatrixMaker;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class TerrainGetter {
    private static final double rows = 124; //1000
    private static final double columns = 124; //2000
    static Point[][] terrain = new Point[(int)rows][(int)columns];

    private class IndexSet{
        int indexes[];
        public IndexSet(){

            for (int i = 0; i < 118206; i++){
                indexes[i] = 0;
            }

        }
    }

    public TerrainGetter(){

        int row = 0;
        int column = 0;
        Path file = FileSystems.getDefault().getPath("C:/Users/Влад/IdeaProjects/lab.txt");
        Charset charset = Charset.forName("US-ASCII");

        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                Point point = new Point(line);
                terrain[row][column] = point;
                column++;
                if (column > columns - 1){column = 0; row++; }

            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public static Point[][] getTerrain() {
        return terrain;
    }
}
