package ınheritance1;
public class Yonetici extends Calisan { //Calisan classındaki özellikleri miras aldık. (extends)
    private int sorumlu_kisi;
    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){
        super(isim,maas,departman); //Parametre olarak girdiğimiz değerler private olduğu için dolaylı olarak "super" anahtar kelimesi ile çağırmış olduk.
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public String yonetici_ozel(){
        String ise_alim="Ahmet Kızak    "
                       +"Seher Sarıbacak    "
                       +"Muhammet Aksam     "
                       +"Pınar Yerebakmaz";
        return ise_alim;
    }

    public void bilgileri_goster(){
        /*System.out.println("İsim = "+ getIsim());
        System.out.println("Maas = "+getMaas());
        System.out.println("Departman = "+getDepartman());*/
        super.bilgileri_goster();
        System.out.println("Sorumlu Kişi Sayısı = "+this.sorumlu_kisi);
    }
    
    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara "+zam_miktari+" tl zam yapıldı.");
    }
    
}
