public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] xyz = {super.getX(), super.getY(), this.z};
        return xyz;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public String toString() {
        return "Point3D[" + super.getX() + ", " + super.getY()+ "," + getZ() + "]";
    }
}