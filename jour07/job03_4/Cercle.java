package jour07.job03_4;

public class Cercle extends Figure{
    protected double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    public boolean isPointInside(double x, double y) {
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) <= Math.pow(rayon, 2);
    }


}
