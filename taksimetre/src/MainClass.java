import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        double kmPrice = 2.20;
        double startPrice=10.00;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Lutfen Gittiğiniz Km'yi Giriniz");
        int kmAmount = s1.nextInt();
        double totalPrice = (startPrice+kmPrice*kmAmount);
        totalPrice= (totalPrice<20)?20:totalPrice;
        System.out.println("Toplam Odemeniz Gereken Tutar = "+totalPrice);

    }
}
