
import java.util.Scanner;

public class parameterized_method {
    public static void displayArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+ " ");   
        }

    }
    public static void main(String[] args) {
        System.out.println("printing array by using Parameterized Methods ");
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the "+ i + "val");
            arr[i] = sc.nextInt();
        }
        displayArray(arr);
    }
    
}
