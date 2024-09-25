
import java.util.Scanner;

public class printingArrayUsingLoops {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size = sc.nextInt();
        int[]arr = new int[size];

        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of "+ i + " index");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array's element be : ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}
