package StackANDQueue;

import java.util.Queue;


public class Q2 {

    public static void main(String[] args) {

        // Queue<Integer> q1 = new Queue<Integer>();
        // Queue<Integer> q2 = new Queue<Integer>();
        // q1.add(32);
        // q1.add(-6);
        // q2.add(q1.peek());
        // q1.add(q1.remove() + q1.remove());
        // if (q1.isEmpty())
        //     q1.add(9);
        // else
        //     q2.add(17);

        Queue<String> q1 = new Queue<String>();
        Queue<String> q2 = new Queue<String>();
        q1.add("Hello");
        q1.add("World");
        q2.add(q1.remove());
}