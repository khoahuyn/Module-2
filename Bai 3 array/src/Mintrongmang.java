import java.util.Scanner;

public class Mintrongmang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array=new int[4];
        for (int i = 0; i <array.length ; i++) {
                System.out.print("Nhập phần tử tại vị trí "+(i+1)+":");
                array[i]=sc.nextInt();
        }
        int min=array[0];
        for (int i = 0; i <3 ; i++) {
                if(array[i]<min) {
                    min = array[i];
                }
        }
        System.out.println("Phần tử nhỏ nhất là:" +min);
    }
}
