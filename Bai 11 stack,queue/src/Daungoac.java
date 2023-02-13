import java.util.Scanner;
import java.util.Stack;
public class Daungoac {
    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println("Nhap chuoi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == ')' && !stack.isEmpty()){
                stack.pop();
            }else if(str.charAt(i) == ')' && stack.isEmpty()){
                stack.push(str.charAt(i));
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
