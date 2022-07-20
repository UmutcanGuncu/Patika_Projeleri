import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notu");
        double mathGrade = input.nextDouble();
        if (mathGrade<0 || mathGrade>100)
            mathGrade=0;
        System.out.println("Biyoloji Notu");
        double bioGrade = input.nextDouble();
        if(bioGrade<0||bioGrade>100)
            bioGrade=0;
        System.out.println("Kimya Notu");
        double chemGrade = input.nextDouble();
        if(chemGrade<0||chemGrade>100)
            chemGrade=0;
        System.out.println("Muzik Notu");
        double musicGrade = input.nextDouble();
        if(musicGrade<0||musicGrade>100)
            musicGrade=0;
        double average = (mathGrade+bioGrade+chemGrade+musicGrade)/4;
        System.out.println("Ortalama = "+ String.format("%.2f",average));
        if(average<55)
        {
            System.out.println("Kaldiniz");
        }
        else {
            System.out.println("Gectiniz");
        }

    }
}
