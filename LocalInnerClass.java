public class Main {
    public static void main(String[] args) {
        class Area{ //Local Inner Classlar pratiklik sağlar. //Tanımlandığı metod dışında kullanılamaz! //public ya da static ile tanımlanamaz!
            public void circle_area(int r){ 
                System.out.println("The area of circle: "+(r*r*Math.PI));
            }
        }
        
        Area area=new Area();
        Area area2= new Area();
        area.circle_area(10);
        area2.circle_area(3);

    }
    public void deneme(){
            //Area area3=  new Area(); //Hata verir!
        }
}
