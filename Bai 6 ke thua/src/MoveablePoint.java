class Point {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float array[] = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point{" + " X: " + this.getX() + " Y: " + this.getY() + "}";
    }
}
public class MoveablePoint extends Point {
    public float xSpeed=0.0f;
    public float ySpeed=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float array[] = new float[2];
        array[0] = xSpeed;
        array[1] = ySpeed;
        return array;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return super.toString() + " MoveablePoint{" + " XSpeed: " + this.getxSpeed() + " YSpeed"+this.getySpeed()+"}";
    }

    public MoveablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }

    public static void main(String[] args) {
        Point two = new Point(2, 3);
        MoveablePoint moveable = new MoveablePoint(9,6,4, 5);
        System.out.println(two);
        System.out.println(moveable);
        System.out.println(moveable.move());
    }
}
