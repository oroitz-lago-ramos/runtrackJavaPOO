package jour07.job03_4;

public class Rectangle extends Figure {
    protected double longueur;
    protected double largeur;

    public Rectangle(double x, double y, double longueur, double largeur){
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Getters ------------------Setters

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface() {
        return longueur * largeur;
    }
}
