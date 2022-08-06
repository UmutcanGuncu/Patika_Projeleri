import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Degerini Giriniz :");
        int taban = input.nextInt();
        int tabanTemp=taban;
        System.out.print("Us Degerini Giriniz :");
        int us = input.nextInt();
        for (int i =2;i<=us;i++){
            taban*=tabanTemp;
            }
         if (us == 0){
            System.out.println("Sonuc : 1");
        }else{
            System.out.println(taban);
        }
        //İkinci ve daha Basit Yöntem
        int sonuc = 1;
        for (int i=0;i<us;i++)
        {
            sonuc *=taban;
        }
        System.out.println(sonuc);

    }
}
