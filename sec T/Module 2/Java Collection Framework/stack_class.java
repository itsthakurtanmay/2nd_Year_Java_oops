import java.util.Stack;
public class stack_class {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        //1. Push method in stack
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        // System.out.println(st.isEmpty());

        //peek method
        System.out.println(st.peek());

        while(!st.isEmpty()){
            System.out.println(st.pop()); 
        }
        System.out.println(st.isEmpty());

        
    }
    
}
