
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSortandComparableInterface {
    public static void main(String[] args) {
        List<String> list_string= new ArrayList<>();
        list_string.add("Java");
        list_string.add("C#");
        list_string.add("Python");
        list_string.add("PHP");
        list_string.add("Go");
        list_string.add("Ruby ");
        Collections.sort(list_string);
        /*for(String s: list_string){
            System.out.println(s);
        }*/
       
       List<Player> list_player= new ArrayList<>();
       
       Player p1= new Player("Emre",4);
       Player p2= new Player("Erdal",2);
       Player p3= new Player("Serdar",3);
       Player p4= new Player("Oguz",1);
       list_player.add(p4);
       list_player.add(p3);
       list_player.add(p2);
       list_player.add(p1);
       list_player.add(new Player("Murat",1));
       
       //System.out.println(p1.compareTo(p2));
       /*Collections.sort(list_player);
       for(Player p: list_player)
       System.out.println(p);*/
       /*Set<Player> treeset= new TreeSet<>();
       treeset.add(new Player("Murat",1));
       treeset.add(p1);
       treeset.add(p3);
       treeset.add(p2);*/
       /*for(Player p: treeset)
           System.out.println(p);*/
       
       Collections.sort(list_string, new BuyuktenKucugeString());
       for(String s: list_string){
            System.out.println(s);
       }
       System.out.println();
       System.out.println("Küçükten Büyüğe;");
       Collections.sort(list_player, new KucuktenBuyugePlayer());
       for(Player p: list_player){
            System.out.println(p);
       }
       System.out.println();
       System.out.println("Büyükten Küçüğe;");
       Collections.sort(list_player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.compareTo(o2);
            }
        });
       for(Player p: list_player){
            System.out.println(p);
       }
       System.out.println();
       System.out.println("Büyükten Küçüğe İsme göre;");
       Collections.sort(list_player, new BuyuktenKucugePlayerIsim());
       for(Player p: list_player){
            System.out.println(p);
       }
       System.out.println();
       System.out.println("Küçüten Büyüğe İsme göre;");
       Collections.sort(list_player, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
       for(Player p: list_player){
            System.out.println(p);
       }
    }
    
    
        
    static class KucuktenBuyugePlayer implements Comparator<Player>{

        @Override
        public int compare(Player player1, Player player2) {
            return player1.compareTo(player2);
        }   
    }
    static class KucuktenBuyugePlayerIsim implements Comparator<Player>{

        @Override
        public int compare(Player player1, Player player2) {
            return player1.getName().compareTo(player2.getName());
        }   
    }
    static class BuyuktenKucugePlayerIsim implements Comparator<Player>{

        @Override
        public int compare(Player player1, Player player2) {
            return -player1.getName().compareTo(player2.getName());
        }   
    }
    
    
    
   static class BuyuktenKucugeString implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
        
    }
   static class Player implements Comparable<Player>{
        private String name;
        private int ID;

        public Player(String name, int ID) {
            this.name = name;
            this.ID = ID;
        }

        @Override
        public String toString() {
            return "Player{" + "Name = " + name + ", ID = " + ID + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 73 * hash + Objects.hashCode(this.name);
            hash = 73 * hash + Objects.hashCode(this.ID);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Player other = (Player) obj;
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            if (!Objects.equals(this.ID, other.ID)) {
                return false;
            }
            return true;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        @Override
        public int compareTo(Player player) { 
            if(this.ID < player.ID)
                return -1;
            else if(this.ID == player.ID)
                return 0;
            else
                 return 1;
        }
        
    }
    
}
