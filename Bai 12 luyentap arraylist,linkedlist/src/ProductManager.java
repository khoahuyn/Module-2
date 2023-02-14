import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product>list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void add(Product product){
        list.add(product);
    }

    public void edit(){
        String id=sc.nextLine();
        for (int i = 0; i <list.size() ; i++) {
            if(id.equalsIgnoreCase(list.get(i).getId())){
                System.out.print("Nhập id mới:");
                list.get(i).setId(sc.nextLine());
                System.out.print("Nhập name mới:");
                list.get(i).setName(sc.nextLine());
                System.out.print("Nhập cost mới:");
                list.get(i).setCost(Double.parseDouble(sc.nextLine()));
                break;
            }
        }
    }
    public void remove() {
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getId())) {
                list.remove(i);
                break;
            }
        }
    }

    public void search() {
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                System.out.println(list.get(i).toString());
                break;
            }
        }
    }

    public void display() {
        for (Product product : list) {
            System.out.println(product);
        }
    }


}
