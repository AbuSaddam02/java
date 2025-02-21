package StackANDQueue;
import  java.util.*;
public class Q09 {
    public static int size(Queue<Integer> q) {

        int size = 0;
        while (!q.isEmpty()) {
            q.poll();
            size++;
            q.add(q.poll());
            // This way, the queue size will be maintained correctly

            return q.size(); // Push back the element to the end of the queue
        }

        for (int i = 0; i < q.size(); i++) {
            // here's without any methods of(Size ()).

        }

        return 0;
    }
    // חלק ג: האם אפשר בלי תור עזר?

    public static int sizeWithoutSizeMethod(Queue<Integer> q) {
    int count = 0;

    for (int ignored : q) { // Iterates through each element
        count++;
    }
    
    return count;
}
        public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            int size = size(q);
            System.out.println("Size of the queue: " + size);

             System.out.println("Queue size: " + sizeWithoutSizeMethod(q)); // Output: 3
    System.out.println("Queue after function call: " + q); // Output: [5, 10, 15]
        
        
    }
}
/*
 * חלק ב: ניתוח סיבוכיות
זמן ריצה:

המעבר על כל איברי התור (בלולאה הראשונה) → O(n).
החזרת כל האיברים לתור המקורי (בלולאה השנייה) → O(n).
סה"כ O(n).
זיכרון:

שימוש בתור עזר בגודל n, לכן שימוש נוסף של O(n) בזיכרון.
 */