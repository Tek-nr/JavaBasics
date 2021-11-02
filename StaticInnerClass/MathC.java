public class MathC {
    private static double pi= Math.PI; //Static olmayan değişken static class ya da fonk içinde kullanılamaz!
    public static class Area{
        public void AreaCircle(int r){
            System.out.println("The area of circle: "+(r*r*pi));
        }
        public static void AreaSquare(int l){
            System.out.println("The area of square: "+(l*l*pi));
        }
    }
}
