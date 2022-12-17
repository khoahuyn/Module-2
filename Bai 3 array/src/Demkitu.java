import java.util.Scanner;

public class Demkitu {
    public static void main(String[] args) {
        int count=0;
        String name="Linhanh";
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào kí tự k cần đếm:");
        k=sc.next().charAt(0);
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i)==k){
                count++;
            }
        }

        System.out.println("Kí tự "+'k'+" có "+count+" trong chuỗi ");
    }
}
