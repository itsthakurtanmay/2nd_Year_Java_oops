
import java.util.Stack;

public class stackinterface {
    public static void stack_Demo(){
        Stack<Integer>st = new Stack<>();

        //add
        st.push(34);
        st.push(4);
        st.push(9);
        st.push(35);
        st.push(22);

        //removing topmost element from the stack
        System.out.println(st.pop());//22;

        //peek = return topmost element
        System.out.println(st.peek());

        //checking stack is empty or not
        System.out.println(st.isEmpty());//false;

        //printing stack
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
    public static void main(String[] args) {
        stack_Demo();
        
    }
    
}
