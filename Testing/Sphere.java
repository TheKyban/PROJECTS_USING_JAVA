package Testing;
public class Sphere {
    private int radius;
    public Sphere(int radius) {
        this.radius = radius;
    }

    double Volume() {
        return (4*Math.PI*Math.pow(radius, 3))/3;
    }
    double SurfaceArea() {
        return 4*Math.PI*Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        Sphere ss = new Sphere(4);
        System.out.println(ss.Volume());
        System.out.println(ss.SurfaceArea());
    }
}
