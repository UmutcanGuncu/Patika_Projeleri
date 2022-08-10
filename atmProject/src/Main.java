import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "umutcan";
        String password = "birdenyediyekadar";
        String tempUserName;
        String tempPassword;
        Scanner input = new Scanner(System.in);
        boolean onay = false;
        int sayac =0;
        int balance =10000;
        while(onay==false&&sayac<=3){
            System.out.print("Lutfen Kullanici Adini Giriniz : ");
            tempUserName=input.next();
            System.out.print("Lutfen Sifrenizi Giriniz : ");
            tempPassword=input.next();
            if(tempUserName.equals(userName)&&tempPassword.equals(password)){
            onay=true;
            }else {
                System.out.println("Kullanici Adi veya Sifre Yanlis. Lutfen Tekrar Deneyiniz");
                sayac++;
            }
        }
        if(onay==true&&sayac<=3){
            //Switch Case Bölümü
            System.out.println("Bankamiza Hosgeldiniz. Lutfen Yapmak Istediginiz Islemi Seciniz");
            System.out.println("1-Para Yatirma \n"+"2-Para Cekme \n"+"3-Bakiye Sorgula \n"+"4-Cikis Yap");
            int islem = input.nextInt();
            switch (islem){
                case 1 :
                    System.out.println("Para Yatirma Miktarini Giriniz");
                    int miktar = input.nextInt();
                    balance += miktar;
                    System.out.println("Bakiyeniz : "+ balance);
                        break;
                case 2 :
                    System.out.println("Kac Lira Cekmek Istersiniz?");
                     miktar = input.nextInt();
                     if(balance>=miktar){
                         balance -= miktar;
                         System.out.println("Kalan Bakiye : " + balance);
                     }else {
                         System.out.println("Hesabinizda Yeterince Para Yok :(");
                     }
                     break;
                case  3:
                    System.out.println("Bakiyeniz : " +balance );
                    break;
                case 4:
                    System.out.println("Saglikli Gunler Dileriz");
                    break;
            }
        } else if (sayac>3) {
            System.out.println("Hesabiniz Bloke Edilmistir");
        }
    }
}
