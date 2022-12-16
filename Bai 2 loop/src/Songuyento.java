import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        int num=2;
        int count=0;
        while (count<20){
            boolean check=true;
            if(num<2){
                check=false;
            }else {
                for (int i = 2; i <num ; i++) {
                    if(num%i==0){
                        check=false;
                    }
                }
            }
            if(check==true){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }
    }
}
