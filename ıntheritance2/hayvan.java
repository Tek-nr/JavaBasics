package ıntheritance2;
public class hayvan {

private String isim;
private int kilo;
private int boy;
private int bacaksayisi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacaksayisi() {
        return bacaksayisi;
    }

    public void setBacaksayisi(int bacaksayisi) {
        this.bacaksayisi = bacaksayisi;
    }

public hayvan(String isim,int kilo,int boy,int bacaksayisi){
    this.isim=isim;
    this.kilo=kilo;
    this.boy=boy;
    this.bacaksayisi=bacaksayisi;
}
public void yemek_ye(){
    System.out.println("Hayvan şu an yemek yiyor...");
}

public void hareket(int hız){
    System.out.println("Hayvan "+hız+ " km hız ile hareket ediyor...");
}
}
