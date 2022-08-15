import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                }
            }
            if (asalMi) {
                System.out.print(i + ", ");
            }
        }
    }
}
