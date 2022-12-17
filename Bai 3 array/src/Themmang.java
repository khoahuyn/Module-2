import java.util.Scanner;

public class Themmang {
    public static void main(String[] args) {
        int n;
        int index;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử:");
        n=sc.nextInt();
        int array[]=new int[n];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("Nhập phần tư thứ "+(i+1)+": ");
            array[i]=sc.nextInt();
        }
        System.out.print("Nhập phần tử cần thêm:");
        int x=sc.nextInt();
        System.out.print("Nhập vị trí cần chèm:");
        index =sc.nextInt();
        while (index<=1 || index>array.length){
            System.out.println("Không thể thêm vào:");
            System.out.print("Nhập vị trí cần chèm:");
            index =sc.nextInt();
        }

        for (int i =array.length-1; i >index ; i--) {
            array[i] = array[i + 1];
        }
        array[index]=x;
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
