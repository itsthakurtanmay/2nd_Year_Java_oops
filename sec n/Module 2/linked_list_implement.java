public class linked_list_implement {
    static class linkedListNode{
        int data;
        linkedListNode add;

        //constructor
        linkedListNode(int ch){
            this.data = ch;
            this.add = null;
        }

    }
    public static void main(String[] args) {
        linkedListNode ll = new linkedListNode(34);
        System.out.println(ll.data);
        System.out.println(ll.add);
        
    }
    
}
