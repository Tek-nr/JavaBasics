
package listlerisiralama;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    @Override
    public String toString() {
        return "Player{" + "İsim : " + isim + ", ID : " + id + '}';
    }

    @Override
    public int compareTo(Player player) {
        if(this.id < player.id)
            return -1;
        else if(this.id > player.id)
            return 1;
        else
            return 0;
    }
    
}

class BuyuktenKucugeString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
    
}

class KucuktenBuyugePlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId())
            return -1;
        else if(o1.getId() > o2.getId())
            return 1;
        else 
            return 0;
    }
    
}

public class ListleriSiralama {

    public static void main(String[] args) {
        /*List<String> list_string = new ArrayList<>();
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        for(String s: list_string){
            System.out.println(s);
        }*/
        
        List<Player> list_player=new ArrayList<>();
        list_player.add(new Player("Kakatu", 1));
        list_player.add(new Player("Turinas", 17));
        list_player.add(new Player("Ogaşinamas", 5));
        list_player.add(new Player("Kimbokgi", 2));
//        
//        Player p1= new Player("Kakatu", 1);
//        Player p2= new Player("Turinas", 17);
//        Player p3 = new Player("Ogaşinamas", 5);
//        Player p4 = new Player("Kimbokgi", 2);
//        System.out.println(p2.compareTo(p4));
//        Collections.sort(list_player);
//        
//         for(Player p: list_player)
//            System.out.println(p);
//        
//        System.out.println();
//        
//        Set<Player> treeset= new TreeSet<>();
//        treeset.add(new Player("Kakatu", 1));
//        treeset.add(new Player("Turinas", 17));
//        treeset.add(new Player("Ogaşinamas", 5));
//        treeset.add(new Player("Kimbokgi", 2));
//        
//        for(Player p: treeset)
//            System.out.println(p);

//        List<String> list= new ArrayList<>();
//        list.add("Java");
//        list.add("C#");
//        list.add("Python");
//        list.add("Php");
//        list.add("Go");
//        list.add("Ruby");
//        Collections.sort(list, new BuyuktenKucugeString());
//        //System.out.println(list);
//        for(String s: list)
//            System.out.println(s);

        Collections.sort(list_player, new KucuktenBuyugePlayer());
        for(Player p : list_player)
            System.out.println(p);
        
    }
    
}
