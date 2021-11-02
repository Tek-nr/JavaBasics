
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
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
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.ID;
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
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
public class Main {
    public static void main(String[] args) {
        Set<Player> hashset= new HashSet<>();
        Player player1= new Player("Alina",9);
        Player player2= new Player("Rıza",5);
        Player player3= new Player("Veli",11);
        Player player4= new Player("Ahmet",7);
        Player player5= new Player("Ahmet",7);
        
        hashset.add(player5);
        hashset.add(player4);
        hashset.add(player3);
        hashset.add(player2);
        hashset.add(player1);
        
        for(Player p: hashset)
            System.out.println(p);
    }
    
}
