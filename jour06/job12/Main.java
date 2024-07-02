package jour06.job12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier n pour calculer sa factorielle:");
        int n = scanner.nextInt();
        long factorial = 1; 

        for (int i = 1; i <= n; i++) {
            factorial *= i; 
        }

        System.out.println("La factorielle de " + n + " est: " + factorial);
        scanner.close();
    }
}
