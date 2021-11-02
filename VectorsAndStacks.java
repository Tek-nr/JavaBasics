package vectorsandstacks;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class VectorsAndStacks {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        ArrayList<String> arraylist= new ArrayList<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("PHP");
        vector.add("JavaScript");
       /* for(String v: vector)
            System.out.println(v);*/
        /*ListIterator<String> iterator= vector.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        /*Enumeration<String> enumeration= vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }*/
       //System.out.println("First element: "+ vector.firstElement());
       //System.out.println("Last element: "+ vector.lastElement());
       
       Stack<String> stack= new Stack<>();
       stack.push("Java");
       stack.push("Python");
       stack.push("PHP");
       stack.push("C#");
       stack.push("JavaScript");
       /*Enumeration<String> enumeration= stack.elements();
       while(enumeration.hasMoreElements()){
           System.out.println(enumeration.nextElement());
       }
       System.out.println();
       System.out.println("Last element: "+stack.peek());
       System.out.println("Last element is being removed... ");
       stack.pop();
       System.out.println();
       System.out.println("New Stack; ");
       for(String s: stack)
           System.out.println(s);
       System.out.println();
       System.out.println("Last In First Out!");
       System.out.println();*/
       
       while(!stack.empty()){
           System.out.println("The last element "+ stack.peek()+" is being removed... ");
           stack.pop();
           System.out.println();
       }
       
    }
    
}
