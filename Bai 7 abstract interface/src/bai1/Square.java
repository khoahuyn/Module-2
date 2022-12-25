package bai1;

public class Square extends Shape {
    private double edge = 1.0;


    public Square() {
    }

    public Square( double edge) {
        this.edge = edge;

    }

    public Square(String color, boolean filled,  double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }


    double getArea(){
        return this.edge*this.edge;
    }
    @Override
    public String toString() {
        return "A bai1.Square with edge="
                + getEdge()
                + ", which is a subclass of "
                + super.toString()
                +" , Area: "+this.getArea();
    }

    @Override
    public void resize(double percent) {
        double incresea=this.edge*percent;
        this.setEdge(incresea);
    }
}
