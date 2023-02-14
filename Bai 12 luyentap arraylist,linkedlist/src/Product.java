

import java.util.Scanner;

public class Product {
    private String id,name;
    private double cost;

    public Product(){

    }

    public Product(String id, String name, float cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString(){
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cost=" + cost +
                '}';
    }

}
