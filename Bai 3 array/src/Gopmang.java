import java.util.Scanner;

public class Gopmang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr1=new int[3];
        int []arr2=new int[4];
        int []arr3=new int[arr1.length+arr2.length];
        System.out.println("Mảng 1:");
        for (int i = 0; i <arr1.length; i++) {
            System.out.print("Nhập phần tư thứ "+(i+1)+": ");
            arr1[i]=sc.nextInt();
        }
        System.out.println("Mảng 2:");
        for (int i = 0; i <arr2.length; i++) {
            System.out.print("Nhập phần tư thứ "+(i+1)+": ");
            arr2[i]=sc.nextInt();
        }
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = 0; j <arr2.length ; j++) {
            arr3[j+arr1.length]=arr2[j];
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
