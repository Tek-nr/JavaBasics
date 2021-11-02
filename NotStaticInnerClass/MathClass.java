
import java.util.Scanner;

public class MathClass {
    private double PI= Math.PI;
    
    public class Factorial{
        public void factorial(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("(Factorial) Please enter a value: ");
            int value = scanner.nextInt();
             int i,fact=1;
            for(i=value;i>1;i--){
                fact*=i;
            }
            System.out.println("Factorial: "+fact);
        }
    }
    
    public class PrimeNumber{
        public boolean primeOrNot(int value){
            int i=2;
            while(i<value){
                if(value%i==0)
                    return false;
                i++;
            }
            return true;
        }
    }
    
    public class Area{
        public class CircleArea{
        public void AreaCircle(int r){
            System.out.println("Area of the circle: "+(PI*r*r));
            }
        }
    }   
}
