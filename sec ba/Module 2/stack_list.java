import java.util.Scanner;
import java.util.Stack;

public class stack_list {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of input you want to push into the stack");
        int n = sc.nextInt();
        //1. Adding element by user;
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        
        // 1. adding element in stack
        // st.push(12);
        // st.push(13);
        // st.push(14);
        // st.push(15);
        // st.push(16);

        // 2. Peek element in the stack
        System.out.println("Returning topmost element " + st.peek());

        // 3. Removing element into stack
        System.out.println(st.pop());
        System.out.println(st.pop());

        // 4. checking stack is empty or not;
        System.out.println(st.isEmpty());

        // 5. Printing ele from the stack
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
    
}
