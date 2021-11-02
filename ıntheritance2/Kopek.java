package ıntheritance2;

public class Kopek extends hayvan{
    private int dis_sayisi;
    public Kopek(String isim,int kilo,int boy,int bacaksayisi, int dis_sayisi){
        super(isim,kilo,boy,bacaksayisi);
        this.dis_sayisi=dis_sayisi;
        System.out.println("Köpeğin ismi = "+getIsim());
        System.out.println("Köpeğin kilosu (kg) = "+ getKilo());
        System.out.println("Köpeğin boyu (cm) = "+getBoy());
        System.out.println("Köpeğin bacak sayısı = "+getBacaksayisi());
        System.out.println("Köpeğin diş sayısı = "+this.dis_sayisi);
    }
    public void hareket(int hiz){
        System.out.println("Köpek "+hiz+ " km hızla hareket ediyor");
    }
    public void kos(int hiz){
        System.out.println("Köpek koşuyor...");
        hareket(hiz);
        super.hareket(hiz);
    }
}
