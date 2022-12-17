import java.util.Scanner;

public class Sum1cot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]array=new int[3][3];
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print("Nhập phần tử tại vị trí "+i+" và "+j+":");
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Nhập cột cần tính:");
        int cot=sc.nextInt();
        for (int i = 0; i <3 ; i++) {
                sum+=array[i][cot];
        }
        System.out.println("Tổng cột "+cot +" là :"+sum);
    }
}
