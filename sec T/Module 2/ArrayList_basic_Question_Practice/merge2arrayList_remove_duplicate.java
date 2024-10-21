import java.util.ArrayList;
import java.util.Scanner;

public class merge2arrayList_remove_duplicate {

    public static ArrayList<Integer> merge2array_removeDup(ArrayList<Integer>a1,ArrayList<Integer>a1){

    }
    public static void main(String[] args) {
        ArrayList<Integer>a1 = new ArrayList<>();
        ArrayList<Integer>a2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of arrayList a1");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Element number " + i + " is:");
            int x = sc.nextInt(); 
            a1.add(x);
        }

        System.out.println("Size of arrayList a2");
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            System.out.println("Element number " + i + " is:");
            int x = sc.nextInt();
            a2.add(x);
        }

        for(int i = 0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }

        for(int i = 0;i<a2.size();i++){
            System.out.println(a2.get(i));
        }

        merge2array_removeDup(a1,a2);
        
    }
    
}
