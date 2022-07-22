import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi Giriniz");
        int mesafe =input.nextInt();
        while (mesafe<0){
            System.out.println("Mesafe 0'dan Kucuk Olamaz. Lutfen Mesafeyi Yeniden Giriniz");
            mesafe =input.nextInt();
        }
        System.out.println("Yolcunun Yasini Giriniz");
        int yas = input.nextInt();
        while (yas<0){
            System.out.println("Yas 0'dan Kucuk Olamaz. Lutfen Yasinizi Yeniden Giriniz");
            yas = input.nextInt();
        }
        System.out.println("Yolculuk Tipini Giriniz (1 => Tek Yon , 2 => Gidis Donus) ");
        int yolculukTipi = input.nextInt();
        while (yolculukTipi!=1 && yolculukTipi!=2){
             System.out.println("Hatali Veri Girdiniz");
             System.out.println("Yolculuk Tipini Giriniz (1 => Tek Yon , 2 => Gidis Donus) ");
             yolculukTipi=input.nextInt();
         }
        if(yolculukTipi==1)
        {
            double biletFiyati = mesafe*0.85;
            if(yas<12){
                double indirimTutari = biletFiyati*0.5;
                biletFiyati = biletFiyati-indirimTutari;
                System.out.println("Toplam Tutar = " + biletFiyati + "Tl");
                //
            } else if (yas<24) {
                double indirimTutari = biletFiyati*0.1;
                biletFiyati = biletFiyati-indirimTutari;
                System.out.println("Toplam Tutar = " + biletFiyati + " Tl");
                //
            } else if (yas>65) {
                double indirimTutari = biletFiyati*0.3;
                biletFiyati = biletFiyati-indirimTutari;
                System.out.println("Toplam Tutar = " + biletFiyati + " Tl");
                //
            }
            else {
                System.out.println("Toplam Tutar = " + biletFiyati + " Tl");
                //
            }
        } else if (yolculukTipi==2) {
            double biletFiyati = (mesafe*0.85)*2;
            if(yas<12){
                double indirimTutari = biletFiyati*0.5;
                biletFiyati = biletFiyati-indirimTutari;
                double gidisDonusIndirimi = biletFiyati*0.2;
                biletFiyati = biletFiyati-gidisDonusIndirimi;
                System.out.println("Toplam Tutar = " + biletFiyati + " Tl");
                //Bedavaya Ucuyorlar :D
            } else if (yas<24) {
                double indirimTutari = biletFiyati*0.1;
                biletFiyati = biletFiyati-indirimTutari;
                double gidisDonusIndirimi = biletFiyati*0.2;
                biletFiyati = biletFiyati-gidisDonusIndirimi;
                System.out.println("Toplam Tutar = " + biletFiyati + "Tl");
                //
            } else if (yas>65) {
                double indirimTutari = biletFiyati*0.3;
                biletFiyati = biletFiyati-indirimTutari;
                double gidisDonusIndirimi = biletFiyati*0.2;
                biletFiyati = biletFiyati-gidisDonusIndirimi;
                System.out.println("Toplam Tutar = " + biletFiyati + "Tl");
                //
            }
            else {
                double gidisDonusIndirimi = biletFiyati*0.2;
                biletFiyati = biletFiyati-gidisDonusIndirimi;
                System.out.println("Toplam Tutar = " + biletFiyati + "Tl");
                //Digerlerinin %20 indirimi indirimli bilet tutari üzerinden :D

            }
        }

    }
}
