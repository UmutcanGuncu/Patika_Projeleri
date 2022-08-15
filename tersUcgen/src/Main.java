import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satir Sayisini Giriniz : ");
        int n = input.nextInt();
        for (int i = n;i>0;i--){
            for (int j =n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
