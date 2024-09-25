
import java.util.Arrays;
import java.util.Scanner;

public class merge2sortedArray {
    public static void merge2sortArr(int []arr,int []num){
        int n = arr.length;
        int m = num.length;
        int x = n+m;
        int []temp = new int[x];
        for(int i = 0;i<n;i++){
            temp[i] = arr[i];
        }
        int count = 0;
        for(int i = n;i<x;i++){
            temp[i] = num[count];
            count++;
        }
        System.out.println();
        System.out.println("Printing merged array before sorting");
        for(int i = 0;i<x;i++){
            System.out.print(temp[i]+" ");
        }
        Arrays.sort(temp);
        System.out.println();
        System.out.println("Printing merged array after sorting");
        for(int i = 0;i<x;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of first Array  : " );
        int n = sc.nextInt();
        
        System.out.println("Enter the size of second Array  : " );
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the value of first Array's "+ i +" index");
            arr[i] = sc.nextInt();
        }
        int []num = new int[m];
        for(int i = 0;i<m;i++){
            System.out.println("Enter the value of second Array's "+ i +" index");
            num[i] = sc.nextInt();
        }

        System.out.println("parameterized method ");
        merge2sortArr(arr,num);

        // System.out.println("Printing array");
        // for(int i = 0;i<n;i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println();
        // System.out.println("printing the second array : ");
        // for(int i = 0;i<m;i++){
        //     System.out.print(arr[i]+ " ");
        // }
    }
    
}
