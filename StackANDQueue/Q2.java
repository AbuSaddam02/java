package StackANDQueue;

import java.util.Queue;


public class Q2 {

    public static void main(String[] args) {

        Queue<Integer> q1 = new Queue<Integer>();
        Queue<Integer> q2 = new Queue<Integer>();
        q1.insert(32);
        q1.insert(-6);
        q2.insert(q1.head());
        q1.insert(q1.remove() + q1.remove());
        if (q1.isEmpty())
            q1.insert(9);
        else
            q2.insert(17);

    }
}