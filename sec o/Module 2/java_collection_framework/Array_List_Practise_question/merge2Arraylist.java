
import java.util.ArrayList;
import java.util.Scanner;

public class merge2Arraylist {
    public static void merge2aArrayLists(ArrayList<Integer>a1,ArrayList<Integer>a2){
        a1.addAll(a2);
        System.out.println(a1);

    }
    public static void main(String[] args) {
        ArrayList<Integer>a1 = new ArrayList<>();
        ArrayList<Integer>a2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of A1");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("Enter the "+ i + " value of A1 ArrayList");
            int x = sc.nextInt();
            a1.add(x);
        }
        System.out.println("Enter the size of A2");
        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            System.out.println("Enter the "+ i + " value of A1 ArrayList");
            int x = sc.nextInt();
            a2.add(x);
        }

        merge2aArrayLists(a1,a2);

        // System.out.println("Printing arrayList1 ");
        // for(int i = 0;i<a1.size();i++){
        //     System.out.println(a1.get(i));
        // }
        // System.out.println("Printing arrayList2 ");
        // for(int i = 0;i<a2.size();i++){
        //     System.out.println(a2.get(i));
        // }
        
    }
    
}
