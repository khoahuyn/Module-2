class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float array[] = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point2D{" + " X: " + this.getX() + " Y: " + this.getY() + "}";
    }
}

public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float array[] = new float[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return super.toString() + "Point3D{" + " Z: " + this.getZ() + "}";
    }

    public static void main(String[] args) {
        Point2D twod = new Point2D(2, 3);
        Point3D threed = new Point3D(4, 5, 7);
        System.out.println(twod);
        System.out.println(threed);
    }
}
