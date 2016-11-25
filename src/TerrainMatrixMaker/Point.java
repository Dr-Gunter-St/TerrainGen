package TerrainMatrixMaker;

public class Point {
    private double x; // Obviously x coordinate
    private double z; // Generally meant y coordinate
    private double depth; //  or height

    public Point(double x, double z, double depth) {
        this.x = x;
        this.z = z;
        this.depth = depth;
    }

    public Point() {
        this.x = 0.0;
        this.z = 0.0;
        this.depth = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
