public class App {
    public static final int LIBRE = 0;
    public static final int OCCUPEE = 1;
    public static final int TOUCHEE = 2;
    public static final int TAILLE_GRILLE = 20;
    public static final int NBRE_BATEAUX = 5;

    public static int choisirIndexAleatoire(int min, int max) {

    }

    public static int[] genererGrille(int taille, int nombre) {
        // 5.1. Créez un tableau avec la taille passée en paramètre.
        int[] grille = new int[taille];
        // 5.2. Déclarez une variable entière nommée nbreBateauxPlaces que vous
        // initialiserez avec la valeur 0.
        int nbreBateauxPlaces = 0;
        // 5.3. Tant que le nombre de bateaux placés est inférieur au nombre de bateaux
        // à placer :
        while (nbreBateauxPlaces < nombre) {

            // 5.3.1. Choisissez un index aléatoire dans la grille à l'aide de la méthode
            // choisirIndexAleatoire().
            int indexaleatoire = choisirIndexAleatoire(0, grille.length-1);
            // 5.3.2. Si le contenu de la cellule désignée par cet index est libre (le
            // contenu de la cellule est égal à LIBRE): mettez la valeur OCCUPEE dans cette
            // cellule et incrémentez la variable nbreBateauxPlaces
        }
    }

    public static boolean testerGrille(int[] testgrille) {

    }

    public static void main(String[] args) throws Exception {

    }
}
