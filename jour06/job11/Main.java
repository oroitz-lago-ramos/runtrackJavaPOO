package jour06.job11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculons la factorielle de 8....");
        int n = 8;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println("Etape " + i + ": " + fact);
        }

        System.out.println("La factorielle de 8 est: " + fact);
    }
}
