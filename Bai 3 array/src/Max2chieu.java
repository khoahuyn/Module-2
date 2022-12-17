import java.util.Scanner;

public class Max2chieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]array=new int[3][4];
        int max=array[0][0];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print("Nhập phần tử tại vị trí "+i+" và "+j+":");
                array[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là:" +max);
    }
}
