package jour06.job15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Veuillez saisir un nombre entier n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String numberString = Integer.toString(n);
        String inversedNumber = "";

        for (int i = numberString.length() - 1; i >= 0; i--) {
            inversedNumber += numberString.charAt(i);
        }

        System.out.println("Le nombre " + n + " inversé est " + inversedNumber);
        
    }
}
