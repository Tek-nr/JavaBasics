
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main_Maps {
    public static void main(String[] args) {
        Map<Integer,String> hashmap= new HashMap<>();
        Map<Integer,String> linkedhashmap= new LinkedHashMap<>();
        Map<Integer,String> treemap= new TreeMap<>();
        System.out.println();
        System.out.println("HashMap");
        printMap(hashmap);
        System.out.println();
        System.out.println("LinkedHashMap");
        printMap(linkedhashmap);
        System.out.println();
        System.out.println("TreeMap");
        printMap(treemap);
    }
    public static void printMap(Map<Integer,String> map){
        map.put(10, "Java");
        map.put(50, "C++");
        map.put(20, "C#");
        map.put(30, "SQL");
        map.put(40, "Python");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey()+"\tValue: "+entry.getValue());
        }
        //System.out.println(map.keySet());
        /*Collection<String> values=map.values(); 
        for(String s: values){
            System.out.println(s);
        }*/
    }
}
