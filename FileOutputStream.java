import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        System.out.println("");
        File file=new File("dosya.txt");
        try {
            fos= new FileOutputStream(file,true);
              fos.write(72);
              //byte[] array={101,75,66,67};
              String s="Yuce Hilal";
              byte[] s_array=s.getBytes();
              fos.write(s_array);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception hatası!"); 
        } catch (IOException ex) {
            System.out.println("Dosyaya yazılırken bir hata oluştu!");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu!");
            }
        }
    }

}
