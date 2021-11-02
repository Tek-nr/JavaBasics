import java.util.Scanner;
import javax.swing.JOptionPane;
import static java.util.Arrays.*;

public class Arrays {
    public static void main(String[] args) {
        int[] array=new int[10];
        //array_fill(array);
        //array_sort(array);
        int a1[]={1,2,3,4,5,6};
        for(int x:a1){
            System.out.println(x);
        }
        
    }
    public static void array_fill(int[] array){
        int i;
        Scanner scan=new Scanner(System.in);
        for(i=0;i<array.length;i++){
            //System.out.print(i+1+". eleman: ");
            array[i]=Integer.parseInt(JOptionPane.showInputDialog(i+1+". sayı")); //Ekrana Çıkan Kutucuklar ile Dizi Doldurma
        }
    }
    public static void array_sort(int[] array){
        sort(array);
        int i;
        Scanner scan=new Scanner(System.in);
        for(i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
