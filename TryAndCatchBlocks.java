package tryandcatchblocks;
public class TryAndCatchBlocks {
    public static void main(String[] args) {
        //int a=30/0; //Unchecked Exception
        //int[] array={1,2,3,4,5};
        //System.out.println(array[6]);
        //System.out.println("System is working...");
        
        try{
            //int a=30/0; //ArithmeticException
            int[] array={1,2,3,4,5};
            System.out.println(array[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("None of numbers is not divided by 0!");
            System.out.println("You entered a value greater than the array size.");
        }
        finally{
        System.out.println("Finally block is working...");
        }
    }
    
}
