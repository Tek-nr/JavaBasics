package ınterfaces;
public class Interfaces {
    public static void main(String[] args) {
        PCmuhendis muhendis1=new PCmuhendis(false,false);
        Imuhendis muhendis2= new PCmuhendis(true,false);
        Mmuhendis muhendism1= new Mmuhendis(true,true);
        Imuhendis muhendism2= new Mmuhendis(false,true);
        
        muhendis1.adli_sicil_sorgula();
        muhendis1.askerlik_durumu();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.5));
        String[] tecrube= {"Vestel","Aselsan","Roketsan"};
        muhendis1.is_tecrubesi(tecrube);
        System.out.println();
        
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.05));
        String[] tecrube2={"Türksat","Turkcell","Havelsan"};
        muhendis2.is_tecrubesi(tecrube2);
        System.out.println("");
        
        muhendism1.adli_sicil_sorgula();
        muhendism1.askerlik_durumu();
        System.out.println(muhendism1.mezuniyet_ortalamasi(3.74));
        String[] tecrubem1={"Vestel","Arçelik","Bosch"};
        muhendism1.is_tecrubesi(tecrubem1);
        String[] referans1={"Ali Veli","Yusuf Abdal"};
        muhendism1.referanslar(referans1);
        muhendism1.calis();
        System.out.println("");
        
        muhendism2.adli_sicil_sorgula();
        muhendism2.askerlik_durumu();
        System.out.println(muhendism2.mezuniyet_ortalamasi(3.97));
        String[] tecrubem2={"Aselsan","Havelsan"};
        String[] referans2={};
        muhendism2.is_tecrubesi(tecrubem2);
        ((Mmuhendis)muhendism2).referanslar(referans2); //Imuhendis kullanıldığı için
        
        
        
    }
    
}
