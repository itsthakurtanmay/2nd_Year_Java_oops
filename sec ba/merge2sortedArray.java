
import java.util.*;

/**
 * merge2sortedArray
 */
public class merge2sortedArray {
    public static void mergeTwoSortedArray(int []arr,int num[]){
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
        Arrays.sort(temp);
        System.out.println();

        System.out.println("Printing array after merge");
        for(int i = 0;i<x;i++){
            System.out.print(temp[i]);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of first Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the size of Second Array");
        int m = s.nextInt();
        int num[] = new int[m];

        for(int i = 0;i<n;i++){
            System.out.println("Enter the value of first Array's "+ i + " index ");
            arr[i] = s.nextInt();
        }

        for(int i = 0;i<m;i++){
            System.out.println("Enter the value of 2nd array's "+ i + " index ");
            num[i] = s.nextInt();
        }

        

        System.out.println("printing first array ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("printing second array ");
        for(int i = 0;i<m;i++){
            System.out.print(num[i]+ " ");
        }

        System.out.println("Now we are calling method of merging 2 array ");
        mergeTwoSortedArray(arr,num);
    }
}