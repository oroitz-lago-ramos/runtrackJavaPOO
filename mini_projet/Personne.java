package mini_projet;

public class Personne {
    private int identite;
    private String nomSocial;
    private String adresse;

    protected Personne(int identite, String nomSocial, String adresse) {
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }
    
    public int getIdentite() {
        return identite;
    }
    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public String getNomSocial() {
        return nomSocial;
    }
    public void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void affiche() {
        System.out.println("Identité: " + identite);
        System.out.println("Nom social: " + nomSocial);
        System.out.println("Adresse: " + adresse);
    }
}
