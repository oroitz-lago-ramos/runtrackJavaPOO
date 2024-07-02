package jour06.job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Entrez un entier: \n");
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt(); 
        }

        double average = sum / 5.0;
        System.out.println("La moyenne est: " + average);

        scanner.close();
    }
}
