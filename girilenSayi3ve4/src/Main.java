import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sayiyi Giriniz");
        int k=input.nextInt();
        int sum = 0;
        int adet =0;
        for (int i =1;i<=k;i++){
            if(i%3==0&&i%4==0){
                sum =+i;
                adet++;
            }
        }
        if(adet==0){
            System.out.println("3 e ve 4  e bolunen sayilarin ortalamasi = 0" );
        }else {
            double sonuc = sum/(adet-1);
            System.out.println("3 e ve 4  e bolunen sayilarin ortalamasi = " + sonuc);
        }
    }
}
