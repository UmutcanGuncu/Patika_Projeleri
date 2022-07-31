import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        int number = 0;
        while (number %2 ==0){
            System.out.println("Lutfen Cift Sayi Giriniz");
            number = input.nextInt();
            if(number%4==0){
                sum += number;
            }
        }
        System.out.println("Dordun Katlari Olan Sayilarin Toplami"+sum);
    }
}
