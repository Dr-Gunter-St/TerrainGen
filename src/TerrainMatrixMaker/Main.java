package TerrainMatrixMaker;

public class Main {

    public static void main(String[] args) {
        MatrixPointCreator matrixPointCreator = new MatrixPointCreator();

        matrixPointCreator.importInFile();

        TerrainGetter terrainGetter = new TerrainGetter();

        System.out.println( MatrixPointCreator.getTerrain()[10][5].toString());
        System.out.println( terrainGetter.getTerrain()[10][5].toString());

    }
}
