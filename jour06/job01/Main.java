public class Main {
    public static void main(String[] args) {
        // Déclaration des variables de chaque type
        char exempleChar = 'A';
        String exempleString = "Bonjour";
        int exempleInt = 100;
        long exempleLong = 12345678901L;
        float exempleFloat = 10.31f;
        boolean exempleBoolean = true;

        // Affichage des valeurs stockées
        System.out.println("Valeur char: " + exempleChar);
        System.out.println("Valeur string: " + exempleString);
        System.out.println("Valeur int: " + exempleInt);
        System.out.println("Valeur long: " + exempleLong);
        System.out.println("Valeur float: " + exempleFloat);
        System.out.println("Valeur boolean: " + exempleBoolean);

        // Tentative de stockage de 3.817 dans un int
        int TOTO = (int) 3.817;
        System.out.println("Valeur de TOTO: " + TOTO);
        // Ce code affichera 3 car la conversion d'un float à un int tronque la partie décimale.
    }
}
