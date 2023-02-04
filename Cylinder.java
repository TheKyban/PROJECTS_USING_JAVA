public class Cylinder {
    private int height;
    private int radius;
    public Cylinder(int height,int radius) { // Constructor
        this.height = height;
        this.radius =radius;
    }

    double Volume() {
        return Math.PI*radius*radius*height;
    }

    double SurfaceArea() {
        return 2*Math.PI*radius*(height+radius);
    }

    public static void main(String[] args) {
        Cylinder cc = new Cylinder(20,10);
        System.out.println(cc.Volume());
        System.out.println(cc.SurfaceArea());
    }
}
