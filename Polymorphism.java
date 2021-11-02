
package polymorphism;
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor...";
    }
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor...";
    }
}

class Kopek extends Hayvan{
    
    public Kopek(String isim){
    super(isim);
}
    @Override
    public String konus(){
        return this.getIsim()+" havlıyor...";
    }
}

class At extends Hayvan{
    public At (String isim){
        super(isim);
    }
    @Override
    public String konus(){
        return this.getIsim()+" kişniyor...";
    }
}
public class Polymorphism {
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        /*Hayvan hayvan1 =new At ("Holly");
        Hayvan hayvan2= new Kopek("Zeytin");
        Hayvan hayvan3=new Kedi("Kirpi");
        System.out.println(hayvan1.konus()+"\n"+hayvan2.konus()+"\n"+hayvan3.konus());*/
        konustur(new At("Holly"));
        konustur(new Kopek("Zeytin"));
        konustur(new Kedi("Kirpi"));
    }
    
}
