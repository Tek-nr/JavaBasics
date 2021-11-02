package linkedlistmain;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {
    
    public static void listeyiyaz(LinkedList<String> gidilecek_yerler){
        /*for(String s: gidilecek_yerler)
            System.out.println(s);*/
        ListIterator<String> iterator= gidilecek_yerler.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public static void siraliekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator= gidilecek_yerler.listIterator();
        while(iterator.hasNext()){
        int karsilastir=iterator.next().compareTo(yeni);
        
        
        if(karsilastir==0){
            //Gönderilen eleman iterator.next() e eşit...
            System.out.println("Gönderilen eleman listede mevcut.");
            return;
        }
        else if(karsilastir<0){
            //Gönderilen eleman iterator.next() den büyük...
        }
        else if(karsilastir>0){
            //Gönderilen eleman iterator.next() den küçük...
            iterator.previous();
            iterator.add(yeni);
            return;
        }
      }
        iterator.add(yeni);
    }
    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler=new LinkedList<>();
        siraliekle(gidilecek_yerler,"Ev");
        siraliekle(gidilecek_yerler,"Okul");
        siraliekle(gidilecek_yerler,"Postane");
        siraliekle(gidilecek_yerler,"Avm");
        listeyiyaz(gidilecek_yerler);
        
        /*gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");
        listeyiyaz(gidilecek_yerler);
        System.out.println("---------------------------------------------------");
        gidilecek_yerler.add(4,"AVM");
        listeyiyaz(gidilecek_yerler);
        System.out.println("---------------------------------------------------");
        gidilecek_yerler.remove(3);
        listeyiyaz(gidilecek_yerler);*/
        
    }
    
}
