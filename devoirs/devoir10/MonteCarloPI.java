import java.util.Random;

public class MonteCarloPI {
    public static void main(String[] args) {
        final int NBRE_ESSAIS = 100000;
        int pointsVerts = 0;
        Random random = new Random();
        int compteur = 0;

        while (compteur++ < NBRE_ESSAIS) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            pointsVerts += (x * x + y * y <= 1) ? 1 : 0;
        }

        double pi = 4.0 * pointsVerts / NBRE_ESSAIS;
        System.out.println("pi = +- " + pi);
    }
}
