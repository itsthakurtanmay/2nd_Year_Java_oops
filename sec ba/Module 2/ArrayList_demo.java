import java.util.ArrayList;

public class ArrayList_demo {
    public static void ArrayList_demo(){
        ArrayList<Integer>al = new ArrayList<>();

        //1. Adding elements in the ArrayList;
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        al.add(17);

        //2. Printing ArrayList
        System.out.println(al);

        //3. Printing value at particular index;
        al.add(2,6789);
        System.out.println(al);

        //4. Set method in the ArrayList;
        al.set(0, 9999999);
        System.out.println(al);

        //5. Get keyword to retreive value at particular index;
        System.out.println(al.get(3));

        //6. Size();
        System.out.println(al.size());

    }

    public static void main(String[] args) {
        ArrayList_demo();
        
    }
}