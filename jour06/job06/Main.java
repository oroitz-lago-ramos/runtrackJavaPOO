package jour06.job06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez trois nombres: \n");
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 3; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Le plus grand nombre est: " + max);

    }
}
