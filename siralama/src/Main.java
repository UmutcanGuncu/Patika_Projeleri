import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Sayi Gireceginizi Yaziniz : ");
        int counter = input.nextInt();
        int number,max=1,min=1;
        for(int i = 1 ; i<=counter;i++){
            System.out.print(i+". Sayiyi Giriniz : ");
            number=input.nextInt();
            if(i==1){
                max=number;
                min = number;
            } if (number>max) {
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.println("En Buyuk Sayi : "+max);
        System.out.println("En Kucuk Sayi : "+min);
    }

}
