import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz");
        int birthYear = input.nextInt();
        if(birthYear%12==0){
            System.out.println("Maymun");
        } else if (birthYear%12==1) {
            System.out.println("Horoz");
        }else if (birthYear%12==2) {
            System.out.println("Kopek");
        }else if (birthYear%12==3) {
            System.out.println("Domuz");
        }else if (birthYear%12==4) {
            System.out.println("Fare");
        }else if (birthYear%12==5) {
            System.out.println("Okuz");
        }else if (birthYear%12==6) {
            System.out.println("Kaplan");
        }else if (birthYear%12==7) {
            System.out.println("Tavsan");
        }else if (birthYear%12==8) {
            System.out.println("Kopek");
        }else if (birthYear%12==9) {
            System.out.println("Yilan");
        }else if (birthYear%12==10) {
            System.out.println("At");
        }else if (birthYear%12==11) {
            System.out.println("Koyun");
        }


    }
}
