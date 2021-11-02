
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathClass.Factorial factorial= new MathClass().new Factorial();
        MathClass.PrimeNumber prime =new MathClass().new PrimeNumber();
        MathClass.Area.CircleArea area= new MathClass().new Area().new CircleArea();
        Scanner scanner=new Scanner(System.in);
        System.out.print("(Prime Number) Please enter a value: ");
        int value=scanner.nextInt();
        if(prime.primeOrNot(value)){
            System.out.println("The value you entered is prime number.");
        }
        else{
            System.out.println("The value you entered is not prime number.");
        }
        System.out.println();
        
        factorial.factorial();
        System.out.println();
        
        System.out.print("Please enter a radius valiue: ");
        int r=scanner.nextInt();
        area.AreaCircle(r);
        
    }       
}
