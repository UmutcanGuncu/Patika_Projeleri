import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N1 Sayisini Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("N2 Sayisini Giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        /*
        //Ebob Bulma
        if (n1 > n2) {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
        } else {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }

            }
        }
        System.out.println(ebob);
        //Ekok Bulma

        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            } */
        //While Dönügüsü İle Ebob Ekok Bulma

        //While İle Ebob Bulma
        int i = 1;
        if (n1 > n2) {
            while (n2 != i) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

        } else {
            while (n1 != i) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println(ebob);

        //While ile ekok Bulma
        int j = 1;
        int ekok =1;
        while (j > 0) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;

        }
        System.out.println(ekok);

    }
}

