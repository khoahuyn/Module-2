class Circle{
    private double radius=1.0;
    private String color="red";

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        double area=getRadius()*getRadius()*3.14;
        return area;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle a=new Circle();
        System.out.println(a.getRadius());
        System.out.println(a.getArea());
    }
}
