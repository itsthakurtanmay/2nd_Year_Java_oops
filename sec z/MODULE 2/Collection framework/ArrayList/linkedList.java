import java.util.LinkedList;
public class linkedList {

    public static void main(String[] args) {
        LinkedList<Integer>a = new LinkedList<>();
        //1.Adding element in the ArrayList
        a.add(1);
        a.add(12);
        a.add(21);
        a.add(45);
        a.add(67);

        //2. printing AL;
        System.out.println(a);

        //3. get() => to fetch the value of particular index;
        System.out.println(a.get(3));

        //4. Printing arraylist by using loop
        for(int i = 0;i<5;i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();

        //5. add value at the particular index;
        a.add(0,999999);
        System.out.println(a);

        //6. set() method in arraylist
        a.set(4,100000);
        System.out.println(a);

        //6. size()

        System.out.println(a.size());

        
    }
}