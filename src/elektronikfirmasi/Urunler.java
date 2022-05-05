package elektronikfirmasi;

import java.util.Arrays;

public class Urunler extends Elektronik {
    String [] urunler = {"Akıllı Saat", "Powerbank", "Telefon", "Tablet", 
        "Kulaklık", "Televizyon", "Projeksiyon Cihazı", "Yazıcı", "Klavye"};

    public void Listele(){
            System.out.println("Elektronik Ürünlerimiz : " + Arrays.toString(urunler)+"\n");
    }
    
    public void SatinAl(String satin_alinacak_urun){
            System.out.println(satin_alinacak_urun+" ürünü satın alındı.");
    }
    
    public void AlimYap (String alim_yapilacak_urun){
            System.out.println(alim_yapilacak_urun+" ürünü üreticiden alındı.");
    }
    
}