import java.util.Arrays;
import java.util.Scanner;
public class MinhHoaThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        sapXepChen(arr);
        System.out.println("Begin sorting...");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


        public static void sapXepChen ( int arr[]){
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
}
