package jour07.job01;

public class Toto {
    public static int toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();

        System.out.println(toto);
    }
}

// L'erreur ici est que la variable toto est une variable d'instance, et non une variable de classe.
// Si on le met en statique le résultat est deux parceque en creant des instance on incremente la variable toto.