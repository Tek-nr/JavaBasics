
import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        Character[] c_array={'j','a','v','a' };
//        Integer[] i_array={1,2,3,4,5,6};
//        String[] s_array= {"java","python","javascript"};
//        Student[] st_array={new Student("Lala"),new Student("Lulu"), new Student("Lili")};
//        System.out.println();
//        PrintList printlist= new PrintList();
//        printlist.print(c_array);
//        System.out.println();
//        printlist.print(i_array);
//        System.out.println();
//        printlist.print(s_array);
//        System.out.println();
//        printlist.print(st_array);
//    }
//    
//}
public class Main {

    public static void main(String[] args) {
        
        /*Character[] charArray = {'j', 'a', 'v', 'a'};
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"Java", "Python", "C++", "PHP"};
        Student[] studentArray = {new Student("Jeje"), new Student("Jojo"), new Student("Lala")};*/
//        PrintList<Student> printStudent = new PrintList<>();
//        printStudent.print(studentArray);
//        System.out.println();
//        PrintList<Character> printCharacter = new PrintList<>();
//        printCharacter.print(charArray);
//        System.out.println();
//        PrintList printlist = new PrintList();
//        printlist.print(intArray);
//        System.out.println("******************");
//        printlist.print(charArray);
//        System.out.println("******************");
//        printlist.print(stringArray);
//        System.out.println("******************");
//        printlist.print(studentArray);  
        /*print(charArray);
        print(intArray);
        print(stringArray);
        print(studentArray);*/
        Sayisal s1= new Sayisal(30, 40, 20, 20);
        Sayisal s2= new Sayisal(32, 30, 20, 15);
        
        EsitAgirlik ea1 = new EsitAgirlik(35, 20, 13, 20);
        EsitAgirlik ea2 = new EsitAgirlik(32, 25, 10, 15);
        
//        System.out.println("Sayısal Puan: "+s1.calculateScore());
//        System.out.println("Sayısal Puan: "+s2.calculateScore());
//        System.out.println("Eşit Ağırlık Puan: "+ea1.calculateScore());
//        System.out.println("Eşit Ağırlık Puan: "+ea2.calculateScore());
        System.out.println("Eşit Ağırlık Birincisi : "+ TheFirst(ea1, ea2).calculateScore());
        System.out.println("Sayısal Birincisi : "+ TheFirst(s1, s2).calculateScore());
        
    }
    
//    public static <E> void print(E[] array){
//        for(E e: array)
//            System.out.println(e);
//        System.out.println("************************");
//    }
    
    public static <E extends Candidate> E TheFirst(E e1, E e2){
        if(e1.calculateScore() > e2.calculateScore())
            return e1;
        else 
            return e2;
    }
}
