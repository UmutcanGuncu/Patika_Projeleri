import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Havanin Kac Derece Oldugunu Giriniz");
        int celcius = input.nextInt();
        if (celcius>25)
        {
            System.out.println("Yuzmeye Gidebilirsin");
        } else if ( 15<celcius && celcius<=25 ) {
            System.out.println("Piknige Gidebilirsin");
        } else if (5<celcius && celcius<=15) {
            System.out.println("Sinemaya Gidebilirsin");
        }
        else {
            System.out.println("Kayaga Gidebilirsin");
        }
    }
}
