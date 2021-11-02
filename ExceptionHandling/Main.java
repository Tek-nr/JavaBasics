
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*public static void age_control(int age){
        if(age>=18){
            System.out.println("Welcome!");
        }
        else{
            throw new ArithmeticException();
        }
    }*/ //THE SECOND LESSON
    
    /*public static void age_control(int age) throws IOException{
        if(age>=18){
            System.out.println("Welcome!");
        }
        else{
            throw new IOException();
        }
    }*/ //THE THIRD LESSON
    public static void age_control(int age) throws InvalidAgeException{
        if(age>=18){
            System.out.println("Welcome!");
        }
        else{
            throw new InvalidAgeException("Invalid Age!");
        }
    } //THE FORTH LESSON
    public static void main(String[] args) throws InvalidAgeException /*throws IOException*/ {
        /*try{
            //int a =30/0;
            int[] array={1,2,3,4,5};
            System.out.println(array[6]);
        }
        
        catch(ArithmeticException e){
            System.out.println("Hata 1!");
            System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println("Hata 2!");
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally{
            System.out.println("Processing...");
        }
        
        System.out.println("Hi there!");
        System.out.println("I'm here!");*/  //THE FIRST LESSON
        
        
        /*Scanner scan=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=scan.nextInt();
        try{
            age_control(age);
        }
        catch(ArithmeticException e){
            System.out.println("Under the edge!");
        }*/ //THE SECOND LESSON
        
        /*Scanner scan=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=scan.nextInt(); //THE THIRD LESSON
        age_control(age);*/ //Try catch blogunu kendin yazmak istemezsen throws kullan
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=scan.nextInt();
        /*try{
            age_control(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
            e.printStackTrace();
    }*/
        age_control(age);
    }
}
