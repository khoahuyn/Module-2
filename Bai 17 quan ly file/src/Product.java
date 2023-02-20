import java.io.Serializable;
import java.util.Scanner;

public class Product implements Comparable<Product>, Serializable {
    private static final long serialVersionUID = 1L;
    public int id;
    public String name;
    public String company;
    public float cost;
    public String otherInfor;

    public Product(){}

    public Product(int id, String name, String company, float cost, String otherInfor) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.cost = cost;
        this.otherInfor = otherInfor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getOtherInfor() {
        return otherInfor;
    }

    public void setOtherInfor(String otherInfor) {
        this.otherInfor = otherInfor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", cost=" + cost +
                ", otherInfor='" + otherInfor + '\''+
                '}';
    }


    public String toFile(){
        return id + " ," + name +" ," + company +" ,"+ cost +" ," + otherInfor;
    }


    @Override
    public int compareTo(Product o) {
        return 0;
    }


}
