import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        int number = input.nextInt();
        int tempNumber = number;
        // basamak sayısı bulma işlemi
        int numberCounter =0;
        int basValue ;

        int result =0;
        while (tempNumber !=0){
            tempNumber/=10;
            numberCounter++;
        }
        tempNumber =number;
        System.out.println("Basamak Sayisi : " + numberCounter);
        while (tempNumber !=0){
            basValue = tempNumber %10;
            int basPow =1;
             for(int i =1;i<=numberCounter;i++){
                basPow *=basValue;
            }
            result += basPow;
            tempNumber/=10;
        }
        if(result==number){
            System.out.println(number+" Armstrong Sayidir");

        }else {
            System.out.println(number+" Armstrong Sayi Degildir");
        }

    }
}
