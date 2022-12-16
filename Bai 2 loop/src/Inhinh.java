import java.util.Scanner;

public class Inhinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.print("1.Print the rectangle\n");
        System.out.print("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n");
        System.out.print("3.Print isosceles triangle\n");
        System.out.print("4.Exit\n");
        Scanner sc=new Scanner(System.in);
        int number;
        do{
            System.out.println("Choose the number:");
            number=sc.nextInt();
            switch (number){
                case 1:
                    for (int i = 0; i <4 ; i++) {
                        for (int j = 0; j <8 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i <5 ; i++) {
                        for (int j = 0; j <i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    for(int i=4;i>=1;i--){
                        for(int j=1;j<=i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
            }
        }while (number!=4);
    }
}
