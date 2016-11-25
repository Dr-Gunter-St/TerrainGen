package TerrainMatrixMaker;

public class MatrixPointCreator {
    static Point[][] terrain = new Point[1000][1000];

    public MatrixPointCreator() {
       for (int i = 0; i < 1000; i++){
           for (int j = 0; j < 1000; j++){
               terrain[i][j] = new Point();
           }
       }
    }

    public void generateTerrain(){

    }
}
