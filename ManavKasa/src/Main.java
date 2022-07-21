package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Elma Kilogramini Giriniz");
        int apple = input.nextInt();
        System.out.println("Armut Kilogramini Giriniz");
        int pear = input.nextInt();
        System.out.println("Domates Kilogramini Giriniz");
        int tomato = input.nextInt();
        System.out.println("Muz Kilogramini Giriniz");
        int banana = input.nextInt();
        System.out.println("Patlican Kilogramini Giriniz");
        int aubergine = input.nextInt();
        double appleKgPrice = 3.67;
        double pearKgPrice = 2.14;
        double tomatoKgPrice = 1.11;
        double bananaKgPrice = 0.95;
        double aubergineKgPrice = 5.00;
        double totalPrice = (appleKgPrice * apple + pearKgPrice * pear + tomatoKgPrice * tomato + bananaKgPrice * banana
                + aubergineKgPrice * aubergine);

        System.out.println("Total Price = " + String.format("%.2f", totalPrice) + " TL");


    }
}
