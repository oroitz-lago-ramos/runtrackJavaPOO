package jour06.job13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier n:");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
