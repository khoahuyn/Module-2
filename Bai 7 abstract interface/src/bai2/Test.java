package bai2;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"Red",false);
        shapes[1] = new Rectangle(7,8,"Yellow",true);
        shapes[2] = new Square("Brown",true,8);

        for (Shape s : shapes) {
            System.out.print(s);
            if (s instanceof Colorable) {
                s.howToColor();
            }
            System.out.println("");
        }
    }
}
