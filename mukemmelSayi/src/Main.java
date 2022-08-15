import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz : ");
        int n = input.nextInt();
        int toplam =0;
        for (int i = 1; i<n;i++){
            if(n%i==0){
                toplam +=i;
            }
        }
        if(toplam==n){
            System.out.println("Mukemmel Sayi");
        }else {
            System.out.println("Mukemmel Sayi Degil");
        }
    }
}
