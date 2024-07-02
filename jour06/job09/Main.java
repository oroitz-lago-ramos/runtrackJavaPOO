package jour06.job09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier n: ");
        int n = scanner.nextInt();
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println("La somme des " + n + " premiers cubes est: " + sum);
        scanner.close();
    }
}
