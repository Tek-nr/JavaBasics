
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist= new ArrayList<>();
        LinkedList<Integer> linkedlist= new LinkedList<>();
        List<Integer> list= new ArrayList<>();
        zaman_hesapla("LinkedList",linkedlist);
        zaman_hesapla("ArrayList",arraylist);
    }
    public static void zaman_hesapla(String veri_tipi, List<Integer> list){
       //Listin sonuna değer ekleme
       
       long baslangic,bitis;
       baslangic= System.currentTimeMillis();
       for(int i=0;i<100000;i++){
           list.add(0,i);
       }
       bitis= System.currentTimeMillis();
       System.out.println(veri_tipi+" ekleme süresi: "+(bitis-baslangic)+ " ms");
    }
    
}
