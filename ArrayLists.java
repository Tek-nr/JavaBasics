package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
       ArrayList<String> arraylist= new ArrayList<String>();
       arraylist.add("Metallica");
       arraylist.add("Guns'n Roses ");
       arraylist.add("Black Sabbath");
       arraylist.add("Iron Maiden");
       arraylist.add("Metallica");
       //System.out.println(arraylist.get(0));
       //System.out.println(arraylist.size());
       /*for(int i=0;i<arraylist.size();i++){
           System.out.println(arraylist.get(i));
       }*/
       /*arraylist.remove("Metallica");
       System.out.println();
       for(int i=0;i<arraylist.size();i++){
           System.out.println(arraylist.get(i));
       }*/
       /*arraylist.remove(1);
       System.out.println();
       for(int i=0;i<arraylist.size();i++){
           System.out.println(arraylist.get(i));
       }*/
       System.out.println();
       System.out.println(arraylist.indexOf("Metallica"));
       System.out.println(arraylist.lastIndexOf("Metallica"));
       System.out.println(arraylist.lastIndexOf("Dream Theater"));
       arraylist.set(4, "Megadeth"); //4. satırdaki elementi "Megadeth" ile değiştirdik.
       yazdir(arraylist);
       /*System.out.println();
       for(int i=0;i<arraylist.size();i++){
           System.out.println(arraylist.get(i));
       }*/
       
    }
    static void yazdir(ArrayList<String> a){
       for(int i=0;i<a.size();i++){
           System.out.println(a.get(i));
       }
    }
}















