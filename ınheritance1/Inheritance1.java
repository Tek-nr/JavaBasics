
package ınheritance1;

public class Inheritance1 {

    public static void main(String[] args) {
        Yonetici yonetici1= new Yonetici("Kamil Özsoy",15000,"Pazarlama",1000);
        //yonetici1.calis();
        yonetici1.bilgileri_goster();
        System.out.println("İşe alınacaklar = "+ yonetici1.yonetici_ozel());
        yonetici1.zam_yap(150);
    }
    
}
