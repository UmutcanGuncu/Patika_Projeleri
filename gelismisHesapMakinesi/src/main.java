import java.util.Scanner;

public class main  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1- Toplama Islemi\n" +
                "2- Cikarma Islemi\n" +
                "3- Carpma Islemi\n" +
                "4- Bolme Islemi\n" +
                "5- Uslu Sayi Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdortgen Alan ve Cevre Hesabı");
        System.out.print("Hangi İslemi Yapmak İstediginizi Seciniz => ");
        int number = input.nextInt();
        switch (number){
            case 1:
                topla();
                break;
            case  2:
                cikar();
                break;
            case  3:
                carp();
                break;
            case  4 :
                bol();
                break;
            case  5 :
                usHesaplama();
                break;
            case  6:
                faktoriyelHesapla();
                break;
            case  7:
                modAl();
                break;
            case  8:
                dikdortgenHesapla();
                break;
            default:
                System.out.println("Gecersiz Sayi Girdiniz");
        }

    }
    public  static  void topla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz => ");
        int n1= input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz => ");
        int n2= input.nextInt();
        System.out.println("Sonuc => " + (n1+n2));

    }
    public  static  void cikar(){
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz => ");
        int n1= input.nextInt();
        System.out.print("Ikınci Sayiyi Giriniz => ");
        int n2= input.nextInt();
        System.out.println("Sonuc => " + (n1-n2));
    }
    public  static  void carp(){
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz => ");
        int n1= input.nextInt();
        System.out.print("Ikınci Sayiyi Giriniz => ");
        int n2= input.nextInt();
        System.out.println("Sonuc => " + (n1*n2));
    }
    public  static  void bol(){
        Scanner input =new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz => ");
        int n1= input.nextInt();
        System.out.print("Ikınci Sayiyi Giriniz => ");
        int n2= input.nextInt();
        if(n2!=0)
        System.out.println("Sonuc => " + (n1/n2));
        else
            System.out.println("Payda Sıfırdan Farkli Olmali");
    }
    public static  void usHesaplama(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tabani Giriniz => ");
        int taban = input.nextInt();
        System.out.print("Ussu Giriniz => ");
        int us = input.nextInt();
        int tempNumber = taban;
        if(us!=0){
            for (int i = 1 ;i<us;i++)
            {
                taban *= tempNumber;
            }
            System.out.println("Sonuc => " + taban);
        }else
            System.out.println(1);
    }
    public  static  void faktoriyelHesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }


    public static  void modAl(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz =>");
        int n1 = input.nextInt();
        System.out.print("Hangi Sayiya Gore Mod Alinacagini Giriniz => ");
        int n2 =input.nextInt();
        int sonuc = n1%n2;
        System.out.println("Sonuc => " + sonuc);
    }
    public static  void dikdortgenHesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdortgenin Kisa Kenarini Giriniz => ");
        int kisaKenar = input.nextInt();
        System.out.print("Dikdortgenin Uzun Kenarini Giriniz => ");
        int uzunKenar = input.nextInt();
        int alan = kisaKenar*uzunKenar;
        int cevre=2*(kisaKenar+uzunKenar);
        System.out.println("Dikdortgenin Alani => " + alan);
        System.out.println("Dikdortgenin Cevresi => " + cevre);
    }

}
