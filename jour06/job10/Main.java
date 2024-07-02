package jour06.job10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrez votre age: ");
        int age = scanner.nextInt();
        scanner.close();

        if (age < 18) {
            System.out.println("Vous etes mineur.");
        } else {
            System.out.println("Vous etes majeur.");
        }
    }
}
