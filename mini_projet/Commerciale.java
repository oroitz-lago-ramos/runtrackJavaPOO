package mini_projet;

import java.util.Vector;
import java.util.Scanner;

public class Commerciale {
    public Vector<Article> articles = new Vector<Article>();
    public Vector<Client> clients = new Vector<Client>();
    public Vector<Commande> commandes = new Vector<Commande>();
    public Vector<Ligne> lignes = new Vector<Ligne>();

    public void passerCommande(Commande c) {
        this.commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        this.commandes.remove(c);
    }

    public void ajouterArticle(Article a) {
        this.articles.add(a);
    }

    public void supprimerArticle(Article a) {
        this.articles.remove(a);
    }

    public void ajouterClient(Client c) {
        this.clients.add(c);
    }

    public void supprimerClient(Client c) {
        this.clients.remove(c);
    }

    public static void main(String[] args) {
        Commerciale commerciale = new Commerciale();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            afficherMenu();
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Veuillez entrer un nombre");
                scanner.nextLine();
                continue;
            }
            choixUtilisateur(option, commerciale, scanner);
        } while (option != 10);
        scanner.close();
    }

    public static void afficherMenu() {
        String text = "Gestion commerciale";

        int textLength = text.length();
        int lineWidth = textLength;

        for (int i = 0; i < lineWidth; i++) {
            System.out.print("-");
        }

        System.out.print(" " + text + " ");

        for (int i = 0; i < lineWidth; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < lineWidth - 4; i++) {
            System.out.print(" ");
        }
        System.out.println("Veuillez choisir une option:");
        System.out.println("1. Ajouter un article");
        System.out.println("2. Supprimer un article");
        System.out.println("3. Ajouter un client");
        System.out.println("4. Supprimer un client");
        System.out.println("5. Passer une commande");
        System.out.println("6. Annuler une commande");
        System.out.println("7. Afficher les articles");
        System.out.println("8. Afficher les clients");
        System.out.println("9. Afficher les commandes");
        System.out.println("10. Quitter");

        System.out.println();
        System.out.print(">>> ");
    }

    public static void choixUtilisateur(int option, Commerciale commerciale, Scanner scanner) {
        scanner.nextLine();
        switch (option) {
            case 1:
                System.out.println("Veillez entrer les informations de l'article: ");
                System.out.print("Référence: ");
                String reference = scanner.nextLine();
                System.out.print("Désignation: ");
                String designation = scanner.nextLine();
                System.out.print("Prix unitaire: ");
                double prixUnitaire = scanner.nextDouble();
                System.out.print("Quantité en stock: ");
                int quantiteStock = scanner.nextInt();

                Article article = new Article(reference, designation, prixUnitaire, quantiteStock);
                System.out.println("\nArticle ajouté avec succès: ");
                System.out.println("*******************");
                article.affiche();
                System.out.println("*******************");

                commerciale.ajouterArticle(article);
                break;
            case 2:
                System.out.println("Rentrez la référence de l'article à supprimer: ");
                String ref = scanner.nextLine();
                for (Article a : commerciale.articles) {
                    if (a.getReference().equals(ref)) {
                        System.out.println("Article supprimé avec succès");
                        commerciale.supprimerArticle(a);
                        break;
                    }
                }
                System.err.println("Article introuvable");
                break;
            case 3:
                System.out.println("Veiilez entrer les informations du client: ");
                System.out.print("Identité: ");
                int identite = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nom social: ");
                String nomSocial = scanner.nextLine();
                System.out.print("Adresse: ");
                String adresse = scanner.nextLine();
                System.out.print("Chiffre d'affaire: ");
                double chiffreAffaire = scanner.nextDouble();
        
                Client client = new Client(identite, nomSocial, adresse, chiffreAffaire);

                System.out.println("\nClient ajouté avec succès: ");
                System.out.println("*******************");
                client.affiche();
                System.out.println("*******************");

                commerciale.ajouterClient(client);
                
                break;
            case 4:
                System.out.println("Veillez entrer l'identité du client à supprimer: ");
                int id = scanner.nextInt();
                for (Client c : commerciale.clients) {
                    if (c.getIdentite() == id) {
                        commerciale.supprimerClient(c);
                        System.out.println("Client supprimé avec succès");
                        break;
                    }
                }
                System.out.println("Client introuvable");
                break;
            case 5:
                System.out.println("Rentrez le numéro de la commande: ");
                int numeroCommande = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Rentrez la date de la commande: ");
                String dateCommande = scanner.nextLine();
                System.out.println("Rentrez l'identité du client: ");
                int identiteClient = scanner.nextInt();
                Client clientC = null;
                for (Client c : commerciale.clients) {
                    if (c.getIdentite() == identiteClient) {
                        clientC = c;
                        break;
                    }
                }
                if (clientC == null) {
                    System.err.println("Client introuvable");
                    break;
                }
                Commande commande = new Commande(numeroCommande, dateCommande, clientC);
                System.out.println("Rentrez la référence de l'article: ");
                scanner.nextLine();
                String referenceArticle = scanner.nextLine();
                Article articleC = null;
                for (Article a : commerciale.articles) {
                    if (a.getReference().equals(referenceArticle)) {
                        articleC = a;
                        break;
                    }
                }
                if (articleC == null) {
                    System.err.println("Article introuvable");
                    break;
                }
                System.out.println("Rentrez la quantité de l'article: ");
                int quantiteCommande = scanner.nextInt();
                if (quantiteCommande > articleC.getQuantiteStock()) {
                    System.err.println("Quantité en stock insuffisante");
                    break;
                }
                Ligne ligne = new Ligne(commande, articleC, quantiteCommande);
                commerciale.lignes.add(ligne);
                commerciale.passerCommande(commande);
                System.out.println("Commande passée avec succès");
                break;
            case 6:
                System.out.println("Rentrez le numéro de la commande à annuler: ");
                int numCommande = scanner.nextInt();
                Commande commandeA = null;
                for (Commande c : commerciale.commandes) {
                    if (c.getNumeroCommande() == numCommande) {
                        commandeA = c;
                        break;
                    }
                }
                if (commandeA == null) {
                    System.err.println("Commande introuvable");
                    break;
                }
                commerciale.annulerCommande(commandeA);
                System.out.println("Commande annulée avec succès");
                break;
            case 7:
                for (Article a : commerciale.articles) {
                    System.out.println("*******************");
                    a.affiche();
                    System.out.println("*******************");
                }
                break;
            case 8:
                for (Client c : commerciale.clients) {
                    System.out.println("*******************");
                    c.affiche();
                    System.out.println("*******************");
                }
                break;
            case 9:
                for (Commande c : commerciale.commandes) {
                    System.out.println("*******************");
                    System.out.println(c.getDateCommande() + " -" + c.getNumeroCommande() + ": " + c.getClient().getNomSocial());
                    System.out.println("*******************");
                }
                break;
            case 0:
                System.out.println("Quitter");
                break;
            default:
                System.out.println("Option invalide");
                break;
        }
    }

}
