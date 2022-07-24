import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year ;
        System.out.print("Yili Girin : ");
        year = input.nextInt();

        if(year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.print(year + " Artik Yıl ");
            }
            else {
                System.out.print(year + " Artik Yil Degil ! ");
            }
        } else if (year % 4 == 0 ) {
            System.out.print(year + " Artik Yıl ");
        } else {
            System.out.print(year + " Artik Yil Degil ! ");
        }
    }
    }

