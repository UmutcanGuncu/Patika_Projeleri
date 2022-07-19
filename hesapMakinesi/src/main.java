package src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak Istediginiz Islemi Yaziniz");
        String islem = input.next();
        System.out.println("1.Sayiyi Giriniz");
        int number1 = input.nextInt();
        System.out.println("2.Sayiyi Giriniz");
        int number2 = input.nextInt();
        switch (islem)
        {
            case "Toplama":
                System.out.println(number1+number2);
                break;
            case "Cikarma":
                System.out.println(number1-number2);
                break;
            case  "Carpma":
                System.out.println(number1*number2);
                break;
            case  "Bolme":
                if (number2!=0){
                    System.out.println(number1/number2);
                }else {
                    System.out.println("Payda 0 Olamaz");
                }
            default:
                System.out.println("Geçersiz Değer Girdiniz");
        }
    }
}
