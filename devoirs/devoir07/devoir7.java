import java.util.Random;

public class devoir7 {

    public static final int TAILLE_TABLEAU = 10;
    public static final int MIN_NOMBRE = -8;
    public static final int MAX_NOMBRE = 8;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);

        System.out.println("Devoir 07 du module 319");
        System.out.println("---------------------------------------");
        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");

        System.out.print("Les deux premières/dernières valeurs sont : ");
        System.out.print("[" + tableau[0] + "][" + tableau[1] + "] ... ");
        System.out.println("[" + tableau[TAILLE_TABLEAU - 2] + "][" + tableau[TAILLE_TABLEAU - 1] + "]");

        int position = positionValeur(tableau, VALEUR_RECHERCHEE);

        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + position + " du tableau !");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " ne figure pas dans le tableau !");
        }

        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
    }

    public static int[] genererValeursAleatoires(int taille, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Le minimum ne peut pas être supérieur au maximum");
        }

        Random rand = new Random();
        int[] tableau = new int[taille];

        for (int i = 0; i < taille; i++) {
            tableau[i] = rand.nextInt(max - min + 1) + min;
        }
        return tableau;
    }

    public static int positionValeur(int[] tableau, int valeurRecherchee) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                return i;
            }
        }
        return -1;
    }
}