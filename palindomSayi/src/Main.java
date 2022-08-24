import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz => ");
        int number = input.nextInt();
        System.out.println(isPalindrom(number));
    }
    static boolean isPalindrom(int number){
        int tempNumber = number, reverseNumber=0,lastNumber ;
        while(tempNumber!=0){
            lastNumber=tempNumber%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            tempNumber/=10;
        }
        if(reverseNumber==number)
            return true;
        else
            return  false;
    }
}
