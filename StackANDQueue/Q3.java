package StackANDQueue;

import java.util.Stack;

public class Q3 {

public static void main(String[] args) {
    
    Stack<Integer> st1 = new Stack<Integer>();
    st1.push(3);
    st1.push(7);
    st1.push(1);
    st1.push(2);
    st1.push(8);

    Stack<Integer>st2=new Stack<Integer>();
    int x, y;
    while(!st1.isEmpty())
    {
        x = st1.pop();
        if (!st1.isEmpty()) {
            y = st1.pop();
            st2.push(y);
        } else
            st2.push(x);
        st2.push(x);
    }
    
    System.out.println("ST2 ~> "+ st2);

System.out.println(st1.peek());

System.out.println(st1.peek());
}
}
