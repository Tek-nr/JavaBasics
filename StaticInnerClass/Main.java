public class Main {
    public static void main(String[] args) {
        MathC.Area area=new MathC.Area(); 
        area.AreaCircle(5);
        MathC.Area.AreaSquare(5);//Static class ve fonksiyon olduğu için yeni obje oluşturmaya gerek kalmadı! 
    }
    
}
