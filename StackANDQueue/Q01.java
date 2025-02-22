package StackANDQueue;

import java.util.Stack;

public class Q01 {
    public static void stacky() {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        s1.push('a');
        s1.push('b');
        s1.push('c');
        s1.push('d');
        char ch = s1.pop();
        s2.push(ch);
        ch = s2.pop();
        s1.push('e');
        System.out.println("S1 ~>" + s1);
        System.out.println("S2 ~>" + s2);
        System.out.println("ch~>" + ch);

    }

    public static void Stack1b() {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        s1.push(1);
        s2.push(2);
        s1.push(3);
        s2.push(4);
        s1 = s2;
        s1.push(5);
        s2.push(6);
        System.out.println("S1 ~>" + s1);
        System.out.println("S2 ~>" + s2);
}
    public static void main(String[] args) {
        stacky();
        System.out.println("===================================\n Saeef B");
        Stack1b();
    }
}