package jour07.job03_4;

public class RectangleColore extends Rectangle {
    protected int couleur;

    public RectangleColore(double x, double y, double longueur, double largeur, int couleur) {
        super(x, y, longueur, largeur);
        this.couleur = couleur;
    }
    
}
