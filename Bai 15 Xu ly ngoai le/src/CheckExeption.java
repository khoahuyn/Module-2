public class CheckExeption {
    public void CheckRetangle(double a,double b,double c) throws TriangleExeption{
        if(a+b<=c|| a+c<=b || b+c<= a){
            throw new TriangleExeption("Sai hinh dang hinh");
        }else {
            System.out.println("Hinh hơp le");
        }
    }
}
