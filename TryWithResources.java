package trywithresources;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryWithResources {
    /*public static void main(String[] args) {
        try(FileWriter writer1= new FileWriter("diller.txt")){
            Scanner scan=new Scanner(System.in);
            String dil;
            while(true){
                System.out.println("Bir dil giriniz: ");
                dil=scan.nextLine();
                if(dil.equals("-1")){
                    System.out.println("Sistemden çıkılıyor...");
                    System.out.println("Dosyayı kontrol edin...");
                    break;
                }
                writer1.write(dil+"\n");
            }
        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken hata oluştu!");
        }
    }*/
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try(FileWriter writer= new FileWriter("students.txt",true)){
            while(true){
                System.out.print("Öğrencinin adı: ");
                String o_ad= scan.nextLine();
                if(o_ad.equals("-1")){
                    System.out.println("Programdan Çıkılıyor...");
                    System.out.println("Lütfen dosyayı kontrol ediniz...");
                    break;
                }
                writer.write(o_ad+" ---> ");
                System.out.print("Öğrencinin bölümü: ");
                String o_bolum= scan.nextLine();
                if(o_bolum.equals("-1")){
                    System.out.println("Programdan Çıkılıyor...");
                    System.out.println("Lütfen dosyayı kontrol ediniz...");
                    break;
                }
                writer.write(o_bolum+"\n");
                
            }
        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken hata!");
        }
    }
    
}
