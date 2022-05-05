package elektronikfirmasi;

import java.util.Scanner;

public class ElektronikFirmasi {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in, "ISO-8859-9");
        Urunler urun = new Urunler();
        urun.Listele();

        System.out.print("Satmak İstediğiniz Ürünü Giriniz: ");
        String satin_al = giris.nextLine();
        urun.setUrunAdi(satin_al);
        urun.SatinAl(urun.getUrunAdi());

        System.out.print("Üreticiden Almak İstediğiniz Ürünü Giriniz: ");
        String alim_yap = giris.nextLine();
        urun.setUrunAdi(alim_yap);
        urun.AlimYap(urun.getUrunAdi());

        for (String eleman : urun.urunler) {
            if (eleman.equals(satin_al)) {
                System.out.println(satin_al + " ürünü satın alındı.");
            } 
        }
        
        for (String eleman : urun.urunler) {
            if (eleman.equals(alim_yap)) {
                System.out.println(alim_yap + " ürünü üreticiden alındı.");
            } 
        }

    }

}
