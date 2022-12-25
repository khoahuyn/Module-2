package bai1;

import bai1.Circle;
import bai1.Rectangle;
import bai1.Shape;

public class Test {
    public static void main(String[] args) {
        Shape a[]=new Shape[3];
        a[0]=new Rectangle(7,8);
        a[1]=new Circle(5);
        a[2]=new Square(4);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("After increase");
        a[0].resize(10);
        a[1].resize(9);
        a[2].resize(12);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
