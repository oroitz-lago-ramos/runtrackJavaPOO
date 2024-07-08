package jour07.job04;

public class GestionVehicules {
    public static void main(String[] args) {
        Vehicule v1 = new Vehicule("Renault", "01/01/2020", 20000);
        v1.afficher();

    }
}

class Vehicule {
    // ➔ sa marque ;
    // ➔ sa date d'achat ;
    // ➔ son prix d'achat ;
    // ➔ son prix courant.

    public String marque;
    public int dateAchat;
    public double prixAchat;
    public double prixCourant;

    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void afficher() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat);
        if (prixCourant != 0) {
            System.out.println("Prix courant : " + prixCourant);
        } else {
            System.out.println("Prix courant : Non calculé");
        }
    }

    public void calculePrix(int anneeActuelle) {
        int depreciation = 0;
        int age = anneeActuelle - dateAchat;

        depreciation = prixAchat * 0.01 * age;
        // fixe le prix courant au prix d'achat moins 1% par année (entre la date
        // d'achat et la date actuelle).
        this.prixCourant = prixAchat - depreciation;
    }
}

class Voiture extends Vehicule {
    public int cilindree;
    public int nbPortes;
    public int puissance;
    public int kilometrage;

    public Voiture(String marque, int dateAchat, double prixAchat, int cilindree, int nbPortes, int puissance,
            int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cilindree = cilindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Cilindrée : " + cilindree);
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Puissance : " + puissance);
        System.out.println("Kilométrage : " + kilometrage);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        double depreciation = 0;
        int age = anneeActuelle - dateAchat;
        int tranchesKm = this.kilometrage / 10000;

        depreciation = (prixAchat * 0.02 * age) + (tranchesKm * 0.05);

        if (this.marque.equalsIgnoreCase("Renault") || this.marque.equalsIgnoreCase("Fiat")) {
            depreciation += 0.10;
        } else if (this.marque.equalsIgnoreCase("Ferrari") || this.marque.equalsIgnoreCase("Porsche")) {
            depreciation += 0.20;
        }

        this.prixCourant = this.prixAchat - (this.prixAchat * depreciation) >= 0 ? this.prixAchat
                - (this.prixAchat * depreciation) : 0;

    }
}

class Avion extends Vehicule {
    public String typeMoteur;
    public int nbHeuresVol;

    public Avion(String marque, int dateAchat, double prixAchat, String typeMoteur, int nbHeuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.nbHeuresVol = nbHeuresVol;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type de moteur : " + typeMoteur);
        System.out.println("Nombre d'heures de vol : " + nbHeuresVol);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        double depreciation = 0;

        int age = anneeActuelle - this.dateAchat;

        if ("hélices".equalsIgnoreCase(this.typeMoteur)) {
            depreciation += (this.nbHeuresVol / 100) * 0.10;
        } else {
            depreciation += (this.nbHeuresVol / 1000) * 0.10;
        }

        this.prixCourant = this.prixAchat * (1 - depreciation) >= 0 ? this.prixAchat * (1 - depreciation) : 0;

    }
}
