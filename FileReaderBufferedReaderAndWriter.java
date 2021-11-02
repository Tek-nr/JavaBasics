
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

//    public static void main(String[] args) {
//        try (Scanner scan = new Scanner(new FileReader("students.txt"))) { //Tepsisiz Garson
//            int i = 1;
//            while (scan.hasNextLine()) {
////                System.out.println(i + ". line: " + scan.nextLine());
////                i++;
//                String s_info = scan.nextLine();
//                String[] array = s_info.split(" ---> ");
//                if (array[1].equals("Computer Engineering")) {
//                    System.out.println("Computer: " + array[0]);
//                }
//            }                                        //ctrl+shift+c
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Could not find the file you are looking for!");
//        } catch (IOException ex) {
//            System.out.println("There was an exception when opening the file!");
//        }
//
//    }
    
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader("students.txt")))) { //Tepsili Garson
            while(scan.hasNextLine()){
                String s_info=scan.nextLine();
                String[] array= s_info.split(" ---> ");
                if(array[1].equals("Computer Engineering")){
                    System.out.println("Computer: "+array[0]);
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
    }
    
//    public static void main(String[] args) {
//        try(BufferedWriter b_writer=new BufferedWriter(new FileWriter("students.txt",true))){
//            b_writer.write("Ayse Hanimeli ---> Biology\n");
//            b_writer.write("Atif Karakurt ---> Biology\n");  //dosyada sıralarını değiştirdim
//            b_writer.write("Emrah Sayman ---> Biology\n");
//        } catch (IOException ex) {
//            System.out.println("There was an exception when opening the file!");
//        }
//    }
}
