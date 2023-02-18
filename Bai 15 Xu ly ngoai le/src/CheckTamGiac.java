
import java.util.Scanner;
public class CheckTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CheckExeption  triangleExeption=new CheckExeption();
        try {
            System.out.println("Nhập vào 3 cạnh của tam giac:");
            Double a=sc.nextDouble();
            Double b=sc.nextDouble();
            Double c=sc.nextDouble();
            try{
                triangleExeption.CheckRetangle(a,b,c);
            }catch (TriangleExeption ex){
                System.out.println(ex.getMessage());
            }
        }catch (Exception e){
            System.out.println("Sai hinh dang hinh");
        }
        sc.close();
    }
}
