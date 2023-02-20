import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product>list=new ArrayList<>();
        list.add(new Product(12,"Tv","Japan",500f,"Good"));
        list.add(new Product(34,"Mt","German",750f,"Good"));
        list.add(new Product(56,"Dt","Italy",420f,"Normal"));
        String path=".\\src\\product.dat";
        Operation.writeToFile(".\\src\\product.dat",list);
        Operation.readFromFile(path).forEach(System.out::println);
    }
}
