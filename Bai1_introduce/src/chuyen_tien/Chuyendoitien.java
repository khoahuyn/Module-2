package chuyen_tien;

import java.util.Scanner;

public class Chuyendoitien {
    public static void main(String[] args) {
        System.out.println("Nhập vào số tiền cần đổi:");
        Scanner sc=new Scanner(System.in);
        int tien=sc.nextInt();
        int dong=tien*23000;
        System.out.println("Số tiền việt quy đổi là:" +dong);
    }
}
