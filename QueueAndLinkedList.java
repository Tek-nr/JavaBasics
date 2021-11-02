package queueandlinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("PHP");
        queue.offer("C#");
        queue.offer("JavaScript");
        for(String q: queue)
            System.out.println(q);
        System.out.println("The first element was removed: "+ queue.poll());
        System.out.println();
        for(String q: queue)
            System.out.println(q);
       
        
    }
    
}
