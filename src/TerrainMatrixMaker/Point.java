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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;
        if (Double.compare(point.z, z) != 0) return false;
        return Double.compare(point.depth, depth) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Point() {
        this.x = 0.0;
        this.z = 0.0;
        this.depth = 0.0;
    }

    public Point(String str) throws NullPointerException{
        String[] coord = str.split(";");
        this.x = Double.parseDouble(coord[0]);
        this.z = Double.parseDouble(coord[1]);
        this.depth = Double.parseDouble(coord[2]);
    }

    @Override
    public String toString() {
        return "" +
                x + ";" +
                z + ";" +
                depth + "\n";
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
