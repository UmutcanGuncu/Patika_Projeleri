import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n = input.nextInt();
        int f1=0;
        int f2=1;
        int total =0;
        for(int i =1 ; i<=n;i++){
            total=f1+f2;
            System.out.println(f1 + "+" + f2 + "=" + total);
            f1=f2;
            f2=total;
        }

    }
}
