import java.util.ArrayList;

/**
 * printingArrayListEle
 */
public class printingArrayListEle {
    public static void printfrom1to10(ArrayList<Integer>al){
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(4);
        // al.add(5);
        // al.add(6);

        for(int i = 1;i<=10;i++){
            al.add(i);
        }

        System.out.println(al);



    }

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();

        printfrom1to10(al);

        
    }
}