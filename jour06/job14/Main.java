package jour06.job14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier n inférieur ou égal à 9:");
        int n = scanner.nextInt();

        if (n <= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Le nombre saisi est supérieur à 9. Veuillez saisir un nombre inférieur ou égal à 9.");
        }

        scanner.close();
    }
}
