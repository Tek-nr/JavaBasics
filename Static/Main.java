public class Main {

    public static void main(String[] args) {
        Seyirci seyirci1= new Seyirci("Hilal Akyaka");
        seyirci1.oyun_seyret();
        System.out.println("Seyirci Sayısı: "+ Seyirci.getSeyirci_sayisi());
        System.out.println();
        Seyirci seyirci2= new Seyirci("Feyza Alişer");
        seyirci2.oyun_seyret();
        System.out.println("Seyirci Sayısı: "+Seyirci.getSeyirci_sayisi());
        System.out.println();
        Seyirci seyirci3=new Seyirci("Ahmet Çalıklı");
        seyirci3.oyun_seyret();
        System.out.println("Seyirci Sayısı: "+ seyirci3.getSeyirci_sayisi());
        
        System.out.println(Math.abs(-89));
        
    }
    
}
