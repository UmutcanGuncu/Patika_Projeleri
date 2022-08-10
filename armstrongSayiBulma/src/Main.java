import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        int number = input.nextInt();
        int tempNumber = number;
        int numberCounter =0; // basamak sayısı
        while (tempNumber !=0){
            tempNumber/=10;
            numberCounter++;
        }

    }
}
