public class devoir6 {

    static final int TAILLE_TABLEAU = 20;
    static final int VALEUR_MIN = 0;
    static final int VALEUR_MAX = 50;
    static final int VALEUR_RECHERCHEE = 7;

    // Méthode pour générer un tableau d'entiers aléatoires
    public static int[] genereTableau(int min, int max, int taille) {
        int[] tableau = new int[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min; // Génération d'un nombre entre min et max
        }
        return tableau;
    }

    // Méthode pour rechercher la valeur minimale dans le tableau
    public static int rechercheMin(int[] tableau) {
        int min = tableau[0]; // Initialiser min à la première valeur du tableau
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) { // Comparer chaque valeur pour trouver la plus petite
                min = tableau[i];
            }
        }
        return min;
    }

    // Méthode pour rechercher la valeur maximale dans le tableau
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0]; // Initialiser max à la première valeur du tableau
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) { // Comparer chaque valeur pour trouver la plus grande
                max = tableau[i];
            }
        }
        return max;
    }

    // Méthode pour rechercher une valeur dans le tableau
    public static int rechercheValeur(int[] tableau, int valeurRecherchee) {

        //RIF: attention la convention EMF demande un seul "return" par méthode
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                return i; // Retourner l'index de la valeur trouvée
            }
        }
        return -1; // Si la valeur n'est pas trouvée, retourner -1
    }

    // Méthode main
    public static void main(String[] args) {
        // Générer le tableau avec des valeurs aléatoires
        int[] tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);

        // Affichage du tableau
        System.out.println("Tableau:");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau[" + i + "] = [" + tableau[i] + "]");
        }

        // Recherche et affichage du minimum et du maximum
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);
        System.out.println("La plus grande valeur trouvée est : " + max);

        // Recherche de la valeur spécifiée et affichage de la position
        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);

        // RIF: ici le if/else ne modifie par ce qui sera affiché!
        if (position != -1) {
            System.out.println(
                    "Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + position + "] du tableau");
        } else {
            System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] est à la position [-1] du tableau");
        }
    }
}
