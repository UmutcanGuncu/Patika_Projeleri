import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result =0.00;
        System.out.print("Harmonik Serisini Bulmak Istedigiinz Sayiyi Giriniz : ");
        int number = input.nextInt();
        for (int i = 1;i<=number;i++){
            result += (1.0/i);
        }
        System.out.println(result);
    }
}
