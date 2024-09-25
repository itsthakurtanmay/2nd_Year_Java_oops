import java.util.Scanner;

public class printingArray_by_using_methods {
    public static void printingArrays(int []arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter the value of "+ i + " index");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array's element be : ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        System.out.println("printing array by using methods ");
        int arr[] = new int[5];
        printingArrays(arr);
        
    }
}
