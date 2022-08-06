import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyelinin Hesaplanmasini Istediginiz Sayiyi Giriniz : ");
        int faktorielSayisi = input.nextInt();
        int sonuc =1;
        for (int i =1;i<=faktorielSayisi;i++){
        sonuc = sonuc*i;
        }
        System.out.println(sonuc);
        //Kombinasyon Hesaplama
        System.out.print("Birinci Sayiyi Girin (N degerini) : ");
        int n = input.nextInt();
        System.out.print("İkinci Sayiyi Girin (R degerini): ");
        int r = input.nextInt();
        int pay =1;
        for (int i =1;i<=n;i++){
            pay = pay*i;
        }
        int payda1 =1;
        for (int i =1;i<=r;i++){
            payda1 = payda1*i;
        }
       int nEksiR = n-r;
        int payda2 =1;
        for (int i =1;i<=nEksiR;i++){
            payda2 = payda2*i;
       }
        double kombinasyonSonuc = pay/(payda1*payda2);

        System.out.println("Kombinasyonun Sonucu : " + kombinasyonSonuc );
    }
}
