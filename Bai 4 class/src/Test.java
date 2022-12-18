import java.util.Scanner;

class QuadraticEquation{
    private double a,b,c;
    double denta,r1,r2;
    QuadraticEquation(){}
    QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return denta=b*b-4*a*c;
    }
    public double  getRoot1(){
        return r1=(-b+Math.sqrt(denta))/(2*a);
    }
    public double  getRoot2(){
        return r2=(-b-Math.sqrt(denta))/(2*a);
    }
    public void result(){
        if(getDiscriminant()>=0){
            System.out.println("The equals has two roots"+getRoot1()+" and "+getRoot2());
        }else {
            System.out.println("The equals has no root");
        }
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ba so a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        QuadraticEquation test=new QuadraticEquation(a,b,c);
        test.result();
    }
}
