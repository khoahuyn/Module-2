import java.util.Scanner;
import java.util.Stack;
public class Nhiphan {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so can doi:");
        int thapPhan=Integer.parseInt(sc.nextLine());
        int dtnp=thapPhan;
        int dem=0;
        while(dtnp>0){
            int nhiPhan=dtnp%2;
            dem++;
            dtnp=dtnp/2;
            stack.push(nhiPhan);
        }
        String str=new String();
        for (int i = 0; i <dem ; i++) {
            str= String.format("%s%s", str, stack.pop());
        }
        System.out.println("ket qua la: "+str);
    }
}
