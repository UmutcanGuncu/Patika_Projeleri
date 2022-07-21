import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayiyi Giriniz");
        int firstNumber = input.nextInt();
        System.out.println("2. Sayiyi Giriniz");
        int secondNumber = input.nextInt();
        System.out.println("3. Sayiyi Giriniz");
        int thirdNumber = input.nextInt();
        if(firstNumber==secondNumber || firstNumber==thirdNumber ||secondNumber==thirdNumber){
            System.out.println("Sayilar Birbirine Esit Olmamalidir");
        }
        else if (firstNumber>secondNumber&&secondNumber>thirdNumber&&firstNumber>thirdNumber){
            System.out.println(firstNumber+">"+secondNumber+">"+thirdNumber);
        } else if (firstNumber>secondNumber&&firstNumber>thirdNumber &&thirdNumber>secondNumber) {
            System.out.println(firstNumber+">"+thirdNumber+">"+secondNumber);
        } else if (secondNumber>firstNumber&&secondNumber>thirdNumber&&firstNumber>thirdNumber) {
            System.out.println(secondNumber+">"+firstNumber+">"+thirdNumber);
        } else if (secondNumber>firstNumber&&secondNumber>thirdNumber&&thirdNumber>firstNumber) {
            System.out.println(secondNumber+">"+thirdNumber+">"+firstNumber);
        } else if (thirdNumber>firstNumber&&thirdNumber>secondNumber&&firstNumber>secondNumber) {
            System.out.println(thirdNumber+">"+firstNumber+">"+secondNumber);
        } else if (thirdNumber>firstNumber&&thirdNumber>secondNumber&&secondNumber>firstNumber) {
            System.out.println(thirdNumber+">"+secondNumber+">"+firstNumber);
        }

    }
}
