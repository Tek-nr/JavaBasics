package ınterfaces;
public class Mmuhendis implements Imuhendis,Icalis {

    @Override
    public void calis() {
        System.out.println("Muhendis çalışıyor...");
    }

    boolean askerlik;
    boolean adli_sicil;

    public Mmuhendis(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void askerlik_durumu() {
        if(askerlik)
            System.out.println("Askerliğimi Yaptım...");
        else
            System.out.println("Askerliğimi Henüz Yapmadım...");
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam: "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicilim var...");
        }
        else
            System.out.println("Adli sicilim yok...");
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("");
        System.out.println("Makine Mühendisi Olarak Şu Şirketlerde Çalıştım;");
        for(String s:array)
            System.out.println(s);
    }
    
    public void referanslar(String[]array){
        if (array.length==0)
            System.out.println("Referansım bulunmamaktadır.");
        else{
            System.out.println("");
            System.out.println("Referanslarım;");
            for(String s:array)
                System.out.println(s);
        }
    }

    public boolean isAskerlik() {
        return askerlik;
    }

    public void setAskerlik(boolean askerlik) {
        this.askerlik = askerlik;
    }

    public boolean isAdli_sicil() {
        return adli_sicil;
    }

    public void setAdli_sicil(boolean adli_sicil) {
        this.adli_sicil = adli_sicil;
    }
    
}
