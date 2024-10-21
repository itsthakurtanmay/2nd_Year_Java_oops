import java.util.LinkedList;
import java.util.Queue;

public class queue_Interface {
    public static void Queue_demo(){
        Queue<String>q = new LinkedList<>();

        //1. Adding element in the Queue (offer,add);
        q.add("Java");
        q.add("Collection");
        q.add("Framework");
        q.add("Interface");

        q.offer("class");
        q.offer("objects");

        //2. Printing queue by using their name;
        System.out.println(q);

        //3. Removing elements from the queue (rear end)
            //Poll()
        System.out.println("Removing ele by using poll methods " + q.poll());//java
        System.out.println("Removing ele by using poll methods " + q.poll());//collection

           //remove()
           System.out.println("Removing ele by using rempve methods " + q.remove());//framework
           System.out.println("Removing ele by using remove methods " + q.remove());//Interface

        //4. contains() => to check whether this ele is present or not in the queue;
        System.out.println("checking ele present or not");
        System.out.println(q.contains("java"));
        System.out.println(q.contains("objects"));

        //5. size();
        System.out.println(q.size());    

        //6. q.isEmpty();
        System.out.println(q.isEmpty());

        //7. peek(), Element();=> both return front ele;
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.element());

        //8. q.clear();
        q.clear();

        System.out.println(q);

        

    }
    public static void main(String[] args) {
        Queue_demo();
    }
    
}
