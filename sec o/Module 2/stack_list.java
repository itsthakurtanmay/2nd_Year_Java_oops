
import java.util.Stack;

public class stack_list {
    public static void stack_demo(){
        Stack<Integer>st = new Stack<>();
        //add;
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        //remove;
        st.pop();

        //peek
        st.peek();

        while(!st.isEmpty()){
            System.out.println(st.pop()); 
        }

    }
    public static void main(String[] args) {
        stack_demo();
    }
    
}
