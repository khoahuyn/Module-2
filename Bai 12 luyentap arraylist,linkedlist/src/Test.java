import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product sp1 = new Product("TV", "T01", 1000000);
        Product sp2 = new Product("LT", "L01", 20000000);

        productManager.add(sp1);
        productManager.add(sp2);
        productManager.display();
        productManager.edit();
        productManager.remove();
        productManager.search();
        productManager.display();
    }
}
