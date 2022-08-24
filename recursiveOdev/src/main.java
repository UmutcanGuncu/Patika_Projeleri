import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Degerini Giriniz => ");
        int taban = input.nextInt();
        System.out.print("Us Degerini Giriniz => ");
        int us = input.nextInt();
        System.out.println("Sonuc => " + usHesapla(taban,us));
    }
    public static int usHesapla(int taban,int us){
     if(us==0)
         return 1;
     else {
         return taban*usHesapla(taban,us-1);
     }
    }
}
