
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {
            writer=new FileWriter("dosya.txt",true);
//            writer.write("Hilal Nur TEK\n");
//            writer.write("Mustafa Murat Coşkun");
//            writer.write("Ali Murat Yıldırım\n");
              writer.write("Ali Kapıkulu\n");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException hatası yakalandı!");
        }
        finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya kapatılırken IOException hatası yakalandı!");
                }
            }
        }
    }
    
}
