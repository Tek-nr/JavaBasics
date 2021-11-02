public class Seyirci {
    private String isim;
    private static int seyirci_sayisi=0;
    public Seyirci(String isim){
        this.isim=isim;
        seyirci_sayisi++;
    }
    public void oyun_seyret(){
        System.out.println(isim+ " oyunu izliyor...");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public static int getSeyirci_sayisi() {
        return seyirci_sayisi;
    }

    public static void setSeyirci_sayisi(int seyirci_sayisi) {
        Seyirci.seyirci_sayisi = seyirci_sayisi;
    }
    
}
