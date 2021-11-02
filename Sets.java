
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set1= new HashSet<>();
        Set<String> set2= new LinkedHashSet<>();
        Set<String> set3= new TreeSet<>();
        
        //HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("PHP");
        System.out.println();
        //LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("PHP");
        System.out.println();
        //TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("PHP");
        System.out.println("HashSet;");
        System.out.println("**************************************************");
            for(String s1: set1){
                System.out.println(s1);
            }
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("LinkedHashSet;");
        System.out.println("**************************************************");
            for(String s2: set2){
                System.out.println(s2);
            }
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("TreeSet");
        System.out.println("**************************************************");
            for(String s3: set3){
                System.out.println(s3);
            }
        System.out.println("**************************************************");
        
        
    }
    
}
