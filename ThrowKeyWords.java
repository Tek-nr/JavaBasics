package throwkeywords;

import java.util.Scanner;

public class ThrowKeyWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age=scan.nextInt();
        try{
        age_control(age);
        }
        catch(ArithmeticException e){
            System.out.println("People who is younger than 18 cannot come in!");
        }
    }
    public static void age_control(int age){
        if(age<18){
            throw new ArithmeticException();
        }
        else
            System.out.println("Welcome!");
    }
}
