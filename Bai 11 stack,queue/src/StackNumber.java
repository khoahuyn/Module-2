import java.util.Scanner;
import java.util.Stack;

public class StackNumber {
    public static void main(String[] args) {
        /*Stack<Integer> stack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i;
            stack.push(arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=  stack.pop();
            System.out.println(arr[i]);
        }*/



        Stack<String> wStack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String str="Dang Khoa";
        String[] mWord=str.split(" ");
        System.out.println("Mang ban dau: ");
        for (int i = 0; i < mWord.length; i++) {
            System.out.print(mWord[i] + ", ");
        }

        for (int i = 0; i <mWord.length ; i++) {
            wStack.push(mWord[i]);
        }
        System.out.println("\nMang sau khi dao nguoc: ");
        while (!wStack.isEmpty())
        {
            System.out.print(wStack.pop() + ", ");
        }





    }

}
