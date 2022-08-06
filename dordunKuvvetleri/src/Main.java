import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Girilen sayıya kadar 4 ve 5 'in kuvvetlerini yazan program
        Scanner input = new Scanner(System.in);
        System.out.print("N Degerini Giriniz:");
        int n = input.nextInt();
        System.out.println("Girilen Sayiya Kadar Dordun Kuvvetleri");
        for (int i =1;i<=n;i*=4){

            System.out.print(i + " ");

        }
        System.out.println(" ");
        System.out.println("Girilen Sayiya Kadar Besin Kuvvetleri");
        for (int i =1 ;i<=n;i*=5){

            System.out.print(i+" ");
        }

    }
}
