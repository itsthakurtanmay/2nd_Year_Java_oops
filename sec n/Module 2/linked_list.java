import java.util.LinkedList;
public class linked_list {

    public static void main(String[] args) {
        LinkedList<Integer>al = new LinkedList<>();
        //1. Add into The ArrayList;
        al.add(15);
        al.add(17);
        al.add(23);
        al.add(65);

        //2. Printing ArrayList
        System.out.println(al);

        //3. Adding element at particular index in ArrayList
        al.add(2,9999);
        System.out.println(al);

        //4. Set value of ArrayList at the particular index;
        al.set(0, 10000);
        System.out.println(al);

        //5. Get method to access particular value at that index;
        System.out.println(al.get(4));

        //6. size() to get the length of arraylist;
        System.out.println(al.size());
        
    }
}