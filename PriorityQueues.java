import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
class Player implements Comparable<Player>{
    private String name;
    private int ID;

    public Player(String name, int ID) {
        this.name = name;
        this.ID = ID;
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
    public String toString() {
        return "Player{" + "Name : " + name + ", ID : " + ID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.ID;
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

    @Override
    public int compareTo(Player player) {
        if(this.ID<player.ID)
            return -1;
        else if(this.ID==player.ID)
            return 0;
        else
            return 1;
    }
    
}
public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Player> queue= new PriorityQueue<>();
        queue.offer(new Player("Hilal",1));
        queue.offer(new Player("Ahmet",5));
        queue.offer(new Player("İlayda",3));
        queue.offer(new Player("Semih",4));
        queue.offer(new Player("Ali",2));
        while(!queue.isEmpty()){
            System.out.println("Player is being removed: " + queue.poll());
        }
        
        
    }
    
}
