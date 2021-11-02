import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fos= new FileOutputStream("dosya2.txt");
            String s="Ahmet Yerebakan";
            byte[] s_array= s.getBytes();
            fos.write(s_array);
            fis = new FileInputStream("dosya2.txt");
            /*for(int i=0;i<s_array.length;i++){
                System.out.println((i+1)+". karakter: "+(char)(fis.read()));                 
            }*/
            int i;
            String s2="";
            while((i=fis.read())!=-1){
                s2 +=(char)i;
            }
            System.out.println("Dosya içeriği: "+s2);
//            fis.skip(6);
//            System.out.println("Okunan karakter: "+(char)(fis.read()));     
//            System.out.println("Okunan karakter: "+(char)(fis.read()));     
//            System.out.println("Okunan karakter: "+(char)(fis.read()));     
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı!");
        } catch (IOException ex) {
            System.out.println("Dosya yazım/okuma hatası!");
        }
        finally{
            try {
                if(fis!=null){
                fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapatılamadı!");
            }
        }
    }
    
}
