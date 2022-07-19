import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s1= new Scanner(System.in);
        System.out.println("Urun Fiyatini Giriniz");
        int kdvsizFiyat = s1.nextInt();
        if(kdvsizFiyat<1000){
            double kdvMiktar = kdvsizFiyat*0.18;
            double kdvliFiyat = kdvsizFiyat+kdvMiktar;
            System.out.println("Urunun kdv dahil fiyati = "+ kdvliFiyat);
        }
        else{
            double kdvMiktar = kdvsizFiyat*0.8;
            double kdvliFiyat = kdvsizFiyat+kdvMiktar;
            System.out.println("Urunun kdv dahil fiyati = "+ kdvliFiyat);
        }

    }
}