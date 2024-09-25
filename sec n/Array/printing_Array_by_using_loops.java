
import java.util.Scanner;

public class printing_Array_by_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of Array : ");
        size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of "+ i + " index");
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the Array : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
