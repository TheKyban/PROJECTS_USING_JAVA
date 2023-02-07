package Testing.harryJava.ch_10;
class Circle {
    public int r;
    Circle (int r) {
        this.r = r;
    }
    double Area() {
        return Math.PI*this.r*this.r;
    }
}
class Cylinder extends Circle {
    public int h;
    Cylinder(int r,int h) {
        super(r);
        this.h = h;
    }
    @Override
    double Area() {
        return Math.PI*r*(h+r);
    }

    double Volume() {
        return Math.PI*r*r*h;
    }
}
public class Q1 {
    public static void main(String[] args) {
        // Circle circle = new Circle(2);
        // System.out.println(circle.Area());
        Cylinder cylinder = new Cylinder(2, 4);
        System.out.println(cylinder.Area());
        System.out.println(cylinder.Volume());
    }
}
