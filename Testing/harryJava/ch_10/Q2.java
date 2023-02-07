package Testing.harryJava.ch_10;
class Rectangle{
    public int l , w;
    Rectangle(int l, int w) {
        this.l=l;
        this.w=w;
    }
    double Area() {
        return w*l;
    }
}

class Cuboid extends Rectangle{
    public int h;
    Cuboid(int l,int w , int h) {
        super(l,w);
        this.h = h;
    }
    @Override
    double Area() {
        return 2*((l*w)+(w*h) + (h*l));
    }

    double Volume() {
        return l*w*h;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 2);
        System.out.println(rc.Area());
        Cuboid co = new Cuboid(2, 2, 2);
        System.out.println(co.Area());
        System.out.println(co.Volume());
    }
}
