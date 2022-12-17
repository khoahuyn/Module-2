import java.util.Scanner;

public class Xoamang {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử:");
        n=sc.nextInt();
        int array[]=new int[n];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("Nhập phần tư thứ "+(i+1)+": ");
            array[i]=sc.nextInt();
        }
        System.out.println("Nhập phần tử cần xoá:");
        int x=sc.nextInt();
        for (int i = 0; i <array.length ; i++) {
            if(x==array[i]){
                for (int j = i; j <array.length-1 ; j++) {
                    array[i]=array[i+1];
                }
            }else {
                System.out.print(array[i] +" ");
            }
        }
    }
}
