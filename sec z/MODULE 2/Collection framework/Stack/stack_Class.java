import java.util.Stack;

public class stack_Class {

    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        //1. Adding ele
        st.push(34);
        st.push(35);
        st.push(33);
        st.push(23);
        st.push(9);

        //2. peek() => return topmost val of stack
        System.out.println(st.peek());

        //3. Remove => pop();
        System.out.println(st.pop());
        System.out.println(st.peek());

        //4. size();
        System.out.println(st.size());

        //5. isEmpty();
        System.out.println(st.isEmpty());

        //Printing Stack;
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}