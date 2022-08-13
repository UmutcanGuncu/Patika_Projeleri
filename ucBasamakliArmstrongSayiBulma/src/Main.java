import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int armstrongMu=100;armstrongMu<=999;armstrongMu++){
            int sayi = armstrongMu;
            int numberCounter=0;
            int basPow;
            int basValue;
            int result =0;
            int tempNumber = armstrongMu;
            while (tempNumber!=0){
                tempNumber/=10;
                numberCounter++;

            }
            tempNumber=armstrongMu;
            while (tempNumber!=0){
                basValue = tempNumber %10;
                basPow =1;
                for (int i =1;i<=numberCounter;i++){
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber/=10;
                }
            if (armstrongMu==result){
                System.out.println(armstrongMu);
            }

        }
    }
}
