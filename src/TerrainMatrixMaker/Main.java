package TerrainMatrixMaker;

public class Main {

    public static void main(String[] args) {
        MatrixPointCreator matrixPointCreator = new MatrixPointCreator();

        System.out.println(matrixPointCreator.terrain[100][30].getX());
        System.out.println(matrixPointCreator.terrain[100][30].getZ());
        System.out.println(matrixPointCreator.terrain[100][30].getDepth());


    }
}
