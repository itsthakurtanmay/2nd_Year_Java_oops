import java.util.Scanner;

public class non_parameterized_Array_printing {
    public static void printingArrays(){
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
    public static void main(String[] args) {
        System.out.println("Printing array by using NON Parameterized Methods");
        printingArrays();
        
    }
    
}
