import java.util.LinkedList;
public class linked_List {

    public static void main(String[] args) {
        LinkedList<Integer>al = new LinkedList<>();
        //1. Addition;
        al.add(12);
        al.add(15);
        al.add(17);
        al.add(19);
        al.add(20);
        //Printing Linkedlist;
        System.out.println("Linked list nodes are :  " + al);

        //2. Adding element at particular index;
        al.add(2,999);
        System.out.println(al);

        //3. set method in arraylist;
        al.set(2,1111);
        System.out.println(al);

        //4. get method in arraylist;
        System.out.println(al.get(3));

        //5. size of arrayList;
        System.out.println(al.size());


        
    }
}