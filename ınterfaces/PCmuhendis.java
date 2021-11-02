package ınterfaces;
public class PCmuhendis implements Imuhendis {

    private boolean askerlik_durumu;
    private boolean adli_sicil_sorgulamasi;

    public PCmuhendis(boolean askerlik_durumu, boolean adli_sicil_sorgulamasi) {
        this.askerlik_durumu = askerlik_durumu;
        this.adli_sicil_sorgulamasi = adli_sicil_sorgulamasi;
    }            
    @Override
    public void askerlik_durumu() {
        if(askerlik_durumu){
            System.out.println("Askerliğimi Yaptim...");
        }
        else{
            System.out.println("Askerliğimi Henüz Yapmadım...");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam : "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil_sorgulamasi)
            System.out.println("Adli sicil kaydım var.");
        else
            System.out.println("Adli sicil kaydım yok.");
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("");
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerle çalıştım;");
        for(String s:array){
            System.out.println(s);
        }
    }

    public boolean isAskerlik_durumu() {
        return askerlik_durumu;
    }

    public void setAskerlik_durumu(boolean askerlik_durumu) {
        this.askerlik_durumu = askerlik_durumu;
    }

    public boolean isAdli_sicil_sorgulamasi() {
        return adli_sicil_sorgulamasi;
    }

    public void setAdli_sicil_sorgulamasi(boolean adli_sicil_sorgulamasi) {
        this.adli_sicil_sorgulamasi = adli_sicil_sorgulamasi;
    }
    
}
