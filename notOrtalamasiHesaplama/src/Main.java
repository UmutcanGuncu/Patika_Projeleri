import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Math Grade");
        int  math= s1.nextInt();
        System.out.println("Enter Physics Grade");
        int physics = s1.nextInt();
        System.out.println("Enter Chemistry  Grade");
        int  chemistry = s1.nextInt();
        System.out.println(math);
        System.out.println("Enter Biology Grade");
        int biology = s1.nextInt();
        int gradeAverage= (math+physics+chemistry+biology)/4;
        String result = (gradeAverage >= 60) ? "You Passed": "You Stayed";
        System.out.println("Grade Avarege = " + gradeAverage +" Result =  "+ result);
    }
}