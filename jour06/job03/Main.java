package jour06.job03;

public class Main {
    public static void main(String[] args) {
        // Création d'un tableau de 10 entiers
        int[] T = new int[10];

        // Remplissage du tableau avec les entiers de 0 à 9
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        // Affichage des valeurs demandées
        System.out.println("T[0] = " + T[0]); // Affiche 0
        System.out.println("T[1] = " + T[1]); // Affiche 1
        System.out.println("T[5] = " + T[5]); // Affiche 5
        System.out.println("T[9] = " + T[9]); // Affiche 9

        // T[10] provoquerait une ArrayIndexOutOfBoundsException car les indices vont de
        // 0 à 9
        try {
            System.out.println("T[10] = " + T[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("T[10] provoque une exception: ArrayIndexOutOfBoundsException");
        }
    }
}
