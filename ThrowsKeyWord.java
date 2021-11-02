package throwskeyword;
import java.io.IOException;
import java.util.Scanner;
public class ThrowsKeyWord {
    public static void main(String[] args) throws IOException { //Hata bizim tarafımızdan değil kodu kullanacak başka biri tarafından bulunuyor
        Scanner scan=new Scanner(System.in);                        //ama mutlaka bulunuyor
        System.out.print("Please enter your age: ");
        int age=scan.nextInt();
        /*try{
        old_control(old);
        }                           //Hatayı try catch bloklarıyla yakalama
        catch(IOException e){
            System.out.println("IOException handled");
        }*/
        age_control(age);
    }
    public static void age_control(int age) throws IOException{
        if(age<18){
            throw new IOException();
        }
        else
            System.out.println("Welcome!");
    }
}
   
 
