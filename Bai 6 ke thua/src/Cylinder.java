class Circle {
    public double r;
    public String color;

    public Circle() {
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area ()

    {
        return this.getR() * this.getR() * 3.14;

    }

    public String toString() {
        return "Ban kinh:" + getR() + " Mau:" + getColor() + " Dien tich: " + area();
    }
}

public class Cylinder extends Circle {
    public double h;

    public Cylinder() {
    }

    public Cylinder(double r, String color, double h) {
        super(r, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double area(){
        return super.area()*this.getH();
    }
    public String toString() {
        return super.toString() + " Chieu cao:" + getH() +" The tich: "+area();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        Cylinder cylinder=new Cylinder(4,"Blue",7);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
