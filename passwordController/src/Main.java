import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        String answer ="Hayir";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Username");
        userName = input.next();
        System.out.println("Enter the Password");
        password =input.next();
        System.out.println("Hesabiniz Basariyla Olusturuldu");
        System.out.println("Please Login");
        Boolean girdiMi = false;
        while(girdiMi==false&&answer.equals("Hayir"))
        {
            String tempUserName, tempPassword;
            System.out.println("Enter the Username");
            tempUserName = input.next();
            System.out.println("Enter the Password");
            tempPassword = input.next();
            if(tempPassword.equals(password)&&tempUserName.equals(userName))
            {
                girdiMi=true;
                System.out.println("Basariyla Giris Yaptiniz");
            }
            else{
                System.out.println("Sifreniz Yanlis. Sifrenizi Sifirlamak Ister Misiniz(Evet/Hayir)");
                answer = input.next();
                continue;
           }
        }
        while (girdiMi==false&&answer.equals("Evet")){
            System.out.println("Enter the Password");
            String tempPassword1 =input.next();
            if(password.equals(tempPassword1))
            {
                System.out.println("Eski Sifreniz Ile Ayni Lutfen Baska Sifre Giriniz");

            }
            else {

                System.out.println("Sifreniz Basariyla Degistirilmistir");
                password=tempPassword1;
                answer =" ";
            }
        }

    }
}
