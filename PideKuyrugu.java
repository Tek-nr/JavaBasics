package pidekuyrugu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PideKuyrugu {
    public static void main(String[] args) throws InterruptedException {
        Random random=new Random();
        int pide_sayisi= 1+random.nextInt(10);
        
        double ekmek= Math.random();
        Queue<String> pide= new LinkedList<>();
        pide.offer("Ayşe");
        pide.offer("Ali");
        pide.offer("Veli");
        pide.offer("Utku");
        pide.offer("Tutku");
        pide.offer("Rutkay");
        pide.offer("Yalın");
        pide.offer("Şeyda");
        pide.offer("Zarife");
        pide.offer("Latife");
        System.out.println("Pideler Çıktı...");
        System.out.println("Pide sayısı: "+pide_sayisi);
        Thread.sleep(2000);
        while(pide_sayisi!=0){
            System.out.println(pide.poll()+" pide aldı...");
            pide_sayisi--;
            Thread.sleep(1000);
        }
        System.out.println("Pide kalmadı...");
    }
    
}
